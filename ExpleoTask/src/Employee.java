
public class Employee {
	
	 String name;
	 int sapID ;
	boolean flag = true;
	String projectName = "OnBench";
	String status = "Active";
	
	public Employee(String name, int sapID) {
		this.name = name;
		this.sapID = sapID;
		
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSapID() {
		return sapID;
	}
	public void setSapID(int a) {
		this.sapID = sapID+a;
	}
	
	public boolean getFlag() {
		return flag;
	}
	
	public void setFlag(boolean flag) {
		this.flag= flag;
	}
	public String getprojectName() {
		return projectName;
	}
	public void setprojectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
