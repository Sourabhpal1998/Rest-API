package com.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.WorksWith;

@Repository
public interface WorksWithRepo extends JpaRepository<WorksWith, Integer> {


	String saveAll(WorksWith worksWith);

}
