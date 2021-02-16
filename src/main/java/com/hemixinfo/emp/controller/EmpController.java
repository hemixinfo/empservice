package com.hemixinfo.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemixinfo.emp.model.Employee;
import com.hemixinfo.emp.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;

	@GetMapping(path ="/emp")
	public List<Employee> getAllEmployee() {
		List<Employee> allEmployee = empService.getAllEmployee();
		return allEmployee;
	}
	
	

	
}
