package com.example.demo;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

@Repository
public class EmployDao {
	
	@Autowired
	JdbcTemplate jd;
	
	public List<Employ> getAll()
	{
		List<Employ> li= new ArrayList<Employ>();
		jd.query("Select id,name,salary from emp",new RowCallbackHandler() {

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				li.add(new Employ(rs.getInt("id"),rs.getString("name"),rs.getInt("salary")));
			}
			
		});
			return li;
		
	}

}
