package first;

public class Employee {

	private int id;
	private String name;
	private String Department;
	private int salary;
	
	public Employee(int id,String name,String Department,int salary)
	{
		this.id=id;
		this.name=name;
		this.Department=Department;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getname()
	{
		return name;
	}
	public void setname( String name)
	{
		this.name=name;
	}
	
	public String getDepartment()
	{
		return Department;
	}
	public void setDepartment(String Department)
	{
		this.Department=Department;
	}
	
	public int getsalary()
	{
		return salary;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	
}
