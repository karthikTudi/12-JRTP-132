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
@Table(name = "eligibility_details ")
public class EligibilityDetails implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ed_trace_id")
	private Integer edtraceid;
	
	@Column(name = "benefit_amt")
	private String benefitamt;
	
	
	@Column(name = "case_num")
	private Integer casenumber;
	
	@Column(name = "create_dt")
	private Date createddate;
	
	@Column(name = "denial_reason")
	private String denialreason;
	
	@Column(name = "plan_end_dt ")
	private String  planenddt;
	
	@Column(name = "plan_name")
	private String planname;
	
	@Column(name = "plan_start_dt")
	private String planstartdt;
	
	@Column(name = "plan_status")
	private String planstatus;
	
	@Column(name = "update_dt")
	private Date updateddate;
	

}
