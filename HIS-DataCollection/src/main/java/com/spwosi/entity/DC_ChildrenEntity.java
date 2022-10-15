package com.spwosi.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="DC_CHILDREN")
public class DC_ChildrenEntity {

	@Id
	@GeneratedValue
	private Integer childrenId;
	private Integer caseNum;
	private LocalDate childrenDob;
	private Long childrenSSN;
	@CreationTimestamp
	private LocalDate createdDate;
	@UpdateTimestamp
	private LocalDate updatedDate;
	private String createdBy;
	private String updatedBy;
}
