package extractor;

import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;
import roles.InformationHolder;

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
			IH.add(infoHolder);
		}
//		testing the methods
		for (int i =0; i<IH.size();i++) {
			System.out.println(IH.get(i).getEntityName());
			List<String> test = IH.get(i).getSerializableMethods();
			for (int j =0; j<test.size();j++) {
				System.out.println(test.get(j));
			}
		}
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
			String expr = "//class[name='"+ className+"']/block/decl_stmt | "
					+ "//enum[name='"+ className+"']/block/decl_stmt |"
					+ "//interface[name='"+ className+"']/block/decl_stmt";
			attributesNodes = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i<attributesNodes.getLength(); i++) {
				attributes.add(attributesNodes.item(i).getTextContent());
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
					System.out.println("the length is" + serializableMethods.getLength());
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