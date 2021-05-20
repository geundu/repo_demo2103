package com.example.demo;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZipCodeLogic {
	Logger				logger		= LogManager.getLogger(ZipCodeController.class);
	@Autowired(required = true)
	private ZipCodeDAO	zipCodeDAO	= null;

	public List<Map<String, Object>> getZipCodeList() {
		logger.info("ZipCodeLigic ==> getZipCodeList() called successfully.");
		List<Map<String, Object>> zipList = null;
		zipList = zipCodeDAO.getZipCodeList();

		return zipList;
	}
}
