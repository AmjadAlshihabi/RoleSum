package extractor;

import org.w3c.dom.*;


import javax.xml.xpath.*;
import javax.xml.parsers.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import org.xml.sax.SAXException;
import roles.InformationHolder;
import roles.ServiceProvider;

import java.lang.*;

public class Extractor {
	private final static String INFORMATION_HOLDER = "Information Holder";
	private final static String SERVICE_PROVIDER = "Service Provider";
	private final static String COORDINATOR = "Coordinator";
	private final static String STRUCTURER = "Structurer";
	private final static String CONTROLLER = "Controller";
	private final static String INTERFACER = "Interfacer";
	public static void main(String[] args) {
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(true);
		DocumentBuilder builder;
		Document doc = null;
		try {
			builder = domFactory.newDocumentBuilder();
			doc = builder.parse("./src/dataset/k9.xml");
		}catch (SAXException | IOException e){
			e.printStackTrace();
		}catch (ParserConfigurationException e) {
			e.printStackTrace();
		}	
		XPath xpath = XPathFactory.newInstance().newXPath();
		// ectracting names of information holders classes from the xml file
//		List<String> IHclasses = extractClassNames(doc, xpath, INFORMATION_HOLDER);
//		 ectracting names of Service Provider classes from the xml file
		List<String> SPclasses = extractClassNames(doc, xpath, SERVICE_PROVIDER);
//		 ectracting names of Structurer classes from the xml file
//		List<String> STclasses = STClassNames(doc, xpath);
//		 ectracting names of Coordinators classes from the xml file
//		List<String> COclasses = COClassNames(doc, xpath);
//		 ectracting names of Controller classes from the xml file
//		List<String> CTclasses = CTClassNames(doc, xpath);
//		 ectracting names of Interfacer classes from the xml file
//		List<String> ITclasses = ITClassNames(doc, xpath);
		
//		list to hold the InformationHolder objects
//		List<InformationHolder> IH = new ArrayList<InformationHolder>();
//		for (int i = 0; i<IHclasses.size(); i++) {
//			String className = IHclasses.get(i);
//			InformationHolder infoHolder = new InformationHolder();
//			infoHolder.setEntityName(className);
//			infoHolder.setAttributes(extractAttributes(doc, xpath, className));
//			infoHolder.setSerializableMethods(extractSerializableMethods(doc, xpath, className));
//			infoHolder.setDatabaseMethods(extractDatabaseMethods(doc, xpath, className));
//			infoHolder.setDeclarations(extractDeclarations(doc, xpath, className));
//			summarizeIH(infoHolder);
//			IH.add(infoHolder);
//	}
//		List to hold the serviceProviders
		List<ServiceProvider> SP = new ArrayList<ServiceProvider>();
		for (int i = 0; i<SPclasses.size(); i++) {
			String className = SPclasses.get(i);
			ServiceProvider servProv = new ServiceProvider();
			servProv.setEntityName(className);
			List <String> services = extractServices(doc, xpath, className);
			HashMap<String, Integer> configurations = extractConfigurations(doc, xpath, className);
			for (int j = 0; j<services.size(); j++) {
				if (configurations.get(services.get(j))!=null) {
					services.remove(j);
				}
			}
//			System.out.println("method calls");
//			extractMethodCalls(doc, xpath, className);
			servProv.setEntityName(className);
			servProv.setServices(services);
			servProv.setConfigurations(configurations);
			servProv.setClientObjects(extractMethodCalls(doc, xpath, className));
			summarizeSP(servProv);
//			SP.add(servProv);
//			HashMap <String, Integer> hm = extractConfigurations(doc, xpath, className);
//			System.out.println("This is class: "+className);
//			for(int j=0; j<services.size(); j++ ) {
//				System.out.println(services.get(j));
//			}
//			hm.entrySet().forEach(entry->{
//			    System.out.println(entry.getKey());  
//			 });
//			for (String name: hm.keySet()){
//	            String key = name.toString();
//	            String value = hm.get(name).toString(); 
////	            System.out.println("1");
//	            System.out.println("method: "+value);  
////	            System.out.println("2");
//	}
//			ServProv.setConfigurations(extractConfigurations(doc, xpath, className));
//			ServProv.setParents(extractParentClasses(doc, xpath, className));
//			summarizeSP(ServProv);
//			IH.add(infoHolder);
		}
	}
		
//		testing the methods
//		for (int i =0; i<IH.size();i++) {
//			List<String> test = IH.get(i).getDatabaseMethods();
//			if(test.size()>0) {				
//				System.out.println(IH.get(i).getEntityName());
//				for (int j =0; j<test.size();j++) {
//					System.out.println(test.get(j));
//				}
//			}
//		}
	
