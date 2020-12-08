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

import roles.Coordinator;
import roles.InformationHolder;
import roles.RoleStereotype;
import roles.ServiceProvider;

import java.lang.*;

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
		}catch (SAXException | IOException e){
			e.printStackTrace();
		}catch (ParserConfigurationException e) {
			e.printStackTrace();
		}	
		XPath xpath = XPathFactory.newInstance().newXPath();
		List<String> classes = extractClassNames(doc, xpath);
		for(int i = 0; i<classes.size(); i++) {
			String className = classes.get(i);
			String role = extractRoleStereotype(doc, xpath, className);
			if(role!=null && role.equals("Coordinator"))
				CoSummarizer(doc, xpath, className);
		}
	}
	
	private static void CoSummarizer(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("I am in Co Summarizer");
		RoleStereotype role = new RoleStereotype();
		role.setName(className);
		role.setAttributes(extractAttributes(doc, xpath, className));
		role.setComponentClasses(extractComponentClasses(doc, xpath, role));
		role.setMethods(extractMethods(doc, xpath, className));
		role.setDeclarations(extractUsedObjectsInMethods(doc, xpath, role));
		role.setCustomerClasses(extractConsumerClasses(doc, xpath, role));
		String template = "";
		template += "This "+className+ " is responsible for delegating work between objects: \n";
		List <String> methodTemplates = new ArrayList<String>();
		HashMap <String, List<String>> consumerClasses = role.getCustomerClasses();
		for(String method : consumerClasses.keySet()) {
			String methodTemplate = "";
			List <String> methodInvokes = consumerClasses.get(method);
//			System.out.println("length of methodInvokes is: "+methodInvokes.size());
//			System.out.println("length of consumerClasses is: "+consumerClasses.size());
			
			HashMap<String, List<String>> declarations = role.getDeclarations();
			List<String> usedObjects = declarations.get(method);
			if(methodInvokes.size()==0 || usedObjects.size()==0) {
				continue;
			}else {
				methodTemplate+="\n * The "+ method +" method receives requests from:\n";
				for(int i = 0; i<methodInvokes.size(); i++) {
					methodTemplate += "-	"+methodInvokes.get(i) + "\n";
				}
				methodTemplate += "\n * and delegate the request to: \n";
				for(int i = 0; i<usedObjects.size(); i++) {
					methodTemplate += "-	"+usedObjects.get(i) + "\n";
				}
			}
			methodTemplate +="\n\n";
			methodTemplates.add(methodTemplate);
		}
		if(methodTemplates.size()>0) {
			try {
			      File file = new File("./src/coordinators/"+ className + ".txt");
			      file.createNewFile();
//			      if (file.createNewFile()) {
////			        System.out.println("File created: " + file.getName());
//			      } else {
////			        System.out.println("File already exists.");
//			      }
			    } catch (IOException e) {
//			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			
			try {
			      FileWriter templateWriter = new FileWriter("./src/coordinators/"+ className + ".txt");
			      templateWriter.write(template);
			      for(int i = 0; i<methodTemplates.size(); i++) {				
			    	  templateWriter.write(methodTemplates.get(i));
			      }
			      templateWriter.close();
//			      System.out.println(className);
//			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
//			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
//			System.out.print(template);
		}
	}

	private static HashMap<String, List<String>> extractConsumerClasses(Document doc, XPath xpath,

			RoleStereotype role) {
		//the class is a component.
		//method is imported directly to the unit.
		//the class is imported.
		
		// TODO Auto-generated method stub
//		System.out.println("extractConsumerClasses has been accessed");
		HashMap<String, List <String>> methodInvokes= new HashMap <String, List <String>>();
		String className = role.getName();
		List<String> methods = role.getMethods();
		for(int i = 0; i<methods.size(); i++) {
			String expr = "//unit/class/block//*[name='"+methods.get(i)+"']/ancestor::class/name";
			NodeList nodes = xpathExecuter(doc, xpath, expr);
			List <String> consumerClasses = new ArrayList<String>();
			for(int j = 0; j<nodes.getLength(); j++) {
				consumerClasses.add(nodes.item(j).getTextContent());
			}
			methodInvokes.put(methods.get(i), consumerClasses);
		}
		return methodInvokes;
	}
//	private static HashMap<String, List<String>> extractConsumerClasses(Document doc, XPath xpath,
//			
//			RoleStereotype role) {
//		//the class is a component.
//		//method is imported directly to the unit.
//		//the class is imported.
//		
//		// TODO Auto-generated method stub
////		System.out.println("extractConsumerClasses has been accessed");
//		HashMap<String, List <String>> methodInvokes= new HashMap <String, List <String>>();
//		String className = role.getName();
//		List<String> methods = role.getMethods();
//		String expr = "//unit/import/*[name='"+ className +"']/ancestor::unit/class | "
//				+ "//unit/import/*[name='"+ className +"']/ancestor::unit/interface | "
//				+ "//unit/import/*[name='"+ className +"']/ancestor::unit/enum";
//		NodeList nodes = xpathExecuter(doc, xpath, expr);
//		for(int i = 0; i<methods.size(); i++) {
//			List <String> consumerClasses = new ArrayList<String>();
////			System.out.println("used method: "+methods.get(i));
//			for(int j = 0; j<nodes.getLength(); j++) {
//				if(nodes.item(j).getTextContent().contains(methods.get(i))) {
//					NodeList childNodes = nodes.item(j).getChildNodes();
//					for(int k = 0; k<childNodes.getLength(); k++) {
//						if(childNodes.item(k).getNodeName().equals("name")) {						
//							consumerClasses.add(childNodes.item(k).getTextContent());
////							System.out.println("consumer: "+childNodes.item(k).getTextContent());
//						}
//					}
//				}
//			}
//			methodInvokes.put(methods.get(i), consumerClasses);
//		}
//		return methodInvokes;
//	}

	private static HashMap <String, String> extractImports(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractImports has been accessed");
		HashMap <String, String> imports = new HashMap<String, String>();
		String expr = "//unit/class[name='"+ className+"']/preceding-sibling/import/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for(int i = 0; i<nodes.getLength(); i++) {
			NodeList childNodes = nodes.item(i).getChildNodes();
			for(int j = 0; j<childNodes.getLength(); j++) {
				if(isClass(doc, xpath, childNodes.item(j).getTextContent())) {
					if(j+1<nodes.getLength()) {
						imports.put(childNodes.item(j+1).getTextContent(), childNodes.item(j).getTextContent());
					}else {						
						imports.put(childNodes.item(j).getTextContent(), null);
					}
				}
			}
		}
		return imports;
	}
	
	private static List<String> extractMethodArgument (Document doc, XPath xpath, String className, String methodName){
//		System.out.println("extractMethodArgument has been accessed");
		List<String> argument = new ArrayList<String>();
		String expr = "//class[name='"+ className +"']/block/function[name='"+ methodName +"']"
							+ "/parameter_list/parameter/decl/name | "
						+ "//interface[name='"+ className +"']/block/function[name='"+ methodName +"']"
							+ "/parameter_list/parameter/decl/name | "
						+ "//enum[name='"+ className +"']/block/function[name='"+ methodName +"']"
							+ "/parameter_list/parameter/decl/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for(int i = 0; i<nodes.getLength(); i++) {
			String parameter = nodes.item(i).getTextContent();
			String parameterType = extractParameterType(doc, xpath, className, methodName, parameter);
			if(isClass(doc, xpath, parameterType))
				argument.add(parameterType);
		}
		return argument;
	}
	/* 
	 * returns type of the parameter name for a given method name and class name
	 */
	private static String extractParameterType(Document doc, XPath xpath, String className, String methodName, String parameter) {
//		System.out.println("extractParameterType has been accessed");
		// TODO Auto-generated method stub
		String type = "";
		String expr = "//class[name='"+ className +"']/block/function[name='"+ methodName +"']"
							+ "/parameter_list/parameter/decl[name='"+ parameter +"']/type/name | "
						+ "//interface[name='"+ className +"']/block/function[name='"+ methodName +"']"
							+ "/parameter_list/parameter/decl[name='"+ parameter +"']/type/name |"
						+ "//enum[name='"+ className +"']/block/function[name='"+ methodName +"']"
							+ "/parameter_list/parameter/decl[name='"+ parameter +"']/type/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for(int i = 0; i<nodes.getLength(); i++) {
			type = nodes.item(i).getTextContent();
		}
		return type;
	}
