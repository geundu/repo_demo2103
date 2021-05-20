package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//MVC가 아닌데 넓은 의미에서 보면 모델 계층
@Repository
public class ZipCodeDAO {
	Logger						logger		= LogManager.getLogger(ZipCodeController.class);

	// prefix로 order.xml | dept.xml인지 고른다
	private static final String	NAMESPACE	= "com.example.demo.";
	@Autowired(required = false)
	private SqlSession			sqlSession	= null;

	public List<Map<String, Object>> getZipCodeList() {
		logger.info("ZipCodeDAO ==> getZipCodeList() called successfully.");
		List<Map<String, Object>> zipList = null;
		zipList = sqlSession.selectList(NAMESPACE + "getZipCodeList");

		// S|I|U|D|Procedure 콜 하려면 id랑 prefix가 있어야 함

		return zipList;
	}
}
