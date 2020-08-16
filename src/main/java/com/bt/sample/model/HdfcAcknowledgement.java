package com.bt.sample.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("GenericCorporateAlertResponse")
public class HdfcAcknowledgement implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty(value = "errorCode")
	private String errorCode;
	@JsonProperty(value = "errorMessage")
	private String errorMessage;
	@JsonProperty(value = "domainReferenceNo")
	private String domainReferenceNo;
	
	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public String getDomainReferenceNo() {
		return domainReferenceNo;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public void setDomainReferenceNo(String domainReferenceNo) {
		this.domainReferenceNo = domainReferenceNo;
	}
}
