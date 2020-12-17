package extractor;

import org.w3c.dom.*;


import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.xml.sax.SAXException;
import collectionsObjects.CollectionObjects;
import roles.InformationHolder;
import roles.RoleStereotype;

public class MainExtractor {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(true);
		DocumentBuilder builder;
		Document doc = null;
		try {
			builder = domFactory.newDocumentBuilder();
			doc = builder.parse("./src/dataset/k9_roleStereotype.xml");
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		XPath xpath = XPathFactory.newInstance().newXPath();
		List<String> classes = extractClassNames(doc, xpath);
		HashMap<String, String> roleStereotypes = new HashMap<String, String>();
		for(int i = 0; i<classes.size(); i++) {
			roleStereotypes.put(classes.get(i), extractRoleStereotype(doc, xpath, classes.get(i)));
		}
		
		List <String> CO = extractCoordinator (doc, xpath);
		for (int i = CO.size()-1; i >= 0; i--) {
			CoSummarizer(doc, xpath, CO.get(i), roleStereotypes);
		}
		List <String> ST = extractStructurer (doc, xpath);
		for (int i = CO.size()-1; i >= 0; i--) {
			StSummarizer(doc, xpath, ST.get(i), roleStereotypes);
		}
		List <String> CT = extractController (doc, xpath);
		for (int i = CT.size()-1; i >= 0; i--) {
			CtSummarizer(doc, xpath, CT.get(i), roleStereotypes);
		}
		
		List <String> SP = extractServiceProvider (doc, xpath);
		for (int i = SP.size()-1; i >= 0; i--) {
			SPSummarizer(doc, xpath, SP.get(i), roleStereotypes);
		}
		List<String> IH = extractInformationHolder(doc, xpath);
		for (int i = 0; i < IH.size(); i++) {
			IHSummarizer(doc, xpath, IH.get(i));
		}
	}
	
	public static HashMap<String, Integer> sortByIntegerValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    }
	public static HashMap<String, String> sortByStringValue(HashMap<String, String> hm) 
	{ 
		// Create a list from elements of HashMap 
		List<Map.Entry<String, String> > list = 
				new LinkedList<Map.Entry<String, String> >(hm.entrySet()); 
		
		// Sort the list 
		Collections.sort(list, new Comparator<Map.Entry<String, String> >() { 
			public int compare(Map.Entry<String, String> o1,  
					Map.Entry<String, String> o2) 
			{ 
				return (o1.getValue()).compareTo(o2.getValue()); 
			} 
		}); 
		
		// put data from sorted list to hashmap  
		HashMap<String, String> temp = new LinkedHashMap<String, String>(); 
		for (Map.Entry<String, String> aa : list) { 
			temp.put(aa.getKey(), aa.getValue()); 
		} 
		return temp; 
	}
	
	private static void CtSummarizer (Document doc, XPath xpath, String className, HashMap<String, String> roleStereotypes) {
		System.out.println(className);
		RoleStereotype role = new RoleStereotype();
		role.setName(className);		
		List<String> methods= extractMethods(doc, xpath, className);
		List<String> declarations = extractDeclarations(doc, xpath, className);
		String template = "# " + className + "\n";
		template += "## This Controller is responsible for:\n";
		
		if(!declarations.isEmpty()) {
			HashMap <String, String> declarationRoles = new HashMap<String, String> ();
			for(int i = 0; i<declarations.size(); i++) {
				declarationRoles.put(declarations.get(i), roleStereotypes.get(declarations.get(i)));
			}
			HashMap <String, String> sortedDeclarationRoles =  sortByStringValue(declarationRoles);
//			declarationRoles.get(declaration) returns the rolsStereotype of the declared object. we call the method replaceAll to delete
//			the space eg. Inforamtion Holder --> InformationHolder. In this we can the path to the text summaries of the declared object.
//			eg. assuming the declared object is Account and it is an Information Holder the path to the summary file of the Account class is
//			../InformationHolders/Account.md
			for(String declaration : sortedDeclarationRoles.keySet()) {
				template += "* [" + declaration + "](../" + sortedDeclarationRoles.get(declaration).replaceAll("\\s+", "")
				+ "s/" + declaration + ".md)" + " (" + sortedDeclarationRoles.get(declaration) + ")\n";
			}
		}
		HashMap <String, Integer> tasksTemplate = new HashMap<String, Integer>();
		for(int i = 0; i < methods.size(); i++) {
			//extract method body
			String expr = "//class[name='"+className+"']/block/function[name='"+methods.get(i)+"']";
			NodeList methodNodes = xpathExecuter(doc, xpath, expr);
			for(int j = 0; j<methodNodes.getLength(); j++) {
				int com =  calCom(doc, xpath, methodNodes.item(j));
//				if com == 1 there is no conditions statements in the method -> there is only one execution path. 
//				e.g. getter/setter
				if(com>1) {
					tasksTemplate.put(methods.get(i) + extractMethodParameters(doc, xpath, className, methods.get(i)), com);
				}
			}
		}
		HashMap <String, Integer> sortedTaskTemplate = sortByIntegerValue(tasksTemplate); //we sort the methods by complexity
		ArrayList<String> keys = new ArrayList<String>(sortedTaskTemplate.keySet()); // save the keys to a list to get the most 5 complex methods.
		if(tasksTemplate.size()>0) {
			template += "### controlling tasks with the following methods \n";
			for(int i = keys.size()-1; i>=keys.size()-5 && i>=0; i--) {
				template += "* " + keys.get(i) + "\n";
			}
		}
		
		if(!declarations.isEmpty() | !tasksTemplate.isEmpty()) {		
			try {
				File file = new File("./src/Controllers/" + className + ".md");
				file.createNewFile();
				      if (file.createNewFile()) {
				        System.out.println("File created: " + file.getName());
				      } else {
				        System.out.println("File already exists.");
				      }
			} catch (IOException e) {
				      System.out.println("An error occurred.");
				e.printStackTrace();
			}
			
			try {
				FileWriter templateWriter = new FileWriter("./src/Controllers/" + className + ".md");
				templateWriter.write(template);
				templateWriter.close();
				      System.out.println(className);
				      System.out.println("Successfully wrote to the file.");
			} catch (IOException e) {
				      System.out.println("An error occurred.");
				e.printStackTrace();
			}
		}		
	}
	
