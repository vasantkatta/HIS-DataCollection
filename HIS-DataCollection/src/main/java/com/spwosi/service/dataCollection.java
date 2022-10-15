package com.spwosi.service;

import com.spwosi.entity.DC_CasesEntity;
import com.spwosi.entity.DC_EducationEntity;
import com.spwosi.entity.DC_IncomeEntity;

public interface dataCollection {

	public Integer createCase();
	
	public Integer planSelection(DC_CasesEntity caseNum);
	
	public Integer getIncomeDetails(DC_CasesEntity caseNum);
	
	public Integer getEducationDetails(DC_CasesEntity caseNum);
	
	public Integer getKidsDetails(DC_CasesEntity caseNum);
	
	public void getSummary(DC_IncomeEntity income, DC_EducationEntity edu)
	
}
