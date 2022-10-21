package com.spwosi.service;

import java.util.List;

import com.spwosi.binding.DC_Children;
import com.spwosi.binding.DC_Education;
import com.spwosi.binding.DC_Income;
import com.spwosi.binding.DC_PlanSelection;
import com.spwosi.binding.DC_Summary;

public interface dataCollection {
	
	public Long loadCaseNum(Integer appId);

	//public Long findAppById(Integer appId);
	
	public List<String> getPlanNames();
	
	public Long savePlanSelection(DC_PlanSelection planSelection);
	
	public Long saveIncomeData(DC_Income income);
	
	public Long saveEducation(DC_Education education);
	
	public Long saveChildren(List<DC_Children> childs);
	
	public DC_Summary getSummary(Long caseNum);
	
}
