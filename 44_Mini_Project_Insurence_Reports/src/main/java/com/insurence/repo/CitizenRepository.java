package com.insurence.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.insurence.entity.CitizenPlan;


public interface CitizenRepository extends JpaRepository<CitizenPlan, Integer> {
	
	// write custome HQL query
	// distinct used for specific field or for dropdown
	
	@Query("select distinct (planName) from CitizenPlan")
	public List<CitizenPlan> getPlanNames();
	
	
	@Query("select distinct (planStatus) from CitizenPlan")
	public List<CitizenPlan> getPlanStatus();

}
