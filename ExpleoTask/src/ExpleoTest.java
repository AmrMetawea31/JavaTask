import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ExpleoTest {

	
	@Test
	void TestHire() {
		Employee A = new Employee("A", 1000);
		Employee B = new Employee("B", 1001);
		Employee C = new Employee("C", 1002);
		Employee D = new Employee("D", 1003);
		Employee E = new Employee("E", 1004);
		Employee F = new Employee("F", 1005);
		
		ArrayList<Employee> employeeList2 = new ArrayList<>();
		
		employeeList2.add(A);
		employeeList2.add(B);
		employeeList2.add(C);
		employeeList2.add(D);
		employeeList2.add(E);
		employeeList2.add(F);
		EngineeringExpleoEmployee x = new EngineeringExpleoEmployee(employeeList2);
		
		String name1= "Amr";		
		x.hire(name1, employeeList2);		
		assertEquals(employeeList2.get(6).getName(), "Amr");
	}
	
	@Test
	void TestID() {
		Employee A = new Employee("A", 1000);
		Employee B = new Employee("B", 1001);
		Employee C = new Employee("C", 1002);
		Employee D = new Employee("D", 1003);
		Employee E = new Employee("E", 1004);
		Employee F = new Employee("F", 1005);
		
		ArrayList<Employee> employeeList2 = new ArrayList<>();
		
		employeeList2.add(A);
		employeeList2.add(B);
		employeeList2.add(C);
		employeeList2.add(D);
		employeeList2.add(E);
		employeeList2.add(F);
		
		EngineeringExpleoEmployee x = new EngineeringExpleoEmployee(employeeList2);
		
		x.toString(employeeList2);
	}
	
	@Test
	void TestResignOrFire() {
		Employee A = new Employee("A", 1000);
		Employee B = new Employee("B", 1001);
		Employee C = new Employee("C", 1002);
		Employee D = new Employee("D", 1003);
		Employee E = new Employee("E", 1004);
		Employee F = new Employee("F", 1005);
		
		ArrayList<Employee> employeeList2 = new ArrayList<>();
		
		employeeList2.add(A);
		employeeList2.add(B);
		employeeList2.add(C);
		employeeList2.add(D);
		employeeList2.add(E);
		employeeList2.add(F);
		EngineeringExpleoEmployee x = new EngineeringExpleoEmployee(employeeList2);
		
		String name= "F";
		x.resignOrFire(name, employeeList2);
		assertEquals(employeeList2.get(5).getStatus(), "Not Active");
	}
	
	@Test
	void TestAssign() {
		Employee A = new Employee("A", 1000);
		Employee B = new Employee("B", 1001);
		Employee C = new Employee("C", 1002);
		Employee D = new Employee("D", 1003);
		Employee E = new Employee("E", 1004);
		Employee F = new Employee("F", 1005);
		
		ArrayList<Employee> employeeList2 = new ArrayList<>();
		
		employeeList2.add(A);
		employeeList2.add(B);
		employeeList2.add(C);
		employeeList2.add(D);
		employeeList2.add(E);
		employeeList2.add(F);
		
		EngineeringExpleoEmployee x = new EngineeringExpleoEmployee(employeeList2);
			String name = "A";
			String project = "AUDI";
			
		x.assign(name, project);
		assertEquals(employeeList2.get(0).getprojectName(), "AUDI");
		
		
	}
}
