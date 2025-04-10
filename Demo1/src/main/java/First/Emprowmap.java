package First;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

public class Emprowmap  implements RowMapper {

	Employee emp =new Employee();
	
	public Employee mapRow(ResultSet rs,int rowNum) throws SQLException{
		
		emp.setFname(rs.getString("name"));
		emp.setId(rs.getInt("Id"));
		emp.setSalary(rs.getInt("Salary"));
		return null;
		
		
	}
	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		// TODO Auto-generated method stub
		return null;
	}

}
