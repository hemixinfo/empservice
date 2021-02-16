package com.hemixinfo.emp.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hemixinfo.emp.model.Employee;
import com.hemixinfo.emp.service.EmpService;

@Component
public class EmpServiceImpl implements EmpService {

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("1", "kul", "comp"));
		empList.add(new Employee("2", "man", "it"));
		empList.add(new Employee("1", "mah", "mech"));
		empList.addAll(empList);
		return empList;

	}

}
