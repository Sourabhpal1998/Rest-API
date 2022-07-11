package com.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.EmployeeDto;
import com.entity.Client;
import com.entity.Employee;
import com.entity.WorksWith;
import com.repositiory.ClientRepo;
import com.repositiory.EmployeeRepo;
import com.repositiory.WorksWithRepo;
import com.service.WorksWithService;

@Service
public class WorksWithServiceImpl implements WorksWithService {

	@Autowired
	private WorksWithRepo worksWithRepo;
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private ClientRepo clientRepo;
	
	@Override
	public String saveEmployeeData(WorksWith worksWith) {
		  worksWithRepo.saveAll(worksWith);
		  return "Data Saved";
	}

	@Override
	public EmployeeDto fetchMaleList(EmployeeDto employeeDto) {
		List<Client> clientsList = new ArrayList<>();
		List<WorksWith> worksWith = worksWithRepo.findAll();
		
		for(WorksWith maleList: worksWith) {
			Employee employee = employeeRepo.findAllBySex(maleList);
			
			for(WorksWith byClientName: employee) {
				List<Client> client = clientRepo.findByAllClientName("FedEx", "Lackawana Country");
				
			}
		}
		return employeeDto;
	}
	
	

}
