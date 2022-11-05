package com.cspassion.democrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CrudEmplImpl implements crudIfce{

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void save(DemoEmpl obj) {
		// TODO Auto-generated method stub
		String sql="insert into empl(emp_nm,salary,bonus,total)values(?,?,?,?)";
		long total=obj.getSalary()+obj.getBonus();
		jdbcTemplate.update(sql,obj.getNm(),obj.getSalary(),obj.getBonus(),total);
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updtData(DemoEmpl obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectData(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectAll(DemoEmpl obj) {
		// TODO Auto-generated method stub
		
	}

}
