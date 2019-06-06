package com.example.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployCntrl {
	
	@Autowired
	EmployDao ed;
	
	@RequestMapping(value="/")
	public String show()
	{
		return "index";
		
	}
@RequestMapping(value="/all")
public ResponseEntity<List<Employ>> getAllItems(){
	return new ResponseEntity<>(ed.getAll(),HttpStatus.OK);
}
}
