package com.assessment.springboot_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.springboot_model.Employee;
import com.assessment.springboot_repository.EmployeeRepo;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	@GetMapping("/allEmployees/")
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}

}
