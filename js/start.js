var start = document.getElementById("start");
var score =document.getElementById("score");

function startFunction() {
	start.innerHTML = "<button id='startButton'>Normal</button><br><button id='startButton' name='GameSpeed' value='fast'>Fast</button>";
}

function scoreFunction(){
	score.innerHTML ="<button id='score'>Normal</button><br><button id='score'>Fast</button>";
	} 