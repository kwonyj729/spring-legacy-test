<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	${username} 님의 홈에 오신 것을 환영합니다.
</h1>
<form action="/springlegacy/hello" method="POST">
	<input name="id" type="hidden" value="ssar"/>
	<input name="pw" type="hidden" value="1234"/>
	<input type="submit" value="hello페이지로 이동">
</form>


</form>

<a href="/springlegacy/hello?id=ssar&pw=1234">hello 페이지로 이동</a>
<!-- 이거 이제 오류남. 왜?? GET에서 POST 방식으로 바껴서?? 그런가?? -->

</body>
</html>
