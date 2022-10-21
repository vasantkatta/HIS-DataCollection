package com.spwosi.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="DC_CHILDREN")
public class DC_ChildrenEntity {

	@Id
	@GeneratedValue
	private Integer childId;
	private LocalDate childDob;
	private Long childSsn;
	private Long caseNum;
}
