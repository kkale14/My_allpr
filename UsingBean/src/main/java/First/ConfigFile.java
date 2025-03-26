package First;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("First")
public class ConfigFile {

	
	@Bean
	public EmpDAO empDAO()
	{
		return new EmpDAO();
		
	}
	
	@Bean
	public EmpService empService(EmpDAO empDAO)
	{
		return new EmpService(empDAO);
		
	}
}
