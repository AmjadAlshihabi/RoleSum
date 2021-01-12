package roles;

import java.util.*;


public class InformationHolder extends RoleStereotype {
	private List<String> serializableMethods = new ArrayList<>();
	private List<String> databaseMethods = new ArrayList<>();
	public InformationHolder(){
		super();
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