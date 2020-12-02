package roles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class InformationHolder extends RoleStereotype {
	private String entityName;
	private List<String> attributes = new ArrayList<>();
	private List<String> serializableMethods = new ArrayList<>();
	private List<String> databaseMethods = new ArrayList<>();
	private List<String> declarations = new ArrayList<>();
	public InformationHolder(){
		super();
	}
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
	
//	public static void summarizeIH(InformationHolder IHclass) {
//		String template = "the %(className) Information Holder is responsible for:\n";
//		template = template.replace("%(className)", IHclass.getEntityName());
//		if (IHclass.getAttributes().size()>0) {
//			String attributes = "";
//			List <String> attributeList = IHclass.getAttributes();
//			for (int i = 0; i<attributeList.size(); i++) {
//				attributes += attributeList.get(i) + "\n";
//			}
//			template += "managing and holding information about:\n"
//					+ "%(attributes)\n";
//			template = template.replace("%(attributes)", attributes);
//		}
//		if (IHclass.getSerializableMethods().size()>0) {
//			String serializationMethods = "";
//			List <String> serializationList = IHclass.getSerializableMethods();
//			for (int i = 0; i<serializationList.size(); i++) {
//				serializationMethods += serializationList.get(i) + "\n";
//			}
//			template += "Serialization of object, list of overriden method:\n"
//					+ "%(serializationMethods)\n";
//			template = template.replace("%(serializationMethods)", serializationMethods);
//		}
//		if(IHclass.getDatabaseMethods().size()>0) {
//			String databaseMethods = "";
//			List <String> databaseList = IHclass.getDatabaseMethods();
//			for (int i = 0; i<databaseList.size(); i++) {
//				databaseMethods += databaseList.get(i) + "\n";
//			}
//			template += "Managing database tasks through the following methods\n"
//					+ "%(databaseMethods)\n";
//			template = template.replace("%(databaseMethods)", databaseMethods);
//		}
//		if(IHclass.getDeclarations().size()>0) {
//			String declarationClasses = "";
//			List <String> declarationsList = IHclass.getDeclarations();
//			for (int i = 0; i<declarationsList.size(); i++) {
//				declarationClasses += declarationsList.get(i) + "\n";
//			}
//			template += "Providing information to the following objects:\n"
//					+ "%(declarationClasses)\n";
//			template = template.replace("%(declarationClasses)", declarationClasses);
//		}
////		System.out.print(template);
//		try {
//		      File file = new File("./src/textSummaries/"+IHclass.getEntityName() + ".txt");
//		      if (file.createNewFile()) {
//		        System.out.println("File created: " + file.getName());
//		      } else {
//		        System.out.println("File already exists.");
//		      }
//		    } catch (IOException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		    }
//		
//		try {
//		      FileWriter templateWriter = new FileWriter("./src/textSummaries/"+IHclass.getEntityName() + ".txt");
//		      templateWriter.write(template);
//		      templateWriter.close();
//		      System.out.println("Successfully wrote to the file.");
//		    } catch (IOException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		    }
//	}
}
