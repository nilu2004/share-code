package com.bt.sample.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HdfcAcknowledgementWrapper implements Serializable{
	private static final long serialVersionUID = 1L;

	@JsonProperty(value = "GenericCorporateAlertResponse")
	private HdfcAcknowledgement acknowledgement;

	public HdfcAcknowledgement getAcknowledgement() {
		return acknowledgement;
	}

	public void setAcknowledgement(HdfcAcknowledgement acknowledgement) {
		this.acknowledgement = acknowledgement;
	}
}
