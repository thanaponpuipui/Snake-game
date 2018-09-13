<%@page contentType="text/html;charset=windows-31J" pageEncoding="windows-31J"%>
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
			<form id='start' action="GameStart" method="get">
				<button type="button" id="startButton" onclick="startFunction()">Start</button>
			</form>
			<br>
			<form id='start' action="servlet" method="get">
				<button>Score</button>
			</form>
			
		</div>
	</div>
	<script type="text/javascript" src="js/start.js"></script>
</body>
</html>