/*
 * 	scenarios where an object could be called:
 * Objects passed in method argument.
 * using a variable of this.class
 * declaring a new object
 * using variables imported directly into the class
 * A hashmap that stores the methods of the class and corresponding used objects within the method body.
 * 
 * 
 * returns a list of used objects in methods of a the given class
 */
	private static HashMap<String, List<String>> extractUsedObjectsInMethods(Document doc, XPath xpath, RoleStereotype role) {
		// TODO Auto-generated method stub
//		System.out.println("extractusedObjectsInMethods has been accessed");
		String className = role.getName();
		// list to store the retrieved methods of the class
		List <String> methods = role.getMethods();
		// Hashmap to save the retrieved attributed of the class.
		HashMap<String, List<String>> declarations = new HashMap<String, List<String>>();
		for(int i = 0; i<methods.size(); i++) {
			String methodName = methods.get(i);
			//extract objects passed in method argument.
			//HashMap to store the argument of methods.get(i)
			List<String> argument = extractMethodArgument(doc, xpath, className, methodName);
			//using variables of this.class
			List<String> usedVariables = extractUsedComponentObject(doc, xpath, role, methodName);
			//declaring a new object
			List<String> declaredObjects = extractDeclaredObjectsInMethods(doc, xpath, role, methodName);
			//using variables imported directly into the class
//			System.out.println("method: "+methodName);
			List<String> importedVariables = extractImportedVariables(doc, xpath, role, methodName);
//			HashMap<String, String> allDeclarations = new HashMap <String, String>();
			List<String> allDeclarations = new ArrayList<String>();
			if(argument.size()>0)
				allDeclarations = Stream.concat(argument.stream(), allDeclarations.stream()).collect(Collectors.toList());
			if(usedVariables.size()>0)
				allDeclarations = Stream.concat(usedVariables.stream(), allDeclarations.stream()).collect(Collectors.toList());
			if(declaredObjects.size()>0)
				allDeclarations = Stream.concat(declaredObjects.stream(), allDeclarations.stream()).collect(Collectors.toList());
			if(importedVariables.size()>0)
				allDeclarations = Stream.concat(importedVariables.stream(), allDeclarations.stream()).collect(Collectors.toList());
			declarations.put(methodName, allDeclarations);
		}
		return declarations;
	}	
