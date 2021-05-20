package com.example.demo;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class RestDeptController {
	Logger logger = LogManager.getLogger(RestDeptController.class);

	@Autowired
	DeptLogic deptLogic = null;

	// doGet(req, res)처럼 상속관계가 아니다. 의존성이 내려감
	@RequestMapping("dept/responsePage")
	public String responsePage() {
		logger.info("responsePage() called successfully.");
		return "한글 페이지";
	}

	@RequestMapping("dept/jsonDeptList")
	public String jsonDeptList() {
		logger.info("jsonDeptList() called successfully.");
		List<Map<String, Object>> deptList = null;
		deptList = deptLogic.jsonDeptList();
		Gson g = new Gson();
		String temp = g.toJson(deptList);
		return temp;
	}
}
