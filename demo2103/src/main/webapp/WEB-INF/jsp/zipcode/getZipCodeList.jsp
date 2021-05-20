<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.Map, com.design.zipcode.ZipCodeVO"%>
<%
	List<ZipCodeVO> zipList = (List<ZipCodeVO>) request.getAttribute("zipList");
	int size = -1;
	if (zipList.size() != 0) {
		size = zipList.size();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	WEB-INF 밑에 있는 우편번호 검색기 페이지입니다.
	<br>
	<%
		for(ZipCodeVO index : zipList) {
	%>
		<%= index.getZipcode()%>  
		<%= index.getAddress()%><br>
	<%
		}
	%>
	
</body>
</html>