//	private static HashMap<String, HashMap<String, String>> extractUsedObjectsInMethods(Document doc, XPath xpath, RoleStereotype role) {
//		// TODO Auto-generated method stub
////		System.out.println("extractusedObjectsInMethods has been accessed");
//		String className = role.getName();
//		// list to store the retrieved methods of the class
//		List <String> methods = role.getMethods();
//		// Hashmap to save the retrieved attributed of the class.
//		HashMap<String, HashMap<String, String>> declarations = new HashMap<String, HashMap<String, String>>();
//		for(int i = 0; i<methods.size(); i++) {
//			String methodName = methods.get(i);
//			//extract objects passed in method argument.
//			//HashMap to store the argument of methods.get(i)
//			HashMap<String, String> argument = extractMethodArgument(doc, xpath, className, methodName);
//			//using variables of this.class
//			HashMap<String, String> usedVariables = extractUsedComponentObject(doc, xpath, role, methodName);
//			//declaring a new object
//			HashMap<String, String> declaredObjects = extractDeclaredObjectsInMethods(doc, xpath, role, methodName);
//			//using variables imported directly into the class
////			System.out.println("method: "+methodName);
//			HashMap<String, String> importedVariables = extractImportedVariables(doc, xpath, role, methodName);
//			HashMap<String, String> allDeclarations = new HashMap <String, String>();
//			allDeclarations.putAll(argument);
//			allDeclarations.putAll(usedVariables);
//			allDeclarations.putAll(declaredObjects);
//			allDeclarations.putAll(importedVariables);
//			declarations.put(methodName, allDeclarations);
//		}
//		return declarations;
//	}	

private static List<String> extractImportedVariables(Document doc, XPath xpath, RoleStereotype role,
			String methodName) {
		// TODO Auto-generated method stub
//	System.out.println("extractImportedVariables has been accessed");
	HashMap <String, String> imports = role.getImports();
	if(imports.size()==0) {
		return new ArrayList<String> ();
	}
	List <String> usedImports = new ArrayList<String> ();
	String className = role.getName();
	String expr = "//class[name = '"+ className +"']/block/function[name='"+ methodName +"']/block/block_content";
	NodeList nodes = xpathExecuter(doc, xpath, expr);
	for(int i = 0; i< nodes.getLength(); i++) {
		for(String importVariable: imports.keySet()) {
			if(nodes.item(i).getTextContent().contains(importVariable))
				usedImports.add(imports.get(importVariable));
		}
	}
		return usedImports;
	}

