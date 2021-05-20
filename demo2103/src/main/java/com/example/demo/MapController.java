package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/di/*")
public class MapController {

	private Map<String, String> mapBean = null;

	public void setMapBean(Map<String, String> mapBean) {
		this.mapBean = mapBean;
	}

	@RequestMapping("mapTest")
	public String mapTest() {
		System.out.println(mapBean.get("prop1"));
		return "redirect:mapTest.jsp";
	}
}
