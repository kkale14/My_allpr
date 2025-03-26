package First;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface IEmp {
	
	public void addEmp(Emp emp);
	public int getEmp(int id);
	List<Emp> getAllEmployee();
	public int deleteEmp(int id);
	public void updateEmp(int id,int salary);

}