private static void StSummarizer(Document doc, XPath xpath, String className, HashMap<String, String> roleStereotypes) {
			RoleStereotype role = new RoleStereotype();
			role.setAttributes(extractAttributes(doc, xpath, className));
			role.setComponentClasses(extractComponentClasses(doc, xpath, role));
			role.setParentClasses(extractParentClasses(doc, xpath, className));
			role.setImplementedInterfaces(extractImplementedInterfaces(doc, xpath, className));
			role.setMethods(extractMethods(doc, xpath, className));
			List<String> parents = role.getParentClasses();
			List<String> implementedInterfaces = role.getImplementedInterfaces();
			HashMap<String, String> componentObjects = role.getComponentClasses();
			List<String> cMethods = getCollectionManipulatingMethods(doc, xpath, className);
			String template = "# " + className + "\n";
			template += "## This Structurer is responsible for:\n";
			if (parents.size() > 0) {
				template += "### inheriting the following classes:\n";
				for (int i = 0; i < parents.size(); i++) {
					System.out.println(parents.get(i));
					String parent = roleStereotypes.get(parents.get(i));
	
					if (parent != null) {
						String roleStereotype = extractRoleStereotype(doc, xpath, parent);
						template += "* [" + parent + "](../" + roleStereotype.replaceAll("\\s+", "") + "s/" + parent
								+ ".md)\n";
					}else {
						template += "* " + parents.get(i) + "\n";
					}
				}
			}
			if (implementedInterfaces.size() > 0) {
				template += "### implementing the following interfaces:\n";
				for (int i = 0; i < implementedInterfaces.size(); i++) {
					String implementedInterface = extractObjectName(doc, xpath, implementedInterfaces.get(i));
					if (implementedInterface != null) {
						String roleStereotype = roleStereotypes.get(implementedInterface);
						template += "* [" + implementedInterface + "](../" + roleStereotype.replaceAll("\\s+", "") + "s/"
								+ implementedInterface + ".md) \n";
					} else {
						template += "* " + implementedInterfaces.get(i) + "\n";
					}
				}
			}
			if (componentObjects.size() > 0) {
				template += "### managing the relationships between the following objects as components:\n";
				for (String object : componentObjects.keySet()) {
					String roleStereotype = roleStereotypes.get(componentObjects.get(object));
					if (!template.contains(componentObjects.get(object) + "\n"))
						template += "* [" + componentObjects.get(object) + "](../" + roleStereotype.replaceAll("\\s+", "")
								+ "s/" + componentObjects.get(object) + ".md) \n";
	
				}
			}
			if (!cMethods.isEmpty()) {
				template += "### Maintaining relatiohships between objects through the following methods: \n";
				for (int i = 0; i < cMethods.size(); i++) {
					template += "* " + cMethods.get(i) + "\n";
				}
			}

	//		this condition to avoid printing the template string without summarization
	//		otherwise it will only print the string in line 240 for some classes that 
	//		does not proceed the conditions in lines 248, 269, 283 and 293
			if (!parents.isEmpty() | !implementedInterfaces.isEmpty() | !componentObjects.isEmpty() | !cMethods.isEmpty()) {
				try {
					File file = new File("./src/Structurers/" + className + ".md");
					file.createNewFile();
				      if (file.createNewFile()) {
				        System.out.println("File created: " + file.getName());
				      } else {
				        System.out.println("File already exists.");
				      }
				} catch (IOException e) {
				      System.out.println("An error occurred.");
					e.printStackTrace();
				}
	
				try {
					FileWriter templateWriter = new FileWriter("./src/Structurers/" + className + ".md");
					templateWriter.write(template);
					templateWriter.close();
				      System.out.println(className);
				      System.out.println("Successfully wrote to the file.");
				} catch (IOException e) {
				      System.out.println("An error occurred.");
					e.printStackTrace();
				}
			}
				System.out.println(template);
		}
	private static void CoSummarizer(Document doc, XPath xpath, String className, HashMap<String, String> roleStereotypes) {
			// TODO Auto-generated method stub
	//		System.out.println("I am in Co Summarizer");
			System.out.println(className);
			RoleStereotype role = new RoleStereotype();
			role.setName(className);
			role.setAttributes(extractAttributes(doc, xpath, className));
			role.setComponentClasses(extractComponentClasses(doc, xpath, role));
			role.setMethods(extractMethods(doc, xpath, className));
			role.setDeclarations(extractUsedObjectsInMethods(doc, xpath, role));
			role.setCustomerClasses(extractConsumerClasses(doc, xpath, role));
			String template = "# " + className + "\n";
			template += "### This Coordinator is responsible for delegating work between the following objects: \n";
			List<String> methodTemplates = new ArrayList<String>();
			HashMap<String, List<String>> customerClasses = role.getCustomerClasses();
			for (String method : customerClasses.keySet()) {
				List<String> methodInvokes = customerClasses.get(method);
				HashMap<String, List<String>> declarations = role.getDeclarations();
				List<String> usedObjects = declarations.get(method);
				if (methodInvokes.size() == 0 || usedObjects.size() == 0) {
					continue;
				} else {
					for (int i = 0; i < methodInvokes.size(); i++) {
						String roleStereotype = roleStereotypes.get(methodInvokes.get(i));
						if (!template.contains(methodInvokes.get(i) + "\n") & roleStereotype!=null)
							template += "* [" + methodInvokes.get(i) + "](../" + roleStereotype.replaceAll("\\s+", "")
									+ "s/" + methodInvokes.get(i) + ".md)"  + " has a role type of " + roleStereotype +  "\n";
						else if(!template.contains(methodInvokes.get(i)))
							template += "* " + methodInvokes.get(i) + "\n";
	
					}
					for (int i = 0; i < usedObjects.size(); i++) {
						String roleStereotype = roleStereotypes.get(usedObjects.get(i));
						if (!template.contains(usedObjects.get(i) + "\n")& roleStereotype!=null)
							template += "* [" + usedObjects.get(i) + "](../" + roleStereotype.replaceAll("\\s+", "") + "s/"
									+ usedObjects.get(i) + ".md)" + " has a role type of " + roleStereotype + "\n";
						else if(!template.contains(usedObjects.get(i)))
							template += "* " + methodInvokes.get(i) + "\n";
					}
				}
			}
			for (String method : customerClasses.keySet()) {
				String methodTemplate = "";
				List<String> methodInvokes = customerClasses.get(method);
				HashMap<String, List<String>> declarations = role.getDeclarations();
				List<String> usedObjects = declarations.get(method);
				if (methodInvokes.size() == 0 || usedObjects.size() == 0) {
					continue;
				} else {
					methodTemplate += "### the " + method + " method receives requests from:\n";
					for (int i = 0; i < methodInvokes.size(); i++) {
						String roleStereotype = roleStereotypes.get(methodInvokes.get(i));
						if (roleStereotype!=null)
							methodTemplate += "* [" + methodInvokes.get(i) + "](../" + roleStereotype.replaceAll("\\s+", "")
								+ "s/" + methodInvokes.get(i) + ".md) \n";
						else
							methodTemplate += "* " + methodInvokes.get(i) +" \n";
					}
					methodTemplate += "### and delegate the request to: \n";
					for (int i = 0; i < usedObjects.size(); i++) {
						String roleStereotype = extractRoleStereotype(doc, xpath, usedObjects.get(i));
						if (roleStereotype!=null)
							methodTemplate += "* [" + usedObjects.get(i) + "](../" + roleStereotype.replaceAll("\\s+", "")
								+ "s/" + usedObjects.get(i) + ".md) \n";
						else
							methodTemplate += "* " + usedObjects.get(i) +" \n";
					}
				}
				methodTemplate += "\n\n";
				methodTemplates.add(methodTemplate);
			}
			if (methodTemplates.size() > 0) {
				try {
					File file = new File("./src/Coordinators/" + className + ".md");
					file.createNewFile();
				      if (file.createNewFile()) {
				        System.out.println("File created: " + file.getName());
				      } else {
				        System.out.println("File already exists.");
				      }
				} catch (IOException e) {
				      System.out.println("An error occurred.");
					e.printStackTrace();
				}
	
				try {
					FileWriter templateWriter = new FileWriter("./src/Coordinators/" + className + ".md");
					templateWriter.write(template);
					for (int i = 0; i < methodTemplates.size(); i++) {
						templateWriter.write(methodTemplates.get(i));
					}
					templateWriter.close();
				      System.out.println(className);
				      System.out.println("Successfully wrote to the file.");
				} catch (IOException e) {
				      System.out.println("An error occurred.");
					e.printStackTrace();
				}
			}
		}
	private static void IHSummarizer(Document doc, XPath xpath, String className) {
			System.out.println(className);
			InformationHolder role = new InformationHolder();
			role.setName(className);
			role.setAttributes(extractAttributes(doc, xpath, className));
			String template = "# " + className + "\n";
			template += "## This Information Holder is responsible for:\n";
			HashMap<String, String> attributes = extractAttributes(doc, xpath, className);
			List<String> serializables = extractSerializableMethods(doc, xpath, className); 
			List<String> dbMethods = extractDatabaseMethods(doc, xpath, className);
			List<String> consumerObjects = extractDeclarations(doc, xpath, className);
			if (!attributes.isEmpty()) {
				template += "### providing and holding information about: \n";
				for (String attribute : attributes.keySet()) {
					template += "* " + attribute + "\n";
				}
			}
			if (!serializables.isEmpty()) {
				template += "### Serialization of objects throught the following methods:\n";
				for (int i = 0; i < serializables.size(); i++) {
					template += "* " + serializables.get(i) + "\n";
				}
			}
			if (!dbMethods.isEmpty()) {
				template += "### Managing database tasks through the following methods:\n";
				for (int i = 0; i < dbMethods.size(); i++) {
					template += "* " + dbMethods.get(i) + "\n";
				}
			}
			if (!consumerObjects.isEmpty()) {
				template += "### Providing information to the following objects \n";
				String consumerTemplate = "";
				for(int i = 0; i<consumerObjects.size(); i++) {
					String consumerObject = consumerObjects.get(i);
					if(!consumerTemplate.contains(consumerObject)) {
						String roleStereotype = extractRoleStereotype(doc, xpath, consumerObject);
						if(roleStereotype != null)
							consumerTemplate += "* [" + consumerObject + "](../" + roleStereotype.replaceAll("\\s+", "")
							+ "s/" + consumerObject + ".md)" + " has a role type of " + roleStereotype + "\n";
					}
				}
				template += consumerTemplate;
			}
			if (!attributes.isEmpty() | !serializables.isEmpty() | !dbMethods.isEmpty() | !consumerObjects.isEmpty()) {
				try {
					File file = new File("./src/InformationHolders/" + className + ".md");
					file.createNewFile();
				      if (file.createNewFile()) {
				        System.out.println("File created: " + file.getName());
				      } else {
				        System.out.println("File already exists.");
				      }
				} catch (IOException e) {
				      System.out.println("An error occurred.");
					e.printStackTrace();
				}
	
				try {
					FileWriter templateWriter = new FileWriter("./src/InformationHolders/" + className + ".md");
					templateWriter.write(template);
					templateWriter.close();
				      System.out.println(className);
				      System.out.println("Successfully wrote to the file.");
				} catch (IOException e) {
				      System.out.println("An error occurred.");
					e.printStackTrace();
				}
			}
		}
	
	private static void SPSummarizer(Document doc, XPath xpath, String className, HashMap<String, String> roleStereotypes) {
			System.out.println(className);
			RoleStereotype role = new RoleStereotype();
			role.setName(className);
			role.setMethods(extractMethods(doc, xpath, className));
			List<String> methods = role.getMethods(); //17
			HashMap <String, List<String>> consumers = extractConsumerClasses(doc, xpath, role); //12
			List<String> configFeatures = extractConfigurationFeatures(doc, xpath, className); //3
			List <String> serviceFeatures = new ArrayList<String>(methods);
			serviceFeatures.removeAll(configFeatures);		
			String template = "# " + className + "\n";
			template += "## This Service Provider is responsible for:\n";
			
	//		generating the service features
			if(!serviceFeatures.isEmpty()) {
				List <String> serviceTemplates = new ArrayList<String>();
				for(int i = 0; i<serviceFeatures.size(); i++) {
					if(serviceFeatures.get(i).equals("toString") | serviceFeatures.get(i).equals("toArray")) {
						continue;
					}
					List<String> serviceConsumer = consumers.get(serviceFeatures.get(i)); 
					if(!serviceConsumer.isEmpty()) {
						String serviceTemplate = "";
						String parameters = extractMethodParameters(doc, xpath, className, serviceFeatures.get(i));
						serviceTemplate += "* "+ serviceFeatures.get(i)+ parameters +"\n";
						for(int j = 0; j<serviceConsumer.size(); j++) {
							String roleStereotype = roleStereotypes.get(serviceConsumer.get(j)); 
	//								extractRoleStereotype(doc, xpath, );
							if(roleStereotype!=null) {
								serviceTemplate += "	* [" + serviceConsumer.get(j) + "](../" + roleStereotype.replaceAll("\\s+", "")
								+ "s/" + serviceConsumer.get(j) + ".md)" + " has a role type of " + roleStereotype + "\n";
							}
							else {
								serviceTemplate += "	* " + serviceConsumer.get(j) + "\n";
							}
						}
						serviceTemplates.add(serviceTemplate);
					}
				}
				if(!serviceTemplates.isEmpty())
					template += "### Providing services to other objects. "
							+ "List of services and corresponding consumer objects: \n";
					for(int i = 0; i<serviceTemplates.size(); i++) {
						template += serviceTemplates.get(i);
					}
			}
			
	//		generating the the configuration features
			if(!configFeatures.isEmpty()) {
				template += "### Offering configuration features to other object. "
						+ "List of configuratios features and corresponding consumer objects: \n";
				for(int i = 0; i<configFeatures.size(); i++) {
					List<String> featureConsumer = consumers.get(configFeatures.get(i));
					if(featureConsumer!=null) {
						String parameters = extractMethodParameters(doc, xpath, className, configFeatures.get(i));
						template += "* "+ configFeatures.get(i)+ parameters +"\n";
						for(int j = 0; j<featureConsumer.size(); j++) {
							String roleStereotype = roleStereotypes.get(featureConsumer.get(j)); 
							if(roleStereotype!=null) {
								template += "	* [" + featureConsumer.get(j) + "](../" + roleStereotype.replaceAll("\\s+", "")
								+ "s/" + featureConsumer.get(j) + ".md)" + " has a role type of " + roleStereotype + "\n";
							}
							else {
								template += "	* " + featureConsumer.get(j) + "\n";
							}
						}
					}
				}
			}
			
			if(!configFeatures.isEmpty() | !serviceFeatures.isEmpty()) {			
				try {
					File file = new File("./src/ServiceProviders/" + className + ".md");
					file.createNewFile();
				      if (file.createNewFile()) {
				        System.out.println("File created: " + file.getName());
				      } else {
				        System.out.println("File already exists.");
				      }
				} catch (IOException e) {
				      System.out.println("An error occurred.");
					e.printStackTrace();
				}
	
				try {
					FileWriter templateWriter = new FileWriter("./src/ServiceProviders/" + className + ".md");
					templateWriter.write(template);
					templateWriter.close();
				      System.out.println(className);
				      System.out.println("Successfully wrote to the file.");
				} catch (IOException e) {
				      System.out.println("An error occurred.");
					e.printStackTrace();
				}
			}
		}
	//	Calculating the complexity of a method according to McCabe's Cyclomatic Complexity
	private static int calCom (Document doc, XPath xpath, Node method) {
			NodeList nodes = null;
			try {
				String expr = "//block/*//return |"
						+ "//function/block//if | "
						+ "//function/block//ifelse | "
						+ "//function/block//else | "
						+ "//function/block//case | "
						+ "//function/block//default | "
						+ "//function/block//for | "
						+ "//function/block//while | "
						+ "//function/block//do | "
						+ "//function/block//break | "
						+ "//function/block//continue | "
						+ "//function/block//catch | "
						+ "//function/block//finally | "
						+ "//function/block//throw | "
						+ "//function/block//throws";
				nodes = (NodeList) xpath.compile(expr).evaluate(method, XPathConstants.NODESET);		
			}catch (XPathExpressionException e) {
				e.printStackTrace();
			}
			int operCount = getNumOperators(doc, xpath, method); 
	//		return nodes.getLength()+
	//				+ "//block//*[operator='&amp;&amp;']";
			return nodes.getLength() + operCount + 1;
		}
