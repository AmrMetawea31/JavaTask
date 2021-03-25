import java.util.ArrayList;
import java.util.Scanner;

class EngineeringExpleoEmployee extends ExpleoEmployee {

	
	public EngineeringExpleoEmployee(ArrayList <Employee> employeeList) {
		super(employeeList);	
	}
	
	public static void assign(String name, String projectName) {
		for(int i=0; i<employeeList.size(); i++) {
			if(employeeList.get(i).getName().equalsIgnoreCase(name)) {
				employeeList.get(i).setprojectName(projectName);
			}
		}
	}
	

}
