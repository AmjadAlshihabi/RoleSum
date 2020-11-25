package roles;

import java.util.*;


public class InformationHolder extends RoleStereotype {
	private String entityName;
	private List<String> attributes = null;
	private List<String> serializableMethods = null;
	private List<String> databaseMethods = null;

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

}
