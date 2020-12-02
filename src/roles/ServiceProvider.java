package roles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServiceProvider extends RoleStereotype{
	
	private String entityName = "";
//	private List<String> attributes = new ArrayList<>();
	private List<String> services = new ArrayList<>();
	private HashMap<String, Integer> configurations = new HashMap<String, Integer>();
//	private List<String> declarations = new ArrayList<>();
	HashMap<String, List<String>> clientObjects = new HashMap<String, List<String>>();
	
	public HashMap<String, List<String>> getClientObjects() {
		return this.clientObjects;
	}

	public void setClientObjects(HashMap<String, List<String>> clientObjects) {
		this.clientObjects = clientObjects;
	}

	public ServiceProvider(){
		super();
	}

	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public List<String> getServices() {
		return this.services;
	}

	public void setServices(List<String> services) {
		this.services = services;
	}

	public HashMap<String, Integer> getConfigurations() {
		return this.configurations;
	}

	public void setConfigurations(HashMap<String, Integer> configurations) {
		this.configurations = configurations;
	}
	

}
