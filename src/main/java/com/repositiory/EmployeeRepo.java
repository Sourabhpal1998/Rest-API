package com.repositiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Employee;
import com.entity.WorksWith;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	List<Employee> findBySex(List<WorksWith> worksWith);

	List<Employee> findAllBySex(String string);

	Employee saveAll(Employee employee);

	Employee findAllBySex(WorksWith maleList);

	

}
