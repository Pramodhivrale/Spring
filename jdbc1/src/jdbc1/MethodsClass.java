package jdbc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class MethodsClass 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int addData( Student s)
	{
		String query="insert into data values("+s.getUser()+","+s.getGender()+")";
		return jdbcTemplate.update(query);
		
	}

}
