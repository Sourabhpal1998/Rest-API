package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.EmployeeDto;
import com.entity.WorksWith;
import com.service.WorksWithService;

@RestController
public class WorksWithController {
	
	@Autowired
	private WorksWithService worksWithService;
	
	@PostMapping("/save/data/employee")
	public String saveData(@RequestBody WorksWith worksWith) {
		return worksWithService.saveEmployeeData(worksWith);
	}
	
	@GetMapping("/fetch/male/list")
	public EmployeeDto fetchMaleList(EmployeeDto employeeDto) {
		return worksWithService.fetchMaleList(employeeDto);
	}

}
