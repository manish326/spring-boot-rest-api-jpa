package com.luv2code.springboot.cruddemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;

@Component
public class EmployeeDAOServiceCommandLineRunner implements CommandLineRunner {

	@Autowired	
	EmployeeService service;
	
	@Override
	public void run(String...  arg0) throws Exception{
		
		Employee emp1 = new Employee("Manish","Jain","manish@sdgc.com");
		service.save(emp1);
		
		Employee emp2 = new Employee("Amit","Sirya","amit@sdgc.com");
		service.save(emp2);
	}
}
