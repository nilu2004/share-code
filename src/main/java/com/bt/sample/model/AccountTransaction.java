package com.bt.sample.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "Alert Sequence No", "Remitter Name", "Remitter Account", "Remitter Bank", "User Reference Number", "BenefDetails2", "Amount",
		"Mnemonic Code", "Transaction Date" })
public class AccountTransaction implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//@XmlElement(name = "Alert Sequence No", required = true)
	@JsonProperty(value = "Alert Sequence No", required = true)
	private Long alertSequenceNo;

	// @XmlElement(name = "Remitter Name", required = false)
	@JsonProperty(value = "Remitter Name", required = false)
	private String remitterName;

	// @XmlElement(name = "Remitter Account", required = false)
	@JsonProperty(value = "Remitter Account", required = false)
	private String remitterAccount;

	// @XmlElement(name = "Remitter Bank", required = false)
	@JsonProperty(value = "Remitter Bank", required = false)
	private String remitterBank;

	// @XmlElement(name = "User Reference Number", required = true)
	@JsonProperty(value = "User Reference Number", required = true)
	private String userRefNumber;

	// @XmlElement(name = "BenefDetails2", required = true)
	@JsonProperty(value = "BenefDetails2", required = true)
	private String beneficiaryDetails;

	// @XmlElement(name = "Amount", required = true)
	@JsonProperty(value = "Amount", required = true)
	@JsonFormat(shape = Shape.NUMBER_FLOAT, pattern = "#,##0.00")
	private Double amount;

	// @XmlElement(name = "Mnemonic Code", required = false)
	@JsonProperty(value = "Mnemonic Code", required = false)
	@JsonFormat(shape = Shape.STRING)
	private TransferMode mnemonicCode;

	// @XmlElement(name = "Transaction Date", required = true)
	@JsonProperty(value = "Transaction Date", required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm")
	private Date transactionDate;

	public Long getAlertSequenceNo() {
		return alertSequenceNo;
	}

	public String getRemitterName() {
		return remitterName;
	}

	public String getRemitterAccount() {
		return remitterAccount;
	}

	public String getRemitterBank() {
		return remitterBank;
	}

	public String getUserRefNumber() {
		return userRefNumber;
	}

	public String getBeneficiaryDetails() {
		return beneficiaryDetails;
	}

	public Double getAmount() {
		return amount;
	}

	public TransferMode getMnemonicCode() {
		return mnemonicCode;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setAlertSequenceNo(long alertSequenceNo) {
		this.alertSequenceNo = alertSequenceNo;
	}

	public void setRemitterName(String remitterName) {
		this.remitterName = remitterName;
	}

	public void setRemitterAccount(String remitterAccount) {
		this.remitterAccount = remitterAccount;
	}

	public void setRemitterBank(String remitterBank) {
		this.remitterBank = remitterBank;
	}

	public void setUserRefNumber(String userRefNumber) {
		this.userRefNumber = userRefNumber;
	}

	public void setBeneficiaryDetails(String beneficiaryDetails) {
		this.beneficiaryDetails = beneficiaryDetails;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setMnemonicCode(TransferMode mnemonicCode) {
		this.mnemonicCode = mnemonicCode;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
}
