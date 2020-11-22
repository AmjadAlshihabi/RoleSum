package roles;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.NodeList;

public class RoleStereotype {
	private List<String> parentClasses = null;
	private List<String> componentClasses = null;

	public List<String> getParentClasses() {
		return this.parentClasses;
	}
	public void setParentClasses(List<String> parentClasses) {
		this.parentClasses = parentClasses;
	}
	public List<String> getComponentClasses() {
		return this.componentClasses;
	}
	public void setComponentClasses(List<String> componentClasses) {
		this.componentClasses = componentClasses;
	}
}