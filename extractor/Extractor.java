package extractor;

import org.w3c.dom.*;

import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.SAXException;

import roles.InformationHolder;
import roles.RoleStereotype;


public class Extractor {
	
	public static void main(String[] args) {
		
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(true);
		DocumentBuilder builder;
		Document doc = null;
		try {
			builder = domFactory.newDocumentBuilder();
			doc = builder.parse("./src/extractor/k9.xml");
		}catch (SAXException | IOException e){
			e.printStackTrace();
		}catch (ParserConfigurationException e) {
			e.printStackTrace();
		}		
		
		XPath xpath = XPathFactory.newInstance().newXPath();
		
		List<String> IHclasses = IHClassNames(doc, xpath);
//		List<String> SPclasses = SPClassNames(doc, xpath);
//		List<String> STclasses = STClassNames(doc, xpath);
//		List<String> COclasses = COClassNames(doc, xpath);
//		List<String> CTclasses = CTClassNames(doc, xpath);
//		List<String> ITclasses = ITClassNames(doc, xpath);
//		System.out.println("..............................................Information Holders");
//		for (int i = 0; i<IHclasses.size(); i++) {
//			System.out.println(IHclasses.get(i));
//		}
//		System.out.println("..............................................Service Provider");
//		for (int i = 0; i<SPclasses.size(); i++) {
//			System.out.println(SPclasses.get(i));
//		}
//		System.out.println("..............................................Structurers");
//		for (int i = 0; i<STclasses.size(); i++) {
//			System.out.println(STclasses.get(i));
//		}
//		System.out.println("..............................................Coordinators");
//		for (int i = 0; i<COclasses.size(); i++) {
//			System.out.println(COclasses.get(i));
//		}
//		System.out.println("..............................................Controllers");
//		for (int i = 0; i<CTclasses.size(); i++) {
//			System.out.println(CTclasses.get(i));
//		}
//		System.out.println("..............................................Interfacers");
//		for (int i = 0; i<ITclasses.size(); i++) {
//			System.out.println(ITclasses.get(i));
//		}
		List<InformationHolder> IH = new ArrayList<InformationHolder>();
		for (int i = 0; i<IHclasses.size(); i++) {
			InformationHolder infoHolder = new InformationHolder();
			infoHolder.setAttributes(extractAttributes(doc, xpath, IHclasses.get(i)));
			infoHolder.setEntityName(IHclasses.get(i));
			IH.add(infoHolder);
		}
		List<String> test = IH.get(9).getAttributes();
		System.out.println(".."+IH.get(9).getEntityName());
		for (int i =0; i<test.size();i++) {
			System.out.println(test.get(i));
		}
	}
	
	private static List<String> extractAttributes(Document doc, XPath xpath, String className){
		NodeList attrib = null;
		List<String> attributes = new ArrayList<String>();
		try {
			String expr = "//unit/class[name='"+ className+"']/block/decl_stmt | "
					+ "//unit/enum[name='"+ className+"']/block/decl_stmt |"
					+ "//unit/interface[name='"+ className+"']/block/decl_stmt";
			attrib = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i<attrib.getLength(); i++) {
				attributes.add(attrib.item(i).getTextContent());
			}
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		return attributes;
	}
	
	private static List<String> IHClassNames(Document doc, XPath xpath) {
		// TODO Auto-generated method stub
		NodeList IH = null;
		List <String> classNames = new ArrayList<String>();
		try {
			String expr = "//unit/enum[@role_stereotype = 'Information Holder']/name | "
					+ "//unit/class[@role_stereotype = 'Information Holder']/name | "
					+ "//unit/interface[@role_stereotype = 'Information Holder']/name";
			IH = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);

			for (int i = 0; i<IH.getLength(); i++) {
				classNames.add(IH.item(i).getTextContent());
			}
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		return classNames;
	}
	
	private static List<String> SPClassNames(Document doc, XPath xpath) {
		// TODO Auto-generated method stub
		NodeList SP = null;
		List <String> classNames = new ArrayList<String>();
		try {
			String expr = "//unit/enum[@role_stereotype = 'Service Provider']/name | "
					+ "//unit/class[@role_stereotype = 'Service Provider']/name | "
					+ "//unit/interface[@role_stereotype = 'Service Provider']/name";
			SP = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i<SP.getLength(); i++) {
				classNames.add(SP.item(i).getTextContent());
			}
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		return classNames;
	}
	
	private static List<String> STClassNames(Document doc, XPath xpath) {
		// TODO Auto-generated method stub
		NodeList ST = null;
		List <String> classNames = new ArrayList<String>();
		try {
			String expr = "//unit/enum[@role_stereotype = 'Structurer']/name | "
					+ "//unit/class[@role_stereotype = 'Structurer']/name | "
					+ "//unit/interface[@role_stereotype = 'Structurer']/name";
			ST = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);

			for (int i = 0; i<ST.getLength(); i++) {
				classNames.add(ST.item(i).getTextContent());
			}
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		return classNames;
	}
	
	private static List<String> COClassNames(Document doc, XPath xpath) {
		NodeList CO = null;
		List <String> classNames = new ArrayList<String>();
		try {
			String expr = "//unit/enum[@role_stereotype = 'Coordinator']/name | "
					+ "//unit/class[@role_stereotype = 'Coordinator']/name | "
					+ "//unit/interface[@role_stereotype = 'Coordinator']/name";
			CO = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);

			for (int i = 0; i<CO.getLength(); i++) {
				classNames.add(CO.item(i).getTextContent());
			}
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		return classNames;
	}
	
	private static List<String> CTClassNames(Document doc, XPath xpath) {
		// TODO Auto-generated method stub
		NodeList CT = null;
		List <String> classNames = new ArrayList<String>();
		try {
			String expr = "//unit/enum[@role_stereotype = 'Controller']/name | "
					+ "//unit/class[@role_stereotype = 'Controller']/name | "
					+ "//unit/interface[@role_stereotype = 'Controller']/name";
			CT = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
			
			for (int i = 0; i<CT.getLength(); i++) {
				classNames.add(CT.item(i).getTextContent());
			}
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		return classNames;
	}
	
	private static List<String> ITClassNames(Document doc, XPath xpath) {
		NodeList IT = null;
		List <String> classNames = new ArrayList<String>();
		try {
			String expr = "//unit/enum[@role_stereotype = 'Interfacer']/name | "
					+ "//unit/class[@role_stereotype = 'Interfacer']/name | "
					+ "//unit/interface[@role_stereotype = 'Interfacer']/name";
			IT = (NodeList) xpath.compile(expr).evaluate(doc, XPathConstants.NODESET);
			
			for (int i = 0; i<IT.getLength(); i++) {
				classNames.add(IT.item(i).getTextContent());
			}
		}catch(XPathExpressionException e) {
			e.printStackTrace();
		}
		return classNames;
	}
}
