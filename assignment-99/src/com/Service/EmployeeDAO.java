package com.Service;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Model.Employee;
public class EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Employee emp)
	{
		String query="insert into employee values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getTechnology()+"');";
		return jdbcTemplate.update(query);
	}
	
	public void createTable()
	{
		String query="create table employee(id varchar(50), name varchar(50),technology varchar(50));";
		jdbcTemplate.execute(query);
		System.out.println("table created");
	}
		
}
