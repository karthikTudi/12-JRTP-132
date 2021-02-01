package com.ashokit.ies.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "co_triggers")
public class CoTriggers implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "trg_id")
	private Integer trgid;
	
	@Column(name = "case_num")
	private Integer casenumber;
	
	@Column(name = "create_dt")
	private Date createddate;
	
	@Column(name = "trg_status")
	private String trgstatus;
	
	@Column(name = "update_dt")
	private Date updateddate;
	
	

}
