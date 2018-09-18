var start = document.getElementById("start");
var score = document.getElementById('scoreButton');

function startFunction() {
	start.innerHTML = "<button id='startButton'>Normal</button><br><button id='startButton' name='GameSpeed' value='fast'>Fast</button>";
	score.remove();
}
