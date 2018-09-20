<%@page language="java" contentType="text/html;charset=Windows-31J" pageEncoding="Windows-31J"%>
<!DOCTYPE html>
<html>
	<head>
	<title>SCORE</title>
	<link rel="stylesheet" type="text/css" href="css/result.css">
	</head>
	<body>
	<div id='screen'>
	<div id="startMenu">
		<h1>${sessionScope.gameMode}</h1>
		<span class=coo><p><h2>Score:${param.score}</h2></p></span>
		<div id="a">
		<form method='post' action='servlet' accept-charset="UTF-8">
			<span style="color:white; font-size:1.5em;">PLAYER NAME:</span>
			<input type='text' name='name' size="15" style="font-size:30px;" maxlength='8' required pattern="[^,'!?\x2A\x2B\x2D\x22\x3C\x3E\x2F\x5C]+">
			<input type='hidden' value='${param.score}' name='score'>
			<input id="submit" type='submit' value='SUBMIT' size="50" style="font-size:30px;">
		</div>
	</div>
	</div>	
	</body>
</html>