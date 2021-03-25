import java.util.ArrayList;
import java.util.Scanner;

public class ExpleoEmployee {
	
	static ArrayList<Employee> employeeList = new ArrayList<>();
	public ExpleoEmployee(ArrayList<Employee> employeeList) {
		this.employeeList=employeeList;
	}
	
	
	public static void hire(String name, ArrayList <Employee> employeeList)
	{
		
		   int tempID = employeeList.get(employeeList.size()-1).getSapID(); 
		  
		   Employee temp = new Employee(name, tempID+1 );
		   employeeList.add(temp);	     
	}
	
	public static void toString(ArrayList <Employee> employeeList) {
	
		System.out.println("The employees ID:");
	for(int i=0; i<employeeList.size(); i++) {

		System.out.println("Name:"+" " + employeeList.get(i).getName() + '\t' +"sapID:"+" " + employeeList.get(i).getSapID());

	}
	}
	
	public static void resignOrFire(String name, ArrayList <Employee> employeeList) {

		for(int i =0; i< employeeList.size();i++) {
			if(employeeList.get(i).getName().equalsIgnoreCase(name)) {
			if(employeeList.get(i).getFlag() !=false) {
					employeeList.get(i).setFlag(false);
					employeeList.get(i).setStatus("Not Active");
				}
			}
		}
	}
}
