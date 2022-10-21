package com.spwosi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="ED_EDUCATION")
public class DC_EducationEntity {

	@Id
	@GeneratedValue
	private Integer eduId;
	private Long caseNum;
	private String highestQualification;
	private Integer graduationYear;
	
	

}
