package com.ashokit.ies.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CO_PDFS ")
public class CopdfDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CO_PDF_ID")
	private Integer copdfid;
	
	@Column(name = "PLAN_STATUS")
	private String planstatus;
	
	
	@Column(name = "CASE_NUMBER")
	private String casenumber;
	
	@Column(name = "PDF_NUMBER")
	@Lob
	private byte[] pdfnumber;
	
	@Column(name = "PLAN_NAME")
	private String planname;

}
