<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<div align="center">
	<div><h2>회원정보 입력</h2></div>
	<form:form action="/memberRegister.do" modelAttribute="MemberVO" method="post">
	<p>
		<label>이메일:<br>
		<form:input path="email" />
		</label>
	</p>
	<p>
		<label>이름:<br>
		<form:input path="name" />
		</label>
	</p>
	<p>
		<label>비밀번호:<br>
		<form:password path="password" />
		</label>
	</p>
	<p>
		<label>비밀번호 확인:<br>
		<input type="password" id="confirmPassword" name="confirmPassword"/>
		</label>
	</p>
	<c:if test="${empty MemberVO.email}">
		<input type="submit" value="가입 완료">
	</c:if>
	<c:if test="${!empty MemberVO.email}">
		${MemberVO.name }님 ${msg }
	</c:if>
	</form:form>
</div>
</body>
</html>