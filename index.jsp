<%@page language="java" contentType="text/html;charset=windows-31J" pageEncoding="windows-31J"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset='utf-8'/>
	<title>Snake Game</title>
	<link rel="stylesheet" type="text/css" href="css/startStyleSheet.css">
	
</head>
<body>
	<div id='screen'> 
			
		<div id="startMenu">
			<form id='start' action="GameStart">
				<div id="subMenu">
					<input type="checkbox" name="GameSpeed" value="fast" class="geomsize">
					<label for="GameSpeed">Fast Mode!</label>
				</div>
				<button id="startButton" onclick="startFunction()">Start</button>
			</form>
			<br>
		</div>
	</div>
	<script type="text/javascript" scr="js/start.js"></script>
</body>
</html>