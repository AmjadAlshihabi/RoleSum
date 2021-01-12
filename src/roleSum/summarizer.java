package roleSum;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import collectionObjects.CollectionObjects;
import roles.InformationHolder;
import roles.RoleStereotype;


public class summarizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Console console = System.console();
//		if (console == null) {
//		    System.out.println("No console: non-interactive mode!");
//		    System.exit(0);
//		}
		Scanner in = new Scanner( System.in );
		System.out.print("Enter a path to the XML representation of you source code: ");
		String xmlPath = in.next();
		 
		System.out.print("Enter the path to the csv file containign the role stereotypes: ");
		String role_path = in.next();
		in.close();
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(true);
		DocumentBuilder builder;
		Document doc = null;
		try {
			builder = domFactory.newDocumentBuilder();
			doc = builder.parse(xmlPath);
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		XPath xpath = XPathFactory.newInstance().newXPath();
		HashMap<String, String> roleStereotypes = readRoles(role_path);
//		dataset/k9_rolestereotype.xml
//		dataset/manual_labeled_class.csv
		List <String> informationHolders = extractRoles(roleStereotypes, "Information Holder"); 
		List <String> structurers = extractRoles(roleStereotypes, "Structurer");
		List <String> serviceProviders = extractRoles(roleStereotypes, "Service Provider"); 
		List <String> coordinators = extractRoles(roleStereotypes, "Coordinator"); 
		List <String> controllers = extractRoles(roleStereotypes, "Controller");
		List <String> interfacers = extractRoles(roleStereotypes, "Interfacer");
		System.out.println("Summarizing Interfacer");
		for (int i = interfacers.size()-1; i >= 0; i--) {
			InSummarizer(doc, xpath, interfacers.get(i), roleStereotypes);
		}
		System.out.println("Summarizing Information Holders");
		for (int i = 0; i < informationHolders.size(); i++) {
			IhSummarizer(doc, xpath, informationHolders.get(i), roleStereotypes);
		}
		System.out.println("Summarizing Controllers");
		for (int i = controllers.size()-1; i >= 0; i--) {
			CtSummarizer(doc, xpath, controllers.get(i), roleStereotypes);
		}
		System.out.println("Summarizing Coordinators");
		for (int i = coordinators.size()-1; i >= 0; i--) {
			CoSummarizer(doc, xpath, coordinators.get(i), roleStereotypes);
		}
		System.out.println("Summarizing Structurer");
		for (int i = structurers.size()-1; i >= 0; i--) {
			StSummarizer(doc, xpath, structurers.get(i), roleStereotypes);
		}
		System.out.println("Summarizing Service Provider");
		for (int i = serviceProviders.size()-1; i >= 0; i--) {
			SPSummarizer(doc, xpath, serviceProviders.get(i), roleStereotypes);			
		}
	}
	
	private static void CtSummarizer (Document doc, XPath xpath, String className, HashMap<String, String> roleStereotypes) {
		System.out.println(className);
		RoleStereotype role = new RoleStereotype();
		role.setName(className);
		role.setMethods(extractMethods(doc, xpath, className));
		role.setComponentClasses(extractComponentClasses(doc, xpath, role));
		role.setDeclarations(extractUsedObjectsInMethods(doc, xpath, role));
		List <String> methods = role.getMethods();
		HashMap <String, Integer> methodsLoc = new HashMap<String, Integer> ();
		for(int i = 0; i < methods.size(); i++) {
			methodsLoc.put(methods.get(i), countLinesOfCode(doc, xpath, methods.get(i), className));
		}
		HashMap<String, Integer> sortedMethodLoc = sortByIntegerValue(methodsLoc);
		HashMap <String, List<String>> methodsUsedObjects = role.getDeclarations();
		if(!methodsUsedObjects.isEmpty()) {
			String template = "# " + className + "\n";
			template += "### This Controller is responsible for controlling tasks and making functional decision. \n";
			template += "### A list of tasks and used objects in each task: \n";
			List<String> sortedMethodLocKeySet = new ArrayList <String>(sortedMethodLoc.keySet());
			for(int i = sortedMethodLocKeySet.size()-1; i>=0; i--) {
				template += "\n * " + sortedMethodLocKeySet.get(i) 
					+ extractMethodParameters(doc, xpath, className, sortedMethodLocKeySet.get(i)) +"\n";
				List<String> usedObjects = methodsUsedObjects.get(sortedMethodLocKeySet.get(i));
//				System.out.println(sortedMethodLocKeySet.get(i));
				HashMap <String, String> usedObjectsRoles = new HashMap <String, String> ();
				for(int j = 0; j<usedObjects.size(); j++) {
					usedObjectsRoles.put(usedObjects.get(j), roleStereotypes.get(usedObjects.get(j)));
				}
				HashMap <String, String> sortedUsedObjectsRoles = sortByStringValue(usedObjectsRoles);
				String roleStereotype = "";
				for(String object : sortedUsedObjectsRoles.keySet()) {
					String currRole = sortedUsedObjectsRoles.get(object);
					if (currRole !=null &&!currRole.equals(roleStereotype)) {
						roleStereotype = currRole;
						template += "	* " + roleStereotype +"s: \n";
					}
					try{
						template += "		* [" + object + "](../" + roleStereotype.replaceAll("\\s+", "")
					+ "s/" + object + ".md) \n";
					}catch(NullPointerException e) {
						template += "	* " + object + " \n";
					}
				}
			}
					
			try {
				File file = new File("./Controllers/" + className + ".md");
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
				FileWriter templateWriter = new FileWriter("./Controllers/" + className + ".md");
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
	
	private static void IhSummarizer(Document doc, XPath xpath, String className, HashMap<String, String> roleStereotypes) {
		System.out.println(className);
		InformationHolder role = new InformationHolder();
		role.setName(className);
		role.setAttributes(extractAttributes(doc, xpath, className));
		String template = "# " + className + "\n";
		template += "## This Information Holder is responsible for:\n";
		HashMap<String, String> attributes = extractAttributes(doc, xpath, className);
		List<String> serializables = extractSerializableMethods(doc, xpath, className); 
		List<String> dbMethods = extractDatabaseMethods(doc, xpath, className);
		List<String> consumers = extractDeclarations(doc, xpath, className);
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
		if (!consumers.isEmpty()) {
			HashMap <String, String> consumerRoles = new HashMap<String, String>();
			for(int i = 0; i<consumers.size(); i++) {
				String consumerRole = roleStereotypes.get(consumers.get(i));
				if(consumerRole==null)
					continue;
				consumerRoles.put(consumers.get(i), consumerRole);
			}
			HashMap<String, String> sortedConsumer = sortByStringValue(consumerRoles);
			template += "### Providing information to the following objects \n";
			String roleStereotype = "";
			for(String consumer : sortedConsumer.keySet()) {
				String currRole = sortedConsumer.get(consumer);
				if(currRole!=null && !currRole.equals(roleStereotype)) {
					roleStereotype = currRole;
					template += "* " + roleStereotype + "\n";
				}
				try{
					template += "	* [" + consumer + "](../" + roleStereotype.replaceAll("\\s+", "")+ "s/" + consumer + ".md) \n";
				}catch(NullPointerException e) {
					template += "	* " + consumer + " \n";
				}
				
			}
		}
		if (!attributes.isEmpty() | !serializables.isEmpty() | !dbMethods.isEmpty() | !consumers.isEmpty()) {
			try {
				File file = new File("./InformationHolders/" + className + ".md");
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
				FileWriter templateWriter = new FileWriter("./InformationHolders/" + className + ".md");
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
	
	private static void InSummarizer (Document doc, XPath xpath, String className, HashMap<String, String> roleStereotypes) {
		System.out.println(className);
		RoleStereotype role = new RoleStereotype();
		role.setAttributes(extractAttributes(doc, xpath, className));
		role.setComponentClasses(extractComponentClasses(doc, xpath, role));
		role.setParentClasses(extractParentClasses(doc, xpath, className));
		role.setImplementedInterfaces(extractImplementedInterfaces(doc, xpath, className));
		
		List <String> parents = role.getParentClasses();
		List <String> implementedInterfaces = role.getImplementedInterfaces();
		HashMap <String, String> components = role.getComponentClasses();
		HashMap <String, String> uiComponents = extractUiComponents(doc, xpath, role, roleStereotypes);
		
		String template = "# " + className + "\n";
		template += "## this Interfacer is responsible for: \n";
		if(!parents.isEmpty()) {
			template += "### inheriting the following classes: \n";
			for (int i = 0; i < parents.size(); i++) {
				String parent = roleStereotypes.get(parents.get(i));
				String roleStereotype = roleStereotypes.get(parent);
				if (parent != null && roleStereotype != null) {
					template += "* [" + parent + "](../" + roleStereotype.replaceAll("\\s+", "") + "s/" + parent
							+ ".md)\n";
				}else {
					template += "* " + parents.get(i) + "\n";
				}
			}
		}
		if(!implementedInterfaces.isEmpty()) {
			template += "### implementing the following interfaces:\n";
			for (int i = 0; i < implementedInterfaces.size(); i++) {
				String implementedInterface = extractObjectName(doc, xpath, implementedInterfaces.get(i));
				String roleStereotype = roleStereotypes.get(implementedInterface);
				if (implementedInterface != null) {
					template += "* [" + implementedInterface + "](../" + roleStereotype.replaceAll("\\s+", "") + "s/"
							+ implementedInterface + ".md) \n";
				} else {
					template += "* " + implementedInterfaces.get(i) + "\n";
				}
			}
		}
		if(!uiComponents.isEmpty()) {
			template += "### managing system interaction with external APIs and users using the following objects: \n";
			Set<String> set = new HashSet<String>();
			for(String uiComponent : uiComponents.keySet()) {
				set.add(uiComponents.get(uiComponent));
			}
			for(String uiComponent : set)
				template += "* "+ uiComponent + "\n";
		}
		if(!components.isEmpty()) {
			HashMap <String, String> componentsRoles = new HashMap<String, String> ();
			for(String component : components.keySet()) {
				String componentRole = roleStereotypes.get(components.get(component));
				if(componentRole==null)
					continue;
				componentsRoles.put(components.get(component), componentRole);
			}
			HashMap<String, String> sortedComponentsRoles = sortByStringValue(componentsRoles);
			List<String> keys = new ArrayList<String>(sortedComponentsRoles.keySet());
			template += "### collaborating with the following objects: \n";
			String roleStereotype = "";
			for(int i = keys.size()-1; i>=0; i--) {				
				String currRoleStereotype = roleStereotypes.get(keys.get(i));
				if(currRoleStereotype !=null && !roleStereotype.equals(currRoleStereotype)) {
					roleStereotype = currRoleStereotype;
					template += "* " + roleStereotype + "s: \n";
				}else if(currRoleStereotype ==null) {
					template += "* other objects with no role stereotype: \n";
				}
					
				try {					
					template += "	* ["+ keys.get(i) 
							+ "](../"+ roleStereotype.replaceAll("\\s+", "") +"s/"
							+ keys.get(i) + ".md) \n";
				}catch(NullPointerException e) {
					template += "	* " + keys.get(i) + " \n";
				}
			}
		}
		if (!uiComponents.isEmpty() | !components.isEmpty() | !parents.isEmpty() | !implementedInterfaces.isEmpty()) {
			try {
				File file = new File("./Interfacers/" + className + ".md");
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
				FileWriter templateWriter = new FileWriter("./Interfacers/" + className + ".md");
				templateWriter.write(template);
				templateWriter.close();
			      System.out.println("Successfully wrote to the file.");
			} catch (IOException e) {
			      System.out.println("An error occurred.");
				e.printStackTrace();
			}
		}
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
		role.setCustomerClasses(extractMethodConsumerClasses(doc, xpath, role));
		String template = "# " + className + "\n";
		template += "### This Coordinator is responsible for delegating work between the following objects: \n";
		List<String> methodTemplates = new ArrayList<String>();
		HashMap<String, List<String>> methodCunsomerClasses = role.getCustomerClasses();
		HashMap<String, List<String>> declarations = role.getDeclarations();
		for (String method : methodCunsomerClasses.keySet()) {
			String methodTemplate = "";
			List<String> methodInvokes = methodCunsomerClasses.get(method);
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
					String roleStereotype = roleStereotypes.get(usedObjects.get(i));
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
				File file = new File("./Coordinators/" + className + ".md");
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
				FileWriter templateWriter = new FileWriter("./Coordinators/" + className + ".md");
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
	
	private static void StSummarizer(Document doc, XPath xpath, String className, HashMap<String, String> roleStereotypes) {
		System.out.println(className);
		RoleStereotype role = new RoleStereotype();
		role.setAttributes(extractAttributes(doc, xpath, className));
		role.setComponentClasses(extractComponentClasses(doc, xpath, role));
		role.setParentClasses(extractParentClasses(doc, xpath, className));
		role.setImplementedInterfaces(extractImplementedInterfaces(doc, xpath, className));
		role.setMethods(extractMethods(doc, xpath, className));
		List<String> parents = role.getParentClasses();
		List<String> implementedInterfaces = role.getImplementedInterfaces();
		HashMap<String, String> components = role.getComponentClasses();
		List<String> cMethods = extractUsedCollectionObject(doc, xpath, className);
		String template = "# " + className + "\n";
		template += "## This Structurer is responsible for:\n";
		if (parents.size() > 0) {
			template += "### inheriting the following classes:\n";
			for (int i = 0; i < parents.size(); i++) {
				String roleStereotype = roleStereotypes.get(parents.get(i));
				if (roleStereotype != null ) {
					template += "* [" + parents.get(i) + "](../" + roleStereotype.replaceAll("\\s+", "") + "s/" + parents.get(i)
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
		if (components.size() > 0) {
			HashMap <String, String> componentsRoles = new HashMap<String, String> ();
			for(String component : components.keySet()) {
				String componentsRole = roleStereotypes.get(components.get(component));
				if(componentsRole==null)
					continue;
				componentsRoles.put(components.get(component), componentsRole);
			}
			template += "### managing the relationships between the following objects as components:\n";
			HashMap <String, String> sortedComponentRoles = sortByStringValue(componentsRoles);
			String roleStereotype = "";
			for (String component : sortedComponentRoles.keySet()) {
				String currRole = sortedComponentRoles.get(component);
				if(currRole!=null && !currRole.equals(roleStereotype)) {
					roleStereotype = currRole;
					template += "* " + roleStereotype + "s: \n";
				}
				if (!template.contains(component + "\n"))
					try{
						template += "	* [" + component + "](../" + roleStereotype.replaceAll("\\s+", "")
							+ "s/" + component + ".md) \n";
					}catch(NullPointerException e) {
						template += "	* " + component + " \n";
					}
			}
		}
		if (!cMethods.isEmpty()) {
			template += "### Maintaining relationships between objects through the following methods: \n";
			for (int i = 0; i < cMethods.size(); i++) {
				template += "* " + cMethods.get(i) + "\n";
			}
		}

//		this condition to avoid printing the template string without summarization
//		otherwise it will only print the string in line 240 for some classes that 
//		does not proceed the conditions in lines 248, 269, 283 and 293
		if (!parents.isEmpty() | !implementedInterfaces.isEmpty() | !components.isEmpty() | !cMethods.isEmpty()) {
			try {
				File file = new File("./Structurers/" + className + ".md");
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
				FileWriter templateWriter = new FileWriter("./Structurers/" + className + ".md");
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
		List<String> methods = role.getMethods();
		HashMap <String, List<String>> consumers = extractMethodConsumerClasses(doc, xpath, role); //12
		List<String> configFeatures = extractConfigurationFeatures(doc, xpath, className); //3
		List <String> serviceFeatures = new ArrayList<String>(methods);
		serviceFeatures.removeAll(configFeatures);		
		String template = "# " + className + "\n";
		template += "## This Service Provider is responsible for:\n";
		
//		generating the service features
		if(!serviceFeatures.isEmpty()) {
			List <String> serviceTemplates = new ArrayList<String>();
			for(int i = 0; i<serviceFeatures.size(); i++) {
				if(serviceFeatures.get(i).equals("toString") | 
						serviceFeatures.get(i).equals("toArray") | 
						consumers.get(serviceFeatures.get(i)).isEmpty()) {
					continue;
				}
				List<String> serviceConsumers = consumers.get(serviceFeatures.get(i));
				HashMap <String, String> serviceConsumersRoles = new HashMap<String, String>();
				for(int j = 0; j<serviceConsumers.size(); j++) {
					String serviceConsumerRole = roleStereotypes.get(serviceConsumers.get(j));
					if(serviceConsumerRole==null)
						continue;
					serviceConsumersRoles.put(serviceConsumers.get(j), serviceConsumerRole);
				}
				HashMap <String, String> sortedServiceConsumersRole = sortByStringValue(serviceConsumersRoles);
				String serviceTemplate = "";
				String parameters = extractMethodParameters(doc, xpath, className, serviceFeatures.get(i));
				serviceTemplate += "* "+ serviceFeatures.get(i)+ parameters +" \n";
				String roleStereotype = "";
				for(String serviceConsumer : sortedServiceConsumersRole.keySet()) {
					String currRole = sortedServiceConsumersRole.get(serviceConsumer);
					if(currRole!=null && !currRole.equals(roleStereotype)) {
						roleStereotype = currRole;
						serviceTemplate += "	* " + roleStereotype + "s: \n";
					}
					try{
						serviceTemplate += "		* [" + serviceConsumer + "](../" + roleStereotype.replaceAll("\\s+", "")
						+ "s/" + serviceConsumer + ".md) \n";
					}catch(NullPointerException e) {
						serviceTemplate += "	* " + serviceConsumer + " \n";
					}
				}
				serviceTemplates.add(serviceTemplate);
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
					+ "List of configuration features and corresponding consumer objects: \n";
			for(int i = 0; i<configFeatures.size(); i++) {
				List<String> configConsumers = consumers.get(configFeatures.get(i));
				if(configConsumers==null) {
					continue;
				}
				HashMap <String, String> configConsumersRoles = new HashMap<String, String>();
				for(int j = 0; j<configConsumers.size(); j++) {
					String configConsumersRole = roleStereotypes.get(configConsumers.get(j));
					if(configConsumersRole==null)
						continue;
					configConsumersRoles.put(configConsumers.get(j), configConsumersRole);
				}
				HashMap <String, String> sortedConfigConsumersRole = sortByStringValue(configConsumersRoles);
//				List<String> featureConsumer = consumers.get(configFeatures.get(i));
					String parameters = extractMethodParameters(doc, xpath, className, configFeatures.get(i));
					template += "* "+ configFeatures.get(i)+ parameters +"\n";
					String roleStereotype = "";
					for(String configConsumer : sortedConfigConsumersRole.keySet()) {
						String currRole = sortedConfigConsumersRole.get(configConsumer);
						if(currRole != null && !currRole.equals(roleStereotype)) {
							roleStereotype = currRole;
							template += "	* " + roleStereotype + "s: \n";
						}
						if(roleStereotype!=null)
							template += "		* [" + configConsumer + "](../" + roleStereotype.replaceAll("\\s+", "")
							+ "s/" + configConsumer + ".md) \n";
						else
							template += "	* " + configConsumer + " \n";
					}
			}
		}
		
		if(!configFeatures.isEmpty() | !serviceFeatures.isEmpty()) {			
			try {
				File file = new File("./ServiceProviders/" + className + ".md");
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
				FileWriter templateWriter = new FileWriter("./ServiceProviders/" + className + ".md");
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
								+ "//enum[name='"+ className+"']/block/function";
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
	
	private static List<String> extractUsedCollectionObject (Document doc, XPath xpath, String className) {
		List<String> methods = new ArrayList<String>();
		String expr = "//class[name='" + className + "']/block/function | "
				+ "//class[name='" + className + "']/block/function_decl | "
				+ "//enum[name='" + className + "']/block/function | "
				+ "//enum[name='" + className + "']/block/function_decl |"
				+ "//interface[name='" + className + "']/block/function_decl";
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
	
	private static HashMap<String, List<String>> extractMethodConsumerClasses(Document doc, XPath xpath,
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
	
	private static String extractMethodParameters(Document doc, XPath xpath, String className,
			String method) {
		// TODO Auto-generated method stub
//		System.out.println("extractMethod Parameters has been accessed");
		String expr = "//class[name='" + className + "']/block/function[name='" + method + "']/parameter_list | "
				+ "//class[name='" + className + "']/block/function_decl[name='" + method + "']/parameter_list | "
				+ "//enum[name='" + className + "']/block/function[name='" + method + "']/parameter_list | "
						+ "//enum[name='" + className + "']/block/function_decl[name='" + method + "']/parameter_list | " 
				+ "//interface[name='" + className + "']/block/function_decl[name='" + method + "']/parameter_list";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		String parameters = "";
		for (int i = 0; i < nodes.getLength(); i++) {
			parameters = nodes.item(i).getTextContent();
		}
		return parameters;
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
	
	private static int countLinesOfCode(Document doc, XPath xpath, String method, String className) {
		String expr = "//class[name = '" + className + "']/block/function[name='"+ method +"'] | "
				+ "//enum[name = '" + className + "']/block/function[name='"+ method +"']";
		NodeList methodNode = xpathExecuter(doc, xpath, expr);
		method = methodNode.item(0).getTextContent();
		String [] lines = method.split(";\n|\\{\n|\\case:\n");
		return lines.length-1;
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
		String expr = "//class[name = '" + className + "']/block/function[name='" + methodName+ "']/block | "
				+ "//enum[name = '" + className + "']/block/function[name='" + methodName+ "']/block";
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
		String expr = "//class[name = '" + className + "']/block/function[name='" + methodName + "']/block//decl_stmt/decl/type/name | "
				+ "//enum[name = '" + className + "']/block/function[name='" + methodName + "']/block//decl_stmt/decl/type/name";
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
		String expr = "//class[name='" + className + "']/block/function[name='" + methodName + "']/block | "
				+ "//enum[name='" + className + "']/block/function[name='" + methodName + "']/block";
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
	
	private static List<String> extractMethodArgument(Document doc, XPath xpath, String className, String methodName) {
//		System.out.println("extractMethodArgument has been accessed");
		List<String> argument = new ArrayList<String>();
		String expr = "//class[name='" + className + "']/block/function[name='" + methodName + "']/parameter_list/parameter/decl/type/name | "
				+ "//class[name='" + className + "']/block/function_decl[name='" + methodName + "']/parameter_list/parameter/decl/type/name | " 
				+ "//interface[name='" + className+ "']/block/function_decl[name='" + methodName + "']/parameter_list/parameter/decl/type/name | "
				+ "//enum[name='" + className + "']/block/function[name='" + methodName + "']/parameter_list/parameter/decl/type/name | "
				+ "//enum[name='" + className + "']/block/function_decl[name='" + methodName + "']/parameter_list/parameter/decl/type/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < nodes.getLength(); i++) {
			String parameterType = nodes.item(i).getTextContent();
			if (isClass(doc, xpath, parameterType)) {				
				argument.add(parameterType);
			}
		}
		return argument;
	}
	
	private static List<String> extractMethods(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractMethods has been accessed");
		List<String> methods = new ArrayList<String>();
		String expr = "//class[name='" + className + "']/block/function/name | "
				+ "//class[name='" + className + "']/block/function_decl/name | "
						+ "//interface[name='" + className+ "']/block/function_decl/name | "
								+ "//enum[name='" + className+ "']/block/function_decl/name |"
										+ "//enum[name='" + className+ "']/block/function/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < nodes.getLength(); i++) {
			String name = nodes.item(i).getTextContent();
			methods.add(name);
		}
		return methods;
	}
	
//	returns a list of initiate object of class (className) passed as parameter.
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
				if (classes.item(i).getTextContent().contains(className)) {		
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
	
	private static List<String> extractDatabaseMethods(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
		List<String> databaseMethods = new ArrayList<String>();
		String expr = "//class[name='" + className + "']/block/function | "
				+ "//class[name='" + className + "']/block/function_decl | " 
		+ "//interface[name='" + className+ "']/block/function_decl | " 
				+ "//enum[name='" + className + "']/block/function | "
						+ "//enum[name='" + className + "']/block/function_decl";
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
				+ "//class[name='" + className + "']/super/implements[name='Serializable']/ancestor::class/block"
				+ "/function_decl[annotation/name='Override']/type/following-sibling::*[not(self::block)] | "
				+ "//class[name='" + className + "']/super/implements[name='Parcelable']/ancestor::class/block"
				+ "/function[annotation/name='Override']/type/following-sibling::*[not(self::block)] | "
				+ "//class[name='" + className + "']/super/implements[name='Parcelable']/ancestor::class/block"
				+ "/function_decl[annotation/name='Override']/type/following-sibling::*[not(self::block)]";

		NodeList methods = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i < methods.getLength(); i++) {
			serializableMethods.add(methods.item(i).getTextContent());
		}
		return serializableMethods;
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
	
	private static HashMap<String, String> extractUiComponents(Document doc, XPath xpath, RoleStereotype role, HashMap<String, String> roleStereotypes) {
		// TODO Auto-generated method stub
		HashMap <String, String> uiComponents = new HashMap <String, String>();
		HashMap <String, String> attributes = role.getAttributes();
		
		for(String attribute : attributes.keySet()) {
			String type = attributes.get(attribute);
			if(!containCollectionObject(type) && !isClass(doc, xpath, type))
				uiComponents.put(attribute, type);
		}
		return uiComponents;
	}
	private static boolean containCollectionObject(String methodBody) {
		for (CollectionObjects cObject : CollectionObjects.values()) {
			if (methodBody.toLowerCase().contains(cObject.name().toLowerCase())) {
				return true;
			}
		}
		return false;
	}
	
	private static HashMap<String, String> extractAttributes(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractAttributes has been accessed");
		Set<String> types = extractAttributeTypes(doc, xpath, className);
		HashMap<String, String> attributes = new HashMap<String, String>();
		for (String type : types) {
			String expr = "//interface[name='" + className + "']/block/decl_stmt/decl/type[name='" + type + "']/ancestor::decl/name | " 
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
	
	private static HashMap<String, String> extractComponentClasses(Document doc, XPath xpath, RoleStereotype role) {
		// TODO Auto-generated method stub
		HashMap<String, String> componentClasses = new HashMap<String, String>();
		HashMap<String, String> attributes = role.getAttributes();
		for (String attribute : attributes.keySet()) {
			if (isClass(doc, xpath, attributes.get(attribute))) {
				componentClasses.put(attribute, attributes.get(attribute));
			}
		}
		return componentClasses;
	}
	
	private static List<String> extractParentClasses(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
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
	
	public static HashMap<String, String> readRoles(String file){
		HashMap<String, String> roles = new HashMap<String, String> ();
		BufferedReader br = null;
		try {			
			br = new BufferedReader(new FileReader(file));
			String line = "";
			while ((line = br.readLine()) != null) {
				// use comma as separator
				String[] cols = line.split(",");
				roles.put(cols[3].toString(), cols[4].toString());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return roles;
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
	
	private static List<String> extractRoles(HashMap<String, String> roleStereotypes, String role) {
		// TODO Auto-generated method stub
		List<String> classes = new ArrayList<>();
		for(String className : roleStereotypes.keySet()) {
			if(roleStereotypes.get(className).equals(role))
				classes.add(className);
		}
		return classes;
	}
}
