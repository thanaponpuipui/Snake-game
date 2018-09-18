<%@page contentType="text/html;charset=Windows-31J" pageEncoding="Windows-31J"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/result.css">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<div id="screen">
		<h1 align="conter">Score Table</h1>
		<div id="ScoreTable">
			<div id="NormalScoreTable">
				<h1>Normal Score</h1>
				<table border="1px" align="center" bordercolor="58FF33">
					<tr>
						<th><h1><font color="58FF33">Name</font></h1></th>
						<th><h1><font color="58FF33">Score</font></h1></th>
					</tr>
					<c:forEach var="i" items="${normalScore}">
						<tr><td>${i.name}</td><td>${i.score}</td></tr>
					</c:forEach>
				</table>
			</div>
			<div id="FastScoreTable">
				<h1>Fast Score</h1>
				<table border="1px" align="center" bordercolor="58FF33">
					<tr>
						<th><h1><font color="58FF33">Name</font></h1></th>
						<th><h1><font color="58FF33">Score</font></h1></th>
					</tr>
					<c:forEach var="s" items="${fastScore}">
						<tr><td>${s.name}</td><td>${s.score}</td></tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<button onclick="window.location.href='index'">スタート画面に戻る</button>
	</div>
</body>
</html>