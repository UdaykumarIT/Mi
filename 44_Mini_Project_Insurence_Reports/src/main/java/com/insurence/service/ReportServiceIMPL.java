package com.insurence.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurence.entity.CitizenPlan;
import com.insurence.repo.CitizenRepository;
import com.insurence.request.SearchRequest;

@Service
public class ReportServiceIMPL implements ReportService {

	@Autowired
	private CitizenRepository repo;

	@Override
	public List<String> getPlanName() {

		return Arrays.asList("c1","c2","c3","c4","c5","c6","c7","c8","c9","c10","c11","c12");
		
	}

	@Override
	public List<String> getPlanStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPDF() {
		// TODO Auto-generated method stub
		return false;
	}

}
