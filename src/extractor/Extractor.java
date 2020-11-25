package extractor;

import org.w3c.dom.*;

import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.IOException;
import java.util.*;
import org.xml.sax.SAXException;
import roles.InformationHolder;
import java.lang.*;

public class Extractor {
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
		List<String> IHclasses = IHClassNames(doc, xpath);
//		 ectracting names of Service Provider classes from the xml file
//		List<String> SPclasses = SPClassNames(doc, xpath);
//		 ectracting names of Structurer classes from the xml file
//		List<String> STclasses = STClassNames(doc, xpath);
//		 ectracting names of Coordinators classes from the xml file
//		List<String> COclasses = COClassNames(doc, xpath);
//		 ectracting names of Controller classes from the xml file
//		List<String> CTclasses = CTClassNames(doc, xpath);
//		 ectracting names of Interfacer classes from the xml file
//		List<String> ITclasses = ITClassNames(doc, xpath);
		
//		list to hold the InformationHolder objects
		List<InformationHolder> IH = new ArrayList<InformationHolder>();
		for (int i = 0; i<IHclasses.size(); i++) {
			String className = IHclasses.get(i);
			InformationHolder infoHolder = new InformationHolder();
			infoHolder.setEntityName(className);
			infoHolder.setAttributes(extractAttributes(doc, xpath, className));
			infoHolder.setSerializableMethods(extractSerializableMethods(doc, xpath, className));
			infoHolder.setDatabaseMethods(extractDatabaseMethods(doc, xpath, className));
			summarizeIH(infoHolder);
			IH.add(infoHolder);
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
	}

	private static void summarizeIH(InformationHolder IHclass) {
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
		System.out.print(template);
	}
//	extracting names of classes from the xml file
	private static List<String> IHClassNames(Document doc, XPath xpath) {
		// TODO Auto-generated method stub
		NodeList IH = null;
		List <String> classNames = new ArrayList<String>();
		try {
			String expr = "//enum[@role_stereotype='Information Holder']/name | "
					+ "//class[@role_stereotype='Information Holder']/name | "
					+ "//interface[@role_stereotype='Information Holder']/name";
			IH = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i<IH.getLength(); i++) {
				classNames.add(IH.item(i).getTextContent());
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
			String expr = "//class[name='"+ className+"']/block/decl_stmt//name | "
					+ "//enum[name='"+ className+"']/block/decl_stmt//name |"
					+ "//interface[name='"+ className+"']/block/decl_stmt//name";
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
//		extract the extended or implemented classes for the className passed in the argument
		try {
			String expr = "//class[name='"+ className+"']/super_list/implements/super/name | "
					+ "//enum[name='"+ className+"']/super_list/implements/super/name | "
					+ "//interface[name='"+ className+"']/super_list/implements/super/name |"
							+ "//interface[name='"+ className+"']/super_list/extends/name";
			serializableNodes = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
//		check if the class or interface implements/extends Serializable or Parcelable interfaces
		for(int i = 0; i<serializableNodes.getLength(); i++) {
			String serializable = serializableNodes.item(i).getTextContent();
			if(serializable.equals("Serializable") | serializable.equals("Parcelable")) {
				try {
					String expr = "//class[name='"+ className+"']/block/function[annotation/name='Override']/*[not(self::block)] | "
							+ "//enum[name='"+ className+"']/block/function[annotation/name='Override']/*[not(self::block)] | "
							+ "//interface[name='"+ className+"']/block/function[annotation/name='Override']/*[not(self::block)]";
					serializableMethods = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
//					System.out.println("the length is" + serializableMethods.getLength());
				}catch(XPathExpressionException e) {
					e.printStackTrace();
				}
			}
		}
//		saving the functions' signature for the className as strings;
		if(serializableMethods!=null) {
			String method = "";
			for(int i = 0; i<serializableMethods.getLength(); i++) {
//				List<String> method = new ArrayList<String>();
				method += serializableMethods.item(i).getTextContent() + " ";
				if(serializableMethods.item(i).getNodeName().equals("parameter_list")) {
					serializables.add(method);					
					method = "";
				}
//				serializables.add(serializableMethods.item(i).getTextContent());
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
//				String item = null;
//				try {					
//					item = methodNode.item(i).getTextContent();
//				}catch(NullPointerException e) {
//					continue;
//				}
				
//				if (!item.equals("String") | !item.equals("char") | !item.equals("float") | !item.equals("double") | 
//						!item.equals("long") | !item.equals("int") | !item.equals("short") | 
//						!item.equals("byte") | !item.equals("boolean") | !item.equals("final") | !item.equals("public") | 
//						!item.equals("") | !item.equals("private") | !item.equals("void") | !item.equals("statix") | !item.equals("final")) {					
//				}
//				we exclude the last child node (<block>) which is the the body of the method 
//				so we only save the method declaration and signature.	
				for(int j = 0; j < methodNode.getLength()-1; j++) {
					method += methodNode.item(j).getTextContent();
				}
//				String returnMethod = getMethodName(method);
//				System.out.println(returnMethod);
				methods.add(method);
			}
		}
		return methods;
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