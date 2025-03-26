package First;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class EmpDAO implements IEmp {

	@Override
	public void addEmp(Emp emp) {
		System.out.println("This is ADD Employee method");		
	}

	@Override
	public int getEmp(int id) {
		System.out.println("This is GET Employee method");		
		return id;
	}

	@Override
	public List<Emp> getAllEmployee() {
		System.out.println("This is GET All Employee method");		
		return null;
	}

	@Override
	public int deleteEmp(int id) {
		System.out.println("This is Delete Employee method");		
		return id;
	}

	@Override
	public void updateEmp(int id,int Salary) {
		System.out.println("This is Update Employee method");		
		
	}

}
