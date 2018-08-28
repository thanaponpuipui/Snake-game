<%@page language="java" contentType="text/html;charset=windows-31J" pageEncoding="windows-31J"%>
<!DOCTYPE html>
<html>
	<head>
	<title>�X�R�A</title>
	<link rel="stylesheet" type="text/css" href="css/result.css">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	</head>
	<body>
	<div id='screen'>
	<div id="ScoreTable">
		<table border="1px" align="center" bordercolor="58FF33">
		<p>
			<tr><th><h1><font color="58FF33">Name</font></h1></th><th><h1><font color="58FF33">Score</font></h1></th></tr>
			<c:forEach var="s" items="${score}">
				<tr><td>${s.name}</td><td>${s.score}</td></tr>
			</c:forEach>
		<table>
	</div>
	<div>
	<p>
		<button onclick="window.location.href='index'">Start Menu</button>
		<button onclick="window.location.href='snakegame.jsp'">Retry</button>
	</div>
	</div>	
	<p><p>
	</body>
</html>