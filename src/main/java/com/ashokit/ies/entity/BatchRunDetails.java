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
@Table(name = "BATCH_RUN_DTLS ")
public class BatchRunDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BATCH_RUN_SEQ")
	private Integer batchrunseq;
	
	@Column(name = "BATCH_NAME")
	private String batchname;
	
	
	@Column(name = "BATCH_RUN_STATUS")
	private String batchrunstatus;
	
	@Column(name = "END_DATE")
	private Date enddate;
	
	@Column(name = "INSTANCE_NUM")
	private Integer instancenum;
	
	@Column(name = "START_DATE ")
	private Date  START_DATE;
	

}
