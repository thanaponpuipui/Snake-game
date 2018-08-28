<%@page language="java" contentType="text/html;charset=windows-31J" pageEncoding="windows-31J"%>
<!DOCTYPE html>
<html>
	<head>
	<title>リザルト</title>
	<link rel="stylesheet" type="text/css" href="css/result.css">
	</head>
	<body>
	<div id='screen'>
	<div id="startMenu">
		<span class=coo><p><h2>Score:${param.score}</h2></p></span>
		<div id="a">
		<form method='post' action='servlet'>
			<span style="color:white";>プレイヤー名:</span><input type='text' name='name' size="30" style="font-size:30px;" maxlength='8' required>
			<input type='hidden' value='${param.score}' name='score'>
			<input type='submit' value='登録' size="50" style="font-size:30px;">
		</div>
	</div>
	</div>	
	</body>
</html>