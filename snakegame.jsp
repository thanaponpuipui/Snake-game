<%@page language="java" contentType="text/html;charset=windows-31J" pageEncoding="windows-31J"%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset='utf-8'/>
  	<link rel="stylesheet" href="css/style.css">

 </head>
 <body>
  <div class= 'game'>
    <div id = 'home'>
      <canvas id='mycanvas' width='810' height='720'></canvas>
    </div>
  </div>

  
  <input type="hidden" name="gameSpeed" id="gs" value="${sessionScope.gameSpeed}">
  <input type="hidden" name="highscore" id="hs" value="${applicationScope.highScore}">
  <form method="post" action="result" id="submitScore">
    <input type="hidden" name="score" id="score">
  </form>
  <script src="js/setting.js"></script>
  <script src="js/draw.js"></script>
  <script src="js/app.js"></script>
 </body>

</html>