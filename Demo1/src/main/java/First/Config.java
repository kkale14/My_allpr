package First;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("First")
public class Config {
	
	
//	public JdbcTemplate template()
//	
//	{
//		
//		
//		return new JdbcTemplate(data());
//		
//	}
	
//	
	
	
	@Bean
	public DataSource data()
	{
		DriverManagerDataSource d=new DriverManagerDataSource() ;
		
		d.setDriverClassName("oracle.jdbc.OracleDriver");
		d.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		d.setUsername("system");
		d.setPassword("admin");
		
		return d;
		
	}
	
	@Bean//  
	public NamedParameterJdbcTemplate namedtemplate(DataSource data) {
		return new NamedParameterJdbcTemplate(data);
		
	}

}
