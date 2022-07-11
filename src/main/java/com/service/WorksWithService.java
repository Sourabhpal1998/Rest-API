package com.service;

import com.dto.EmployeeDto;
import com.entity.WorksWith;

public interface WorksWithService {
	
	public String saveEmployeeData(WorksWith worksWith);
	
	public EmployeeDto fetchMaleList(EmployeeDto employeeDto);

}
