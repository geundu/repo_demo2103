package com.example.demo;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/zipcode/*")
public class ZipCodeController {

	Logger					logger			= LogManager.getLogger(ZipCodeController.class);

	@Autowired(required = true)
	private ZipCodeLogic	zipCodeLogic	= null;

	@RequestMapping("getZipCodeList")
	public String getZipCodeList(HttpServletRequest req) {
		logger.info("ZipCodeController ==> getZipCodeList() called successfully.");
		List<Map<String, Object>> zipList = null;
		zipList = zipCodeLogic.getZipCodeList();
		req.setAttribute("zipList", zipList);

//		return "forward:getZipCodeList.jsp";
		// 뒤에 .jsp를 붙일 경우 WEB-INF/jsp/zipcode/getZipCodeList.jsp.jsp -> 404
		return "zipcode/getZipCodeList";
	}

	@RequestMapping("getZipCodeList2")
	public ModelAndView getZipCodeList2() {
		logger.info("ZipCodeController ==> getZipCodeList2() called successfully.");
		List<Map<String, Object>> zipList = null;
		zipList = zipCodeLogic.getZipCodeList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("zipcode/getZipCodeList");
		// 파라미터에 req가 없어도 할 수 있다
		mav.addObject("zipList", zipList);
		return mav;
	}
}
