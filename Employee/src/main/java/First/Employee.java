package First;

public class Employee {

	private int id;
	private String Fname;
	private String department;
	private int salary;
	
	

	public Employee(int id, String Fname, String department, int salary) {
        this.id = id;
        this.Fname = Fname;
        this.department = department;
        this.salary = salary;
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
