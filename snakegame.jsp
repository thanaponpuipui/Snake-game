<%@page language="java" contentType="text/html;charset=Windows-31J" pageEncoding="Windows-31J"%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset='utf-8'/>
  	<link rel="stylesheet" href="css/style.css">
    <title>スネークゲーム</title>
 </head>
 <body>
  <div class= 'game'>
    <div id = 'home'>
      <canvas id='mycanvas' width='810' height='720'></canvas>
    </div>
  </div>

  
  <input type="hidden" name="gameSpeed" id="gs" value="${sessionScope.gameSpeed}">
  <form method="post" action="result" id="submitScore" accept-charset="UTF-8">
    <input type="hidden" name="score" id="score">
  </form>
  <script src="js/setting.js"></script>
  <script src="js/draw.js"></script>
  <script src="js/app.js"></script>
 </body>

</html>