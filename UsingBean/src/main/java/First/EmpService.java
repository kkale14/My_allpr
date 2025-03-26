package First;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
public class EmpService {
	
	private IEmp iemp;
	
	@Autowired
	public EmpService(@Qualifier("empDAO")IEmp iemp1)
	{
		this.iemp=iemp1;
	}
	public void addEmp(Emp emp)
	{
		iemp.addEmp(emp);
	}
	
	public int getEmp(int id)
	{
		return iemp.getEmp(id);
		
	}
	
	public List<Emp> getAllEmployee()
	{
		return iemp.getAllEmployee();
		
	}
	
	public int deleteEmp(int id)
	{
		return iemp.deleteEmp(id);
		
	}
	
	public void updateEmp(int id,int Salary)
	{
		iemp.updateEmp(id,Salary);
	}
}
