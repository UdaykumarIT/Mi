package com.insurence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.insurence.service.ReportServiceIMPL;

@Controller
public class ReportServiceController {

	@Autowired
	ReportServiceIMPL reportServiceimpl;

	@GetMapping("/get")
	public List<String> getPlanName() {

		List<String> planName = reportServiceimpl.getPlanName();
		return planName;
	}
}
