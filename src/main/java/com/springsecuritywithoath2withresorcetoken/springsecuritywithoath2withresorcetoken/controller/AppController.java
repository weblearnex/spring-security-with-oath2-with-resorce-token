package com.springsecuritywithoath2withresorcetoken.springsecuritywithoath2withresorcetoken.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecuritywithoath2withresorcetoken.springsecuritywithoath2withresorcetoken.model.Employee;

@RestController

public class AppController extends  WebSecurityConfigurerAdapter  {
	
	Map<Integer ,Employee> employes =new HashMap<Integer ,Employee>();
	
	@GetMapping("/")
	public String getWelcome(){
		return "<h1>Welcome for All</h1>";
	}
	
	@GetMapping("/employee")
	public Collection<Employee> getEmployee(){
		employes.put(1, new Employee(1,"Vikash",45000));
		employes.put(2, new Employee(2,"Amit",49000));
		employes.put(3, new Employee(3,"Vijay",50000));
		employes.put(4, new Employee(4,"Rakesh",42000));
		return employes.values();
	}
	
	
	

}
