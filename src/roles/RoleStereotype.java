package roles;

import java.util.*;

public class RoleStereotype {
	private String name; //
	private String role; //
	private String path; //
	private HashMap <String, String> attributes = new HashMap <String, String> (); //
	private List <String> parentClasses = new ArrayList<String>();//
	private List <String> implementedInterfaces = new ArrayList<String>();//
	private HashMap <String, String> componentClasses= new HashMap <String, String> ();//
	private List <String> methods = new ArrayList<String>();//
	private HashMap <String, String> imports = new HashMap <String, String>();//
	private HashMap<String, List<String>> declarations = new HashMap<String, List<String>>();//
	private HashMap <String, List<String>> customerClasses = new HashMap <String, List<String>>();//
	
	public List<String> getImplementedInterfaces() {
		return implementedInterfaces;
	}
	public void setImplementedInterfaces(List<String> implementedInterfaces) {
		this.implementedInterfaces = implementedInterfaces;
	}
	
	public HashMap<String, List<String>> getCustomerClasses() {
		return this.customerClasses;
	}
	public void setCustomerClasses(HashMap<String, List<String>> customerClasses) {
		this.customerClasses = customerClasses;
	}
	public List<String> getParentClasses() {
		return this.parentClasses;
	}
	public void setParentClasses(List<String> parentClasses) {
		this.parentClasses = parentClasses;
	}
	public HashMap<String, String> getComponentClasses() {
		return this.componentClasses;
	}
	public void setComponentClasses(HashMap<String, String> componentClasses) {
		this.componentClasses = componentClasses;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public HashMap <String, String> getImports() {
		return imports;
	}
	public void setImports(HashMap <String, String> imports) {
		this.imports = imports;
	}
	public List <String> getMethods() {
		return this.methods;
	}
	public void setMethods(List <String> methods) {
		this.methods = methods;
	}
	public HashMap <String, String> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(HashMap <String, String> attributes) {
		this.attributes = attributes;
	}
	public HashMap<String, List<String>> getDeclarations() {
		return this.declarations;
	}
	public void setDeclarations(HashMap<String, List<String>> declarations) {
		this.declarations = declarations;
	}
	public void setPath(String path) {
		// TODO Auto-generated method stub
		this.path = path;
	}
	public String getPath(String path) {
		// TODO Auto-generated method stub
		return this.path;
	}
}