	private static HashMap<String, List<String>> extractMethodCalls(Document doc, XPath xpath, String className){
		List <String> methods = getMethodNames(doc, xpath, className);
		HashMap<String, List<String>> clientObjects = new HashMap<String, List<String>>();
//		for(int i=0; i<methods.size(); i++) {
//			System.out.println(methods.get(i));
//		}
		try {
			String path = "//class[name='"+className+"']/ancestor::unit/@filename | "
					+ "//interface[name='"+className+"']/ancestor::unit/@filename |"
					+ "//enum[name='"+className+"']/ancestor::unit/@filename";
			NodeList filename = (NodeList) xpath.compile(path).evaluate(doc, XPathConstants.NODESET);
			String words[] = filename.item(0).getTextContent().split("/");
			path = "";
			boolean pathExtraction = false;
			for(int i = 0; i<words.length; i++) {
				if(words[i].equals("com")) {
					path += words[i]+".";
					pathExtraction = true;
					continue;
				}
				if(pathExtraction) {
					path+=words[i]+".";
				}
			}
			path = path.substring(0, path.length()-1);

			String expr = "//class | interface";
			NodeList classes = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i<classes.getLength(); i++) {
				String clss= classes.item(i).getTextContent();
				List <String> consumedMethods = new ArrayList<String>();
				NodeList childNodes = classes.item(i).getChildNodes();
				String currClass="";
				for (int j = 0; j<childNodes.getLength(); j++) {
					if(childNodes.item(j).getNodeName().equalsIgnoreCase("name")) {
						currClass = childNodes.item(j).getTextContent();
					}
				}
				for (int j = 0; j<methods.size(); j++) {
					if (clss.contains(methods.get(j))) {
						consumedMethods.add(methods.get(j));
					}
				}
				if(consumedMethods.size()>0) {					
					clientObjects.put(currClass, consumedMethods);
				}
			}
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		return clientObjects;
	}
	
	private static HashMap <String, Integer> extractConfigurations(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
		NodeList finals = null;
//		save the result to hashMap to avoid redundancy
		HashMap <String, Integer> configurations = new HashMap <String, Integer>();
//		extract final attributes.
		try {
//			extracting the final attributes of the class
			String exprFinals = "//class[name='"+ className +"']/block/decl_stmt/decl/type[specifier='final']/following-sibling::name | "
					+ "//interface[name='"+ className +"']/block/decl_stmt/decl/type[specifier='final']/following-sibling::name";
			finals = (NodeList) xpath.compile(exprFinals).evaluate(doc, XPathConstants.NODESET);
			String exprMethods = "//class[name='"+ className+"']/block/function";
			NodeList methods = (NodeList) xpath.compile(exprMethods).evaluate(doc, XPathConstants.NODESET);
			for(int j = 0; j<finals.getLength();j++) {
				String finalAtt = finals.item(j).getChildNodes().item(0).getTextContent();
					for (int i =0; i<methods.getLength(); i++) {
						String method = methods.item(i).getTextContent();
						if(method.contains(finalAtt)) {
							NodeList childNodes = methods.item(i).getChildNodes();
							String name = "";
							for (int k = 0; k<childNodes.getLength(); k++) {
								if (childNodes.item(k).getNodeName().equalsIgnoreCase("name")) {
									name+=childNodes.item(k).getTextContent();
									if (k+1<childNodes.getLength()) {
										name+=childNodes.item(k+1).getTextContent();
										break;
									}
								}
							}
							configurations.put(name, i);							
						}
					}
				}
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		
		return configurations;
	}

	private static List <String> extractServices(Document doc, XPath xpath, String className){
		return getMethodNames(doc, xpath, className);
	}
	
	private static List <String> getMethodNames (Document doc, XPath xpath, String className) {
		List <String> methods = new ArrayList<String>();
		NodeList MethodsNode = null;
		try {
			String expr = "//class[name='"+ className+"']/block/function |"
					+ "//interface[name='"+ className+"']/block/function";
			MethodsNode = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
			for (int i =0; i<MethodsNode.getLength(); i++) {
//				String method = MethodsNode.item(i).getTextContent();
					NodeList childNodes = MethodsNode.item(i).getChildNodes();
					String name = "";
					for (int k = 0; k<childNodes.getLength(); k++) {
						if (childNodes.item(k).getNodeName().equalsIgnoreCase("name")) {
							name+=childNodes.item(k).getTextContent();
							if (k+1<childNodes.getLength()) {
								name+=childNodes.item(k+1).getTextContent();
								break;
							}
						}
					}
					methods.add(name);
			}
		}catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return methods;
	}

	private static void summarizeSP (ServiceProvider SPclass) {
		String template = "the %(className) Service Provider is responsible for:\n\n";
		template = template.replace("%(className)", SPclass.getEntityName());
		if (SPclass.getServices().size()>0) {
			String serviceMethods = "";
			List <String> services = SPclass.getServices();
			for (int i = 0; i<services.size(); i++) {
				serviceMethods += "-	"+services.get(i) + "\n";
			}
			template += "providing the following services for other objects:\n"
					+ "%(serviceMethods)\n";
			template = template.replace("%(serviceMethods)", serviceMethods);
		}
		if (SPclass.getConfigurations().size()>0) {
			String configurationMethod = "";
			HashMap <String, Integer> configurations = SPclass.getConfigurations();
			for(String method : configurations.keySet()) {
				configurationMethod += "-	"+method+ ":\n";  				
			}
			template += "Managing System Configurations:\n"
					+ "%(configurations)\n";
			template = template.replace("%(configurations)", configurationMethod);
		}
		if(SPclass.getClientObjects().size()>0) {
			HashMap<String, List<String>> clientObjects = SPclass.getClientObjects();
			String consumers = "";
			for ( String key : clientObjects.keySet() ) {
				consumers += key + ":\n";
				System.out.println(key);
			    List<String> methods = clientObjects.get(key);
			    for(int i =0; i<methods.size(); i++) {
			    	consumers += "-	  "+methods.get(i) + "\n";
			    }
			}
			template += "Offers services and configurations to the following objects\n"
					+ "%(consumers)\n";
			template = template.replace("%(consumers)", consumers);
		}
		try {
		      File file = new File("./src/spSummaries/"+SPclass.getEntityName() + ".txt");
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
		      FileWriter templateWriter = new FileWriter("./src/spSummaries/"+SPclass.getEntityName() + ".txt");
		      templateWriter.write(template);
		      templateWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	private static void summarizeIH (InformationHolder IHclass) {
		String template = "the %(className) Information Holder is responsible for:\n";
		template = template.replace("%(className)", IHclass.getEntityName());
		if (IHclass.getAttributes().size()>0) {
			String attributes = "";
			List <String> attributeList = IHclass.getAttributes();
			for (int i = 0; i<attributeList.size(); i++) {
				attributes += attributeList.get(i) + "\n";
			}
			template += "managing and holding information about:\n"
					+ "%(attributes)\n";
			template = template.replace("%(attributes)", attributes);
		}
		if (IHclass.getSerializableMethods().size()>0) {
			String serializationMethods = "";
			List <String> serializationList = IHclass.getSerializableMethods();
			for (int i = 0; i<serializationList.size(); i++) {
				serializationMethods += serializationList.get(i) + "\n";
			}
			template += "Serialization of object, list of overriden method:\n"
					+ "%(serializationMethods)\n";
			template = template.replace("%(serializationMethods)", serializationMethods);
		}
		if(IHclass.getDatabaseMethods().size()>0) {
			String databaseMethods = "";
			List <String> databaseList = IHclass.getDatabaseMethods();
			for (int i = 0; i<databaseList.size(); i++) {
				databaseMethods += databaseList.get(i) + "\n";
			}
			template += "Managing database tasks through the following methods\n"
					+ "%(databaseMethods)\n";
			template = template.replace("%(databaseMethods)", databaseMethods);
		}
		if(IHclass.getDeclarations().size()>0) {
			String declarationClasses = "";
			List <String> declarationsList = IHclass.getDeclarations();
			for (int i = 0; i<declarationsList.size(); i++) {
				declarationClasses += declarationsList.get(i) + "\n";
			}
			template += "Providing information to the following objects:\n"
					+ "%(declarationClasses)\n";
			template = template.replace("%(declarationClasses)", declarationClasses);
		}
//		System.out.print(template);
		try {
		      File file = new File("./src/textSummaries/"+IHclass.getEntityName() + ".txt");
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
		      FileWriter templateWriter = new FileWriter("./src/textSummaries/"+IHclass.getEntityName() + ".txt");
		      templateWriter.write(template);
		      templateWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
//	extracting names of classes from the xml file
	private static List<String> extractClassNames(Document doc, XPath xpath, String role) {
		// TODO Auto-generated method stub
		NodeList roles = null;
		List <String> classNames = new ArrayList<String>();
		try {
			String expr = "//enum[@role_stereotype='"+ role +"']/name | "
					+ "//class[@role_stereotype='"+ role +"']/name | "
					+ "//interface[@role_stereotype='"+ role +"']/name";
			roles = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i<roles.getLength(); i++) {
				classNames.add(roles.item(i).getTextContent());
			}
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		return classNames;
	}
	
//	extracting attributes of Information holder classes
	private static List<String> extractAttributes(Document doc, XPath xpath, String className){
		NodeList attributesNodes = null;
		List<String> attributes = new ArrayList<String>();
		try {
			String expr = "//class[name='"+ className+"']/block/decl_stmt/decl/name | "
					+ "//enum[name='"+ className+"']/block/decl_stmt/decl/name |"
					+ "//interface[name='"+ className+"']/block/decl_stmt/decl/name";
			attributesNodes = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i<attributesNodes.getLength(); i++) {
				String item = attributesNodes.item(i).getTextContent();
				if (item.equals("String") | item.equals("char") | item.equals("float") | item.equals("double") | 
						item.equals("long") | item.equals("int") | item.equals("short") | 
						item.equals("byte") | item.equals("boolean")) {
					continue;
				}
//				System.out.println(attributesNodes.item(i).getTextContent());
				attributes.add(item);
			}
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		return attributes;
	}
	
//	extract serializable methods
	private static List<String> extractSerializableMethods (Document doc, XPath xpath, String className){
//		nodelist to save the extended or implemented classes for the className passed in the argument;
		NodeList serializableNodes = null;
//		nodelist to save the methods that override the serializable or parcelable methods;
		NodeList serializableMethods = null;
//		list to hold a signatures of the overriden functions in the given className;
		List<String> serializables = new ArrayList<String>();
		NodeList methods = null;
		NodeList names = null;
		try {
			String expr = "//class[name='"+ className+"']/block/function[annotation/name='Override']/type/following-sibling::*[not(self::block)]";
			methods = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		String method=""; 
		for(int i = 0; i<methods.getLength(); i++) {
			method += methods.item(i).getTextContent();
			if(methods.item(i).getTextContent().contains("throws")) {
				serializables.add(method);
				method="";
			}
			
		}
		return serializables;
	}
//	extract methods that declars sql object or takes in  
	private static List<String> extractDatabaseMethods(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
		NodeList functions = null;
		List <String> methods = new ArrayList <String>();
		try {
			String expr = "//class[name='"+ className+"']/block/function | "
					+ "//interface[name='"+ className+"']/block/function";
			functions = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
//		for each function check if it contain sql then it saves the method declaration and signature
//		to the methods list as string.
		for (int i =0; i<functions.getLength(); ++i) {
			String node = functions.item(i).getTextContent();
			if (node.toLowerCase().contains("sql") | node.toLowerCase().contains("database") | node.toLowerCase().contains("mongo") | node.toLowerCase().contains("db") | node.toLowerCase().contains("DB")) {
				String method = "";
				NodeList methodNode = functions.item(i).getChildNodes();
//				we exclude the last child node (<block>) which is the the body of the method 
//				so we only save the method declaration and signature.	
				for(int j = 0; j < methodNode.getLength()-1; j++) {
					method += methodNode.item(j).getTextContent();
				}
				methods.add(method);
			}
		}
		return methods;
	}
	
	private static List <String> extractDeclarations(Document doc, XPath xpath, String className){
			NodeList classes = null;
			List <String> declarations = new ArrayList<String>();
			try {
				String expr= "//class | //interface";
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
//								System.out.println(className +" is declared in "+ childNode.getTextContent());
								declarations.add(childNode.getTextContent());
							}
					}
				}
			}
		return declarations;
	}
//	public static String getMethodName(String str) {
//		String p = null; 
//if (str.contains(" String ")) {
//	p = str.replaceAll(" String ", " ");
//			
//		}
//if (str.contains(" float ")) {
//	p = str.replaceAll(" float ", " ");
//	
//}
//if (str.contains(" double ")) {
//	p = str.replaceAll(" double ", " ");
//	
//}
//if (str.contains(" long ")) {
//	p = str.replaceAll(" long ", " ");
//	
//}
//if (str.contains(" char ")) {
//	
//	p = str.replaceAll(" char ", " ");
//}
//if (str.contains(" int ")) {
//	
//	p = str.replaceAll(" int ", " ");
//}
//if (str.contains(" short ")) {
//	
//	p = str.replaceAll(" short ", " ");
//}if (str.contains(" byte ")) {
//	
//	p = str.replaceAll(" byte ", " ");
//}
//if (str.contains(" boolean ")) {
//	
//	p = str.replaceAll(" boolean ", " ");
//}
//if (str.contains(" final ")) {
//	p = str.replaceAll(" final ", " ");
//	
//}
//if (str.contains(" public ")) {
//	p = str.replaceAll(" public ", " ");
//	
//}if (str.contains(" private ")) {
//	
//	p = str.replaceAll(" private ", " ");
//}
//if (str.contains(" void ")) {
//	
//	p = str.replaceAll(" void ", " ");
//}
//if (str.contains(" static ")) {
//	
//	p = str.replaceAll(" static ", " ");
//}
//if (str.contains(" final ")) {
//	p = str.replaceAll(" final ", " ");
//	
//}
//		return p;
//	}
//	private static List<String> SPClassNames(Document doc, XPath xpath) {
//		// TODO Auto-generated method stub
//		NodeList SP = null;
//		List <String> classNames = new ArrayList<String>();
//		try {
//			String expr = "//unit/enum[@role_stereotype = 'Service Provider']/name | "
//					+ "//unit/class[@role_stereotype = 'Service Provider']/name | "
//					+ "//unit/interface[@role_stereotype = 'Service Provider']/name";
//			SP = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
//			for (int i = 0; i<SP.getLength(); i++) {
//				classNames.add(SP.item(i).getTextContent());
//			}
//		}catch(XPathExpressionException e) {
//			e.printStackTrace();
//		}
//		return classNames;
//	}
//	
//	private static List<String> STClassNames(Document doc, XPath xpath) {
//		// TODO Auto-generated method stub
//		NodeList ST = null;
//		List <String> classNames = new ArrayList<String>();
//		try {
//			String expr = "//unit/enum[@role_stereotype = 'Structurer']/name | "
//					+ "//unit/class[@role_stereotype = 'Structurer']/name | "
//					+ "//unit/interface[@role_stereotype = 'Structurer']/name";
//			ST = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
//
//			for (int i = 0; i<ST.getLength(); i++) {
//				classNames.add(ST.item(i).getTextContent());
//			}
//		}catch(XPathExpressionException e) {
//			e.printStackTrace();
//		}
//		return classNames;
//	}
//	
//	private static List<String> COClassNames(Document doc, XPath xpath) {
//		NodeList CO = null;
//		List <String> classNames = new ArrayList<String>();
//		try {
//			String expr = "//unit/enum[@role_stereotype = 'Coordinator']/name | "
//					+ "//unit/class[@role_stereotype = 'Coordinator']/name | "
//					+ "//unit/interface[@role_stereotype = 'Coordinator']/name";
//			CO = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
//
//			for (int i = 0; i<CO.getLength(); i++) {
//				classNames.add(CO.item(i).getTextContent());
//			}
//		}catch(XPathExpressionException e) {
//			e.printStackTrace();
//		}
//		return classNames;
//	}
//	Extracting Interfacer classes
//	private static List<String> CTClassNames(Document doc, XPath xpath) {
//		// TODO Auto-generated method stub
//		NodeList CT = null;
//		List <String> classNames = new ArrayList<String>();
//		try {
//			String expr = "//unit/enum[@role_stereotype = 'Controller']/name | "
//					+ "//unit/class[@role_stereotype = 'Controller']/name | "
//					+ "//unit/interface[@role_stereotype = 'Controller']/name";
//			CT = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
//			
//			for (int i = 0; i<CT.getLength(); i++) {
//				classNames.add(CT.item(i).getTextContent());
//			}
//		}catch(XPathExpressionException e) {
//			e.printStackTrace();
//		}
//		return classNames;
//	}
//	Extracting Interfacer classes
//	private static List<String> ITClassNames(Document doc, XPath xpath) {
//		NodeList IT = null;
//		List <String> classNames = new ArrayList<String>();
//		try {
//			String expr = "//unit/enum[@role_stereotype = 'Interfacer']/name | "
//					+ "//unit/class[@role_stereotype = 'Interfacer']/name | "
//					+ "//unit/interface[@role_stereotype = 'Interfacer']/name";
//			IT = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
//			
//			for (int i = 0; i<IT.getLength(); i++) {
//				classNames.add(IT.item(i).getTextContent());
//			}
//		}catch(XPathExpressionException e) {
//			e.printStackTrace();
//		}
//		return classNames;
//	}
}