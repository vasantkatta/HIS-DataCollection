package com.spwosi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spwosi.binding.DC_Income;
import com.spwosi.service.dataCollection;

@RestController
public class IncomeRestController {

	@Autowired
	private dataCollection service;
	
	public ResponseEntity<Long> saveIncome(@RequestBody DC_Income income){
		
		Long caseNum = service.saveIncomeData(income);
		
		
		return new ResponseEntity<>(caseNum, HttpStatus.CREATED);
	}
	
}