//	Counting the number of operators in the method body
	private static int getNumOperators(Document doc, XPath xpath, Node method) {
		// TODO Auto-generated method stub
		NodeList nodes = null;
		try {
			String expr = "//function/block//operator";
			nodes = (NodeList) xpath.compile(expr).evaluate(method, XPathConstants.NODESET);
		}catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		int operCount = 0;
		for(int i = 0; i<nodes.getLength(); i++) {
			if(nodes.item(i).getTextContent().equals("&amp;&amp;") || 
					nodes.item(i).getTextContent().equals("||") || 
					nodes.item(i).getTextContent().contains("?")) {				
				operCount++;
			}
				
		}
		return operCount;
	}
	
//	private static List <String> extractServiceFeatures(List<String> configFeatures, List<String> methods) {
//		// TODO Auto-generated method stub
//		System.out.println(configFeatures.size());
//		System.out.println(methods.size());
//		List<String> services = new ArrayList<String>();
//		for(int i = 0; i<methods.size(); i++) {
//			System.out.println(i);
//			for(int j = 0; j<configFeatures.size(); j++) {
//				if(methods.get(i).equals(configFeatures.get(j)))
//					methods.remove(methods.get(i));
//				System.out.println("length after removing "+methods.size());
//			}
//		}
//		return methods;
//	}
	
	private static List<String> extractConfigurationFeatures(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		save the result to hashMap to avoid redundancy
		List<String> configurations = new ArrayList<String>();
//		extract final attributes.
		try {
//			extracting the final attributes of the class
			String exprFinals = "//class[name='"+ className +"']/block/decl_stmt/decl/type[specifier='final']/following-sibling::name | "
					+ "//interface[name='"+ className +"']/block/decl_stmt/decl/type[specifier='final']/following-sibling::name | "
							+ "//enum[name='"+ className +"']/block/decl_stmt/decl/type[specifier='final']/following-sibling::name";
			NodeList finals = (NodeList) xpath.compile(exprFinals).evaluate(doc, XPathConstants.NODESET);
			String exprMethods = "//class[name='"+ className+"']/block/function | "
								+ "//enum[name='"+ className+"']/block/function | "
								+ "//interface[name='"+ className+"']/block/function";
			NodeList methods = (NodeList) xpath.compile(exprMethods).evaluate(doc, XPathConstants.NODESET);
			for(int i = 0; i< methods.getLength(); i++) {
				Node method = methods.item(i);
				for(int j = 0; j<finals.getLength(); j++) {
//					if(finals.item(i)!=null) {	
						String finalAttribute = finals.item(j).getTextContent();
						// check if the method uses a final variable of the same class
						if(method.getTextContent().contains(finalAttribute)) {						
							NodeList childNodes = method.getChildNodes();
	//						extract the method name from the method body 
							for(int k = 0; k<childNodes.getLength(); k++) {
								if(childNodes.item(k).getNodeName().equals("name")) {						
									String methodName = childNodes.item(k).getTextContent();
									configurations.add(methodName);
								}
							}
						}
//					}
				}
			}
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		
		return configurations;
	}
	
	private static List<String> extractDatabaseMethods(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
		List<String> databaseMethods = new ArrayList<String>();
		String expr = "//class[name='" + className + "']/block/function | " + "//interface[name='" + className
				+ "']/block/function | " + "//enum[name='" + className + "']/block/function";
		NodeList methods = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < methods.getLength(); i++) {
			if (methods.item(i).getTextContent().toLowerCase().contains("sql")
					| methods.item(i).getTextContent().toLowerCase().contains("db")
					| methods.item(i).getTextContent().toLowerCase().contains("database")
					| methods.item(i).getTextContent().toLowerCase().contains("mongo")) {
				NodeList childNodes = methods.item(i).getChildNodes();
				for (int j = 0; j < childNodes.getLength(); j++) {
					if (childNodes.item(j).getNodeName().equals("name"))
						databaseMethods
								.add(childNodes.item(j).getTextContent() + childNodes.item(j + 1).getTextContent());
				}
			}
		}
		return databaseMethods;
	}

	private static List<String> extractSerializableMethods(Document doc, XPath xpath, String className) {
//		list to hold a signatures of the overriden functions in the given className;
		List<String> serializableMethods = new ArrayList<String>();
		String expr = "//class[name='" + className + "']/super/implements[name='Serializable']/ancestor::class/block"
				+ "/function[annotation/name='Override']/type/following-sibling::*[not(self::block)] | "
				+ "//class[name='" + className + "']/super/implements[name='Parcelable']/ancestor::class/block"
				+ "/function[annotation/name='Override']/type/following-sibling::*[not(self::block)]";
		NodeList methods = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < methods.getLength(); i++) {
			serializableMethods.add(methods.item(i).getTextContent());
		}
		return serializableMethods;
	}

	private static String extractObjectName(Document doc, XPath xpath, String name) {
		if (isClass(doc, xpath, name))
			return name;
		else if (name.contains("<")) {
			if (isClass(doc, xpath, name.substring(name.indexOf("<") + 1, name.indexOf(">")))) {
				return name.substring(name.indexOf("<") + 1, name.indexOf(">"));
			} else if (isClass(doc, xpath, name.substring(0, name.indexOf("<")))) {
				return name.substring(0, name.indexOf("<"));
			}
		}
		return null;
	}

	private static List<String> getCollectionManipulatingMethods(Document doc, XPath xpath, String className) {
		List<String> methods = new ArrayList<String>();
		String expr = "//class[name='" + className + "']/block/function";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < nodes.getLength(); i++) {
			if (containCollectionObject(nodes.item(i).getTextContent())) {
				NodeList childNodes = nodes.item(i).getChildNodes();
				for (int j = 0; j < childNodes.getLength(); j++) {
					if (childNodes.item(j).getNodeName().equals("name"))
						methods.add(childNodes.item(j).getTextContent() + childNodes.item(j + 1).getTextContent());
				}
			}
		}
		return methods;
	}

	private static boolean containCollectionObject(String methodBody) {
		for (CollectionObjects cObject : CollectionObjects.values()) {
			if (methodBody.contains(cObject.name())) {
				return true;
			}
		}
		return false;
	}
	
//	returns a list of initiate an object of class (className) passed as parameter.
	private static List <String> extractDeclarations(Document doc, XPath xpath, String className){
		NodeList classes = null;
		List <String> declarations = new ArrayList<String>();
		try {
			String expr= "//class | //interface | //enum";
			classes = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		for (int i =0; i<classes.getLength(); i++) {
				if (classes.item(i).getTextContent().contains(" "+className+" ")) {		
					NodeList childNodes = classes.item(i).getChildNodes();
					for(int j = 0; j<childNodes.getLength(); j++) {
						Node childNode = childNodes.item(j);
						if (childNode.getNodeName().equals("name") && !className.equals(childNode.getTextContent())) {								
//							System.out.println(className +" is declared in "+ childNode.getTextContent());
							declarations.add(childNode.getTextContent());
						}
				}
			}
		}
	return declarations;
}

	//	returns a hashmap where the key is a method name and the value is a list of objects that calls the key method.
		private static HashMap<String, List<String>> extractConsumerClasses(Document doc, XPath xpath,
	
				RoleStereotype role) {
			// the class is a component.
			// method is imported directly to the unit.
			// the class is imported.
	
			// TODO Auto-generated method stub
	//		System.out.println("extractConsumerClasses has been accessed");
			HashMap<String, List<String>> methodInvokes = new HashMap<String, List<String>>();
			List<String> methods = role.getMethods();
			for (int i = 0; i < methods.size(); i++) {
				String expr = "//unit/class/block//*[name='" + methods.get(i) + "']/ancestor::class/name[not(*)] | "
						+ "//unit/class/block//*[name='" + methods.get(i) + "']/ancestor::class/name/name | "
						+ "//unit/enum/block//*[name='" + methods.get(i) + "']/ancestor::enum/name[not(*)] | "
						+ "//unit/enum/block//*[name='" + methods.get(i) + "']/ancestor::enum/name/name | "
						+ "//unit/interface/block//*[name='" + methods.get(i) + "']/ancestor::interface/name[not(*)] | "
						+ "//unit/interface/block//*[name='" + methods.get(i) + "']/ancestor::interface/name/name";
				NodeList nodes = xpathExecuter(doc, xpath, expr);
				List<String> consumerClasses = new ArrayList<String>();
	//			System.out.println(methods.get(i));
				for (int j = 0; j < nodes.getLength(); j++) {
					consumerClasses.add(nodes.item(j).getTextContent());
				}
				methodInvokes.put(methods.get(i), consumerClasses);
			}
			return methodInvokes;
		}
//	private static HashMap<String, String> extractImports(Document doc, XPath xpath, String className) {
//		// TODO Auto-generated method stub
////		System.out.println("extractImports has been accessed");
//		HashMap<String, String> imports = new HashMap<String, String>();
//		String expr = "//unit/class[name='" + className + "']/preceding-sibling/import/name";
//		NodeList nodes = xpathExecuter(doc, xpath, expr);
//		for (int i = 0; i < nodes.getLength(); i++) {
//			NodeList childNodes = nodes.item(i).getChildNodes();
//			for (int j = 0; j < childNodes.getLength(); j++) {
//				if (isClass(doc, xpath, childNodes.item(j).getTextContent())) {
//					if (j + 1 < nodes.getLength()) {
//						imports.put(childNodes.item(j + 1).getTextContent(), childNodes.item(j).getTextContent());
//					} else {
//						imports.put(childNodes.item(j).getTextContent(), null);
//					}
//				}
//			}
//		}
//		return imports;
//	}

	private static List<String> extractMethodArgument(Document doc, XPath xpath, String className, String methodName) {
//		System.out.println("extractMethodArgument has been accessed");
		List<String> argument = new ArrayList<String>();
		String expr = "//class[name='" + className + "']/block/function[name='" + methodName + "']"
				+ "/parameter_list/parameter/decl/name | " + "//interface[name='" + className
				+ "']/block/function[name='" + methodName + "']" + "/parameter_list/parameter/decl/name | "
				+ "//enum[name='" + className + "']/block/function[name='" + methodName + "']"
				+ "/parameter_list/parameter/decl/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < nodes.getLength(); i++) {
			String parameter = nodes.item(i).getTextContent();
			String parameterType = extractParameterType(doc, xpath, className, methodName, parameter);
			if (isClass(doc, xpath, parameterType))
				argument.add(parameterType);
		}
		return argument;
	}

	/*
	 * returns type of the parameter name for a given method name and class name
	 */
	private static String extractParameterType(Document doc, XPath xpath, String className, String methodName,
			String parameter) {
//		System.out.println("extractParameterType has been accessed");
		// TODO Auto-generated method stub
		String type = "";
		String expr = "//class[name='" + className + "']/block/function[name='" + methodName + "']"
				+ "/parameter_list/parameter/decl[name='" + parameter + "']/type/name | " + "//interface[name='"
				+ className + "']/block/function[name='" + methodName + "']" + "/parameter_list/parameter/decl[name='"
				+ parameter + "']/type/name |" + "//enum[name='" + className + "']/block/function[name='" + methodName
				+ "']" + "/parameter_list/parameter/decl[name='" + parameter + "']/type/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < nodes.getLength(); i++) {
			type = nodes.item(i).getTextContent();
		}
		return type;
	}

	/*
	 * scenarios where an object could be used: Objects passed in method argument.
	 * using a variable of this.class declaring a new object using variables
	 * imported directly into the class A hashmap that stores the methods of the
	 * class and corresponding used objects within the method body.
	 * 
	 * 
	 * returns a list of used objects in methods of a the given class
	 */
	private static HashMap<String, List<String>> extractUsedObjectsInMethods(Document doc, XPath xpath,
			RoleStereotype role) {
		// TODO Auto-generated method stub
//		System.out.println("extractusedObjectsInMethods has been accessed");
		String className = role.getName();
		// list to store the retrieved methods of the class
		List<String> methods = role.getMethods();
		// Hashmap to save the retrieved attributed of the class.
		HashMap<String, List<String>> declarations = new HashMap<String, List<String>>();
		for (int i = 0; i < methods.size(); i++) {
			String methodName = methods.get(i);
			// extract objects passed in method argument.
			// HashMap to store the argument of methods.get(i)
			List<String> argument = extractMethodArgument(doc, xpath, className, methodName);
			// using variables of this.class
			List<String> usedVariables = extractUsedComponentObject(doc, xpath, role, methodName);
			// declaring a new object
			List<String> declaredObjects = extractDeclaredObjectsInMethods(doc, xpath, role, methodName);
			// using variables imported directly into the class
//			System.out.println("method: "+methodName);
			List<String> importedVariables = extractImportedVariables(doc, xpath, role, methodName);
			List<String> allDeclarations = new ArrayList<String>();
			if (argument.size() > 0)
				allDeclarations = Stream.concat(argument.stream(), allDeclarations.stream())
						.collect(Collectors.toList());
			if (usedVariables.size() > 0)
				allDeclarations = Stream.concat(usedVariables.stream(), allDeclarations.stream())
						.collect(Collectors.toList());
			if (declaredObjects.size() > 0)
				allDeclarations = Stream.concat(declaredObjects.stream(), allDeclarations.stream())
						.collect(Collectors.toList());
			if (importedVariables.size() > 0)
				allDeclarations = Stream.concat(importedVariables.stream(), allDeclarations.stream())
						.collect(Collectors.toList());
			declarations.put(methodName, allDeclarations);
		}
		return declarations;
	}	

	private static List<String> extractImportedVariables(Document doc, XPath xpath, RoleStereotype role,
			String methodName) {
		// TODO Auto-generated method stub
//	System.out.println("extractImportedVariables has been accessed");
		HashMap<String, String> imports = role.getImports();
		if (imports.size() == 0) {
			return new ArrayList<String>();
		}
		List<String> usedImports = new ArrayList<String>();
		String className = role.getName();
		String expr = "//class[name = '" + className + "']/block/function[name='" + methodName
				+ "']/block/block_content";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < nodes.getLength(); i++) {
			for (String importVariable : imports.keySet()) {
				if (nodes.item(i).getTextContent().contains(importVariable))
					usedImports.add(imports.get(importVariable));
			}
		}
		return usedImports;
	}

	private static List<String> extractDeclaredObjectsInMethods(Document doc, XPath xpath, RoleStereotype role,
			String methodName) {
		// TODO Auto-generated method stub
//	System.out.println("extractDeclaredObjectsInMethods has been accessed");
		List<String> declaredObjects = new ArrayList<String>();
		String className = role.getName();
		String expr = "//class[name = '" + className + "']/block/function[name='" + methodName
				+ "']/block/block_content//decl_stmt/decl/type/name";
		NodeList type = xpathExecuter(doc, xpath, expr);
		for (int j = 0; j < type.getLength(); j++) {
//			System.out.println(type.item(j).getTextContent()+" "+object);
			if (isClass(doc, xpath, type.item(j).getTextContent())) {
				declaredObjects.add(type.item(j).getTextContent());
			}
		}
		return declaredObjects;
	}

	private static List<String> extractUsedComponentObject(Document doc, XPath xpath, RoleStereotype role,
			String methodName) {
		// TODO Auto-generated method stub
//	System.out.println("extractUsedComponentObject has been accessed");
		List<String> usedVariables = new ArrayList<String>();
		String className = role.getName();
		HashMap<String, String> components = role.getComponentClasses();
		String expr = "//class[name='" + className + "']/block/function[name='" + methodName + "']/block/block_content";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < nodes.getLength(); i++) {
			for (String component : components.keySet()) {
				if (nodes.item(i).getTextContent().contains(component)) {
					usedVariables.add(components.get(component));
				}
			}
		}
		return usedVariables;
	}

	private static List<String> extractMethods(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractMethods has been accessed");
		List<String> methods = new ArrayList<String>();
		String expr = "//class[name='" + className + "']/block/function/name | " + "//interface[name='" + className
				+ "']/block/function/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < nodes.getLength(); i++) {
			String name = nodes.item(i).getTextContent();
			methods.add(name);
		}
		return methods;
	}

	private static String extractMethodParameters(Document doc, XPath xpath, String className,
			String method) {
		// TODO Auto-generated method stub
//		System.out.println("extractMethod Parameters has been accessed");
		String expr = "//class[name='" + className + "']/block/function[name='" + method + "']/parameter_list | "
				+ "//enum[name='" + className + "']/block/function[name='" + method + "']/parameter_list | " 
				+ "//interface[name='" + className + "']/block/function[name='" + method + "']/parameter_list";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		String parameters = "";
		for (int i = 0; i < nodes.getLength(); i++) {
			parameters = nodes.item(i).getTextContent();
		}
		return parameters;
	}

	private static HashMap<String, String> extractComponentClasses(Document doc, XPath xpath, RoleStereotype role) {
		// TODO Auto-generated method stub
//		System.out.println("extractComponentClasses has been accessed");
		HashMap<String, String> componentClasses = new HashMap<String, String>();
		HashMap<String, String> attributes = role.getAttributes();
		for (String attribute : attributes.keySet()) {
			if (isClass(doc, xpath, attributes.get(attribute))) {
				componentClasses.put(attribute, attributes.get(attribute));
			}
		}
		return componentClasses;
	}

	private static boolean isClass(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("isClass has been accessed");
		String expr = "//class/name[name='" + className + "']/name[1] | " + "//class[name='" + className + "']/name | "
				+ "//enum/name[name='" + className + "']/name[1] | " + "//enum[name='" + className + "']/name | "
				+ "//interface/name[name='" + className + "']/name[1] | " + "//interface[name='" + className
				+ "']/name";
		if (xpathExecuter(doc, xpath, expr).getLength() > 0) {
			return true;
		}
		return false;
	}

	private static List<String> extractParentClasses(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractParentClasses has been accessed");
		NodeList nodes = null;
		List<String> parents = new ArrayList<String>();
		;
		String expr = "//class[name='" + className + "']/super/extends/name | " + "//enum[name='" + className
				+ "']/super/extends/name | " + "//interface[name='" + className + "']/super/extends/name";
		nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < nodes.getLength(); i++) {
			parents.add(nodes.item(i).getTextContent());
		}
		return parents;
	}

	private static List<String> extractImplementedInterfaces(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractParentClasses has been accessed");
		NodeList nodes = null;
		List<String> parents = new ArrayList<String>();
		;
		String expr = "//class[name='" + className + "']/super/implements/name | " + "//enum[name='" + className
				+ "']/super/implements/name |" + "//interface[name='" + className + "']/super/implements/name";
		nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < nodes.getLength(); i++) {
			parents.add(nodes.item(i).getTextContent());
		}
		return parents;
	}

	private static HashMap<String, String> extractAttributes(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractAttributes has been accessed");
		Set<String> types = extractAttributeTypes(doc, xpath, className);
		HashMap<String, String> attributes = new HashMap<String, String>();
		for (String type : types) {
			String expr = "//interface[name='" + className + "']/block/decl_stmt/decl/type[name='" + type+ "']/ancestor::decl/name | " 
						+ "//class[name='" + className + "']/block/decl_stmt/decl/type[name='" + type + "']/ancestor::decl/name";
			NodeList nodes = xpathExecuter(doc, xpath, expr);
			for (int i = 0; i < nodes.getLength(); i++) {
				String attribute = nodes.item(i).getTextContent();
				attributes.put(attribute, type);
			}
		}
		String expr = "//enum[name='" + className + "']/block/decl/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < nodes.getLength(); i++) {
			attributes.put(nodes.item(i).getTextContent(), null);
		}
		return attributes;
	}

	private static Set<String> extractAttributeTypes(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractAttributeTypes has been accessed");
		String expr = "//class[name='" + className + "']/block/decl_stmt/decl/type/name | " + "//enum[name='"
				+ className + "']/block/decl_stmt/decl/type/name |" + "//interface[name='" + className
				+ "']/block/decl_stmt/decl/type/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		Set<String> types = new HashSet<String>();
		for (int i = 0; i < nodes.getLength(); i++) {
			types.add(nodes.item(i).getTextContent());
		}
		return types;
	}

	private static NodeList xpathExecuter(Document doc, XPath xpath, String expr) {
		// TODO Auto-generated method stub
		NodeList nodes = null;
		try {
			nodes = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return nodes;
	}

	private static String extractRoleStereotype(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractRoleStereotype has been accessed");
		String expr = "//enum/name[name='" + className + "']/ancestor::enum/@role_stereotype | " + "//enum[name='"
				+ className + "']/@role_stereotype |" + "//class/name[name='" + className
				+ "']/ancestor::class/@role_stereotype | " + "//class[name='" + className + "']/@role_stereotype |"
				+ "//interface/name[name='" + className + "']/ancestor::interface/@role_stereotype | "
				+ "//interface[name='" + className + "']/@role_stereotype";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		String role = null;
		for (int i = 0; i < nodes.getLength(); i++) {
			role = nodes.item(i).getNodeValue();
		}
		return role;
	}

	private static List<String> extractStructurer(Document doc, XPath xpath) {
		// TODO Auto-generated method stub
//		System.out.println("extractRoleStereotype has been accessed");
		String expr = "//enum[@role_stereotype='Structurer']/name[not(*)] | "
				+ "//class[@role_stereotype='Structurer']/name[not(*)] | "
				+ "//interface[@role_stereotype='Structurer']/name[not(*)] | "
				+ "//enum[@role_stereotype='Structurer']/name/name | "
				+ "//class[@role_stereotype='Structurer']/name/name | "
				+ "//interface[@role_stereotype='Structurer']/name/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		List<String> ST = new ArrayList<String>();
		for (int i = 0; i < nodes.getLength(); i++) {
			ST.add(nodes.item(i).getTextContent());
		}
		return ST;
	}
	private static List<String> extractInformationHolder(Document doc, XPath xpath) {
		// TODO Auto-generated method stub
//		System.out.println("extractRoleStereotype has been accessed");
		String expr = "//enum[@role_stereotype='Information Holder']/name[not(*)] | "
				+ "//class[@role_stereotype='Information Holder']/name[not(*)] | "
				+ "//interface[@role_stereotype='InformationHolder']/name[not(*)] | "
				+ "//enum[@role_stereotype='Information Holder']/name/name | "
				+ "//class[@role_stereotype='Information Holder']/name/name | "
				+ "//interface[@role_stereotype='Information Holder']/name/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		List<String> IH = new ArrayList<String>();
		for (int i = 0; i < nodes.getLength(); i++) {
			IH.add(nodes.item(i).getTextContent());
		}
		return IH;
	}
	
	private static List<String> extractCoordinator(Document doc, XPath xpath) {
		// TODO Auto-generated method stub
//		System.out.println("extractRoleStereotype has been accessed");
		String expr = "//enum[@role_stereotype='Coordinator']/name[not(*)] | "
				+ "//class[@role_stereotype='Coordinator']/name[not(*)] | "
				+ "//interface[@role_stereotype='Coordinator']/name[not(*)] | "
				+ "//enum[@role_stereotype='Coordinator']/name/name | "
				+ "//class[@role_stereotype='Coordinator']/name/name | "
				+ "//interface[@role_stereotype='Coordinator']/name/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		List<String> CO = new ArrayList<String>();
		for (int i = 0; i < nodes.getLength(); i++) {
			CO.add(nodes.item(i).getTextContent());
		}
		return CO;
	}
	private static List<String> extractController(Document doc, XPath xpath) {
		// TODO Auto-generated method stub
//		System.out.println("extractRoleStereotype has been accessed");
		String expr = "//enum[@role_stereotype='Controller']/name[not(*)] | "
				+ "//class[@role_stereotype='Controller']/name[not(*)] | "
				+ "//interface[@role_stereotype='Controller']/name[not(*)] | "
				+ "//enum[@role_stereotype='Controller']/name/name | "
				+ "//class[@role_stereotype='Controller']/name/name | "
				+ "//interface[@role_stereotype='Controller']/name/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		List<String> CT = new ArrayList<String>();
		for (int i = 0; i < nodes.getLength(); i++) {
			CT.add(nodes.item(i).getTextContent());
		}
		return CT;
	}
	
	private static List<String> extractServiceProvider(Document doc, XPath xpath) {
		// TODO Auto-generated method stub
//		System.out.println("extractRoleStereotype has been accessed");
		String expr = "//enum[@role_stereotype='Service Provider']/name[not(*)] | "
				+ "//class[@role_stereotype='Service Provider']/name[not(*)] | "
				+ "//interface[@role_stereotype='Service Provider']/name[not(*)] | "
				+ "//enum[@role_stereotype='Service Provider']/name/name | "
				+ "//class[@role_stereotype='Service Provider']/name/name | "
				+ "//interface[@role_stereotype='Service Provider']/name/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		List<String> SP = new ArrayList<String>();
		for (int i = 0; i < nodes.getLength(); i++) {
			SP.add(nodes.item(i).getTextContent());
		}
		return SP;
	}

	private static List<String> extractClassNames(Document doc, XPath xpath) {
		// TODO Auto-generated method stub
//		System.out.println("extractClassNames has been accessed");
		List<String> classNames = new ArrayList<String>();
		String expr = "//class/name/name[1] | " + "//class/name[not(*)] | " + "//enum/name | "
				+ "//enum/name[not(*)] | " + "//interface/name[not(*)] | " + "//interface/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < nodes.getLength(); i++) {
			classNames.add(nodes.item(i).getTextContent());
		}
		// class/name[not(*)]
		return classNames;
	}

}
