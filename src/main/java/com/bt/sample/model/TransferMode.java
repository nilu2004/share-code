package com.bt.sample.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransferMode {
	NEFT("NEFT"),
	RTGS("RTGS"),
	IMPS("IMPS"),
	FUND_TRANS("FUND TRANS");
	private String value;
	private TransferMode(String value) {
		this.value = value;
	}
	@JsonValue
	public String getValue() {
		return value;
	}
}
