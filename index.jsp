<%@page contentType="text/html;charset=Windows-31J" pageEncoding="Windows-31J"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset='utf-8'/>
	<title>SNAKE GAME</title>
	<link rel="stylesheet" type="text/css" href="css/startStyleSheet.css">
	
</head>
<body>
	<div id='screen'> 
			
		<div id="startMenu">
			<form id='start' action="GameStart" method="get" accept-charset="UTF-8">
				<button type="button" id="startButton" onclick="startFunction()">Start</button>
			</form>
			<form action="servlet" method="get" accept-charset="UTF-8">
				<button id="scoreButton">Score</button>
			</form>
			
		</div>
	</div>
	<script type="text/javascript" src="js/start.js"></script>
</body>
</html>