private static List<String> extractDeclaredObjectsInMethods(Document doc, XPath xpath,
			RoleStereotype role, String methodName) {
		// TODO Auto-generated method stub
//	System.out.println("extractDeclaredObjectsInMethods has been accessed");
	List<String> declaredObjects = new ArrayList <String>();
	String className = role.getName();
		String expr = "//class[name = '"+ className +"']/block/function[name='"+ methodName +"']/block/block_content//decl_stmt/decl/type/name";
		NodeList type = xpathExecuter(doc, xpath, expr);
		for(int j = 0; j<type.getLength(); j++) {			
//			System.out.println(type.item(j).getTextContent()+" "+object);
			if(isClass(doc, xpath, type.item(j).getTextContent())) {
				declaredObjects.add(type.item(j).getTextContent());
			}
		}
		return declaredObjects;
}
//private static HashMap<String, String> extractDeclaredObjectsInMethods(Document doc, XPath xpath,
//		RoleStereotype role, String methodName) {
//	// TODO Auto-generated method stub
////	System.out.println("extractDeclaredObjectsInMethods has been accessed");
//	HashMap<String, String> declaredObjects = new HashMap<String, String>();
//	String className = role.getName();
//	String expr = "//class[name = '"+ className +"']/block/function[name='"+ methodName +"']/block/block_content//decl_stmt/decl/name";
////						+ "//class[name = '"+ className +"']/block/function[name='"+ methodName +"']/block/block_content//decl_stmt/decl/type/name/name";
//	NodeList nodes = xpathExecuter(doc, xpath, expr);
//	for(int i = 0; i<nodes.getLength(); i++) {
//		String object = nodes.item(i).getTextContent();
//		expr = "//class[name = '"+ className +"']/block/function[name='"+ methodName +"']/block/block_content//decl_stmt/decl[name='"+object+"']/type/name";
//		NodeList type = xpathExecuter(doc, xpath, expr);
//		for(int j = 0; j<type.getLength(); j++) {			
////			System.out.println(type.item(j).getTextContent()+" "+object);
//			if(isClass(doc, xpath, type.item(j).getTextContent())) {
//				declaredObjects.put(object, type.item(j).getTextContent());
//			}
//		}
//		
//	}
//	return declaredObjects;
//}

private static List< String> extractUsedComponentObject(Document doc, XPath xpath,
			RoleStereotype role, String methodName) {
		// TODO Auto-generated method stub
//	System.out.println("extractUsedComponentObject has been accessed");
		List<String> usedVariables = new ArrayList<String>();
		String className = role.getName();
		HashMap <String, String> components = role.getComponentClasses();
		String expr = "//class[name='"+ className +"']/block/function[name='"+methodName+"']/block/block_content";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for(int i = 0; i<nodes.getLength(); i++) {
			for ( String component: components.keySet() ) {
				if(nodes.item(i).getTextContent().contains(component)) {
//					System.out.println(components.get(component)+" "+component);
					usedVariables.add(components.get(component));
				}
			}
		}
		return usedVariables;
	}

	private static List <String> extractMethods(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractMethods has been accessed");
		List <String> methods = new ArrayList<String>();
		String expr = "//class[name='"+ className+"']/block/function/name | "
				+ "//interface[name='"+ className+"']/block/function/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for(int i = 0; i < nodes.getLength(); i++) {
			String name = nodes.item(i).getTextContent();
			methods.add(name);
		}
		return methods;
	}
	
	private static HashMap <String, String> extractMethodParameters (Document doc, XPath xpath, String className, String method) {
		// TODO Auto-generated method stub
//		System.out.println("extractMethod Parameters has been accessed");
		HashMap <String, String> argument = new HashMap <String, String>();
		String expr = "//class[name='"+ className+"']/block/function[name='"+method+"']/parameter_list/parameter/name | "
				+ "//interface[name='"+ className+"']/block/function[name='"+method+"']/parameter_list/parameter/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for(int i = 0; i < nodes.getLength(); i++) {
			String parameter = nodes.item(i).getTextContent();
			String type = extractMethodParameterType(doc, xpath, className, method, parameter);
			argument.put(parameter, type);
		}
		return argument;
	}
	
	private static String extractMethodParameterType (Document doc, XPath xpath, String className, String method, String parameter) {
		// TODO Auto-generated method stub
//		System.out.println("extractMethodParameterType has been accessed");
		String type = "";
		String expr = "//class[name='"+ className +"']/block/function[name='"+ method +"']/parameter_list/parameter[name='"+ parameter +"']decl/type/name | "
				+ "//interface[name='"+ className +"']/block/function[name='"+ method +"']/parameter_list/parameter[name='"+ parameter +"']/decl/type/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for(int i = 0; i < nodes.getLength(); i++) {
			type = nodes.item(i).getTextContent();
		}
		return type;
	}

	private static HashMap <String, String> extractComponentClasses(Document doc, XPath xpath, RoleStereotype role) {
		// TODO Auto-generated method stub
//		System.out.println("extractComponentClasses has been accessed");
		HashMap <String, String> componentClasses = new HashMap<String, String>();
		HashMap <String, String> attributes = role.getAttributes();
		for ( String attribute : attributes.keySet() ) {
		    if(isClass(doc, xpath, attributes.get(attribute))) {		    	
		    	componentClasses.put(attribute, attributes.get(attribute));
		    }
		}
		return componentClasses;
	}	
	
	private static boolean isClass (Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("isClass has been accessed");
		String expr = "//class[name='"+ className+"']/name | "
				+ "//enum[name='"+ className+"']/name | "
				+ "//interface[name='"+ className+"']/name";
		if(xpathExecuter(doc, xpath, expr).getLength()>0) {
			return true;
		}
		return false;
	}
	
	private static List<String> extractParentClasses(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractParentClasses has been accessed");
		NodeList nodes = null;
		List <String> parents = new ArrayList<String>();;
		String expr = "//class[name='"+ className+"']/super_list/extends/super/name | "
				+ "//enum[name='"+ className+"']/super_list/extends/super/name |"
				+ "//interface[name='"+ className+"']/super_list/extends/super/name";
		nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i<nodes.getLength(); i++) {
			parents.add(nodes.item(i).getTextContent());
		}
		return parents;
	}

	private static HashMap <String, String> extractAttributes(Document doc, XPath xpath, String className){
		// TODO Auto-generated method stub
//		System.out.println("extractAttributes has been accessed");
		Set<String> types = extractAttributeTypes(doc, xpath, className);
		HashMap<String, String> attributes = new HashMap<String, String>();
		for (String type : types) {
			String expr = "//interface[name='"+ className+"']/block/decl_stmt/decl/type[name='" + type + "']/ancestor::decl/name | "
					+ "//class[name='"+ className+"']/block/decl_stmt/decl/type[name='" + type + "']/ancestor::decl/name | "
					+ "//enum[name='"+ className+"']/block/decl_stmt/decl/type[name='" + type + "']/ancestor::decl/name";
			NodeList nodes = xpathExecuter(doc, xpath, expr);
			for(int i = 0; i<nodes.getLength(); i++) {
				String attribute = nodes.item(i).getTextContent();
				attributes.put(attribute, type);
			}
		}
		return attributes;
	}
	
	private static Set<String> extractAttributeTypes(Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractAttributeTypes has been accessed");
		String expr = "//class[name='"+ className+"']/block/decl_stmt/decl/type/name | "
				+ "//enum[name='"+ className+"']/block/decl_stmt/decl/type/name |"
				+ "//interface[name='"+ className+"']/block/decl_stmt/decl/type/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		Set <String> types = new HashSet<String>();
		for (int i=0; i<nodes.getLength(); i++) {
			types.add(nodes.item(i).getTextContent());
		}
		return types;
	}
	
	private static NodeList xpathExecuter (Document doc, XPath xpath, String expr) {
		// TODO Auto-generated method stub
		NodeList nodes = null;
		try {
			nodes = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		return nodes;
	}
	
	private static String extractRoleStereotype (Document doc, XPath xpath, String className) {
		// TODO Auto-generated method stub
//		System.out.println("extractRoleStereotype has been accessed");
		String expr = "//enum[name='"+ className +"']/@role_stereotype | "
				+ "//class[name='"+ className +"']/@role_stereotype | "
				+ "//interface[name='"+ className +"']/@role_stereotype";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		String role = null;
			for (int i = 0; i< nodes.getLength(); i++) {
				role = nodes.item(i).getNodeValue();
			}
			return role;
		}
	
	private static List<String> extractClassNames(Document doc, XPath xpath) {
		// TODO Auto-generated method stub
//		System.out.println("extractClassNames has been accessed");
		List <String> classNames = new ArrayList<String>();
		String expr = "//enum/name | //class/name | //interface/name";
		NodeList nodes = xpathExecuter(doc, xpath, expr);
		for (int i = 0; i<nodes.getLength(); i++) {
			classNames.add(nodes.item(i).getTextContent());
		}
		return classNames;
	}
	
}
