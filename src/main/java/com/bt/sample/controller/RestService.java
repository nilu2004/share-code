package com.bt.sample.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bt.sample.model.HdfcAcknowledgement;
import com.bt.sample.model.Transactions;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@RestController
public class RestService {

	@PostMapping(path="/request",consumes = MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
	public Object getTransactionDetails(@RequestBody String request) throws Exception{
		ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.WRAP_ROOT_VALUE);
		Transactions hdfcTrans = mapper.readValue(request, Transactions.class);
		HdfcAcknowledgement response = new HdfcAcknowledgement();
		response.setErrorCode("0");
		response.setErrorMessage("Success");
		response.setDomainReferenceNo(hdfcTrans.getTransactions().get(0).getAlertSequenceNo().toString());
		String ackt = mapper.writeValueAsString(response);
		return ackt;
	}
}
