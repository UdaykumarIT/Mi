package com.insurence.service;

import java.util.List;

import com.insurence.entity.CitizenPlan;
import com.insurence.request.SearchRequest;

public interface ReportService {

	public List<String> getPlanName();

	public List<String> getPlanStatus();

	// for search all data using filed
	public List<CitizenPlan> search(SearchRequest request);

	public boolean exportExcel();

	public boolean exportPDF();

}
