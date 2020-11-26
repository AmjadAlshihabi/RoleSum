package roles;

import java.util.*;


public class InformationHolder extends RoleStereotype {
	private String entityName;
	private List<String> attributes = new ArrayList<>();
	private List<String> serializableMethods = new ArrayList<>();
	private List<String> databaseMethods = new ArrayList<>();
	private List<String> declarations = new ArrayList<>();

	public List<String> getAttributes() {
		return this.attributes;
	}

	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}

	public List<String> getSerializableMethods() {
		return this.serializableMethods;
	}

	public void setSerializableMethods(List<String> serializableMethods) {
		this.serializableMethods = serializableMethods;
	}

	public List<String> getDatabaseMethods() {
		return this.databaseMethods;
	}

	public void setDatabaseMethods(List<String> databaseMethods) {
		this.databaseMethods = databaseMethods;
	}

	public List<String> getDeclarations() {
		return this.declarations;
	}

	public void setDeclarations(List<String> declarations) {
		this.declarations = declarations;
	}
}
