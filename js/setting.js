var mycanvas = document.getElementById('mycanvas');
var ctx = mycanvas.getContext('2d');

var length = 1;
var w = 810;
var h = 720;
var score = length;
var snake;
const snakeSize = 30;
var food;
var moveQueue = [];

const LEFT_KEY = 37;
const RIGHT_KEY = 39;
const UP_KEY = 38;
const DOWN_KEY = 40;
const A_KEY = 65;
const D_KEY = 68;
const W_KEY = 87;
const S_KEY = 83;
const SPACE_KEY = 32;

var delay = document.getElementById('gs').value;