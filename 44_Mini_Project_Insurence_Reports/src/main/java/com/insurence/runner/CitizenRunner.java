package com.insurence.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.insurence.entity.CitizenPlan;
import com.insurence.repo.CitizenRepository;

@Component
public class CitizenRunner implements ApplicationRunner {

	@Autowired
	private CitizenRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		repo.deleteAll(); // we are writing for delete existing records ,(if we are not writing
							// deleteAll() records every time inserted means duplicate record keep in DB due
							// to runner)

		// cash plan data
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("uday");
		c1.setGender("male");
		c1.setPlanName("cash");
		c1.setPlanStatus("approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5000.00);

		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("sitaram");
		c2.setGender("male");
		c2.setPlanName("cash");
		c2.setPlanStatus("Denied");
		c2.setDeclinereason("Rental Income");

		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("wagh");
		c3.setGender("male");
		c3.setPlanName("cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmt(6000.00);
		c3.setTerminationDate(LocalDate.now());
		c3.setTerminationReason("Employee");

		// food plan data
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Ash");
		c4.setGender("fe-male");
		c4.setPlanName("food");
		c4.setPlanStatus("approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmt(5000.00);

		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Suvarna");
		c5.setGender("fe-male");
		c5.setPlanName("food");
		c5.setPlanStatus("Denied");
		c5.setDeclinereason("Property Income is getting..!");

		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("USW");
		c6.setGender("suday");
		c6.setPlanName("food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmt(7000.00);
		c6.setTerminationDate(LocalDate.now());
		c6.setTerminationReason("Employee");

		// Medical plan data
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("steve");
		c7.setGender("male");
		c7.setPlanName("medical");
		c7.setPlanStatus("approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmt(6000.00);

		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Suvarna");
		c8.setGender("fe-male");
		c8.setPlanName("medical");
		c8.setPlanStatus("Denied");
		c8.setDeclinereason("Property Income ..!");

		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("USW");
		c9.setGender("male");
		c9.setPlanName("medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmt(6000.00);
		c9.setTerminationDate(LocalDate.now());
		c9.setTerminationReason("Gov Job");

		// Employment plan data
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("charles");
		c10.setGender("male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmt(5000.00);

		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("rohit");
		c11.setGender("male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Denied");
		c11.setDeclinereason("Property Income ..!");

		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("jon");
		c12.setGender("male");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmt(4000.00);
		c12.setTerminationDate(LocalDate.now());
		c12.setTerminationReason("Gov Job");

		List<CitizenPlan> list = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12);

		repo.saveAll(list);
	}

}