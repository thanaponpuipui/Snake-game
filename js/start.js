var start = document.getElementById("start");
var score = document.getElementsById('score');

function startFunction() {
	start.innerHTML = "<button id='startButton'>Normal</button><br><button id='startButton' name='GameSpeed' value='fast'>Fast</button>";
}

function scoreFunction() {
	score.innerHTML = "<button id='score' action='get'>Normal</button><br><button id='score'>Fast</button>";
}