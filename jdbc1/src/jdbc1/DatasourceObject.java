package jdbc1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatasourceObject 
{
	@Bean
     public JdbcTemplate getjdbcTemplate()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setUrl("jdbc:mysql://localhost:3306/springbatch");
		datasource.setUsername("root");
		datasource.setPassword("Pramod#12");
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return new JdbcTemplate(datasource);
		
	}

}
