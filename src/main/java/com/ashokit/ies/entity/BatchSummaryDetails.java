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
public class BatchSummaryDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SUMMARY_ID")
	private Integer summaryid;
	
	@Column(name = "BATCH_NAME")
	private String batchname;
	
	
	@Column(name = "FAILURE_TRIGGER_COUNT")
	private Integer failuretriggercount;
	
	
	@Column(name = "SUCCESS_TRIGGER_COUNT")
	private Date successtriggercount;
	
	
	@Column(name = "TOTAL_TRIGGER_PROCESSED")
	private Integer totaltriggerprocessed;
	
	
}
