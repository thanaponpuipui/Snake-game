var drawModule = (function () { 

  var bodySnake = function(x, y) {
        ctx.fillStyle = 'green';
        ctx.fillRect(x*snakeSize, y*snakeSize, snakeSize, snakeSize);
        ctx.strokeStyle = 'darkgreen';
        ctx.strokeRect(x*snakeSize, y*snakeSize, snakeSize, snakeSize);
  }

  var candy = function(x, y) {
        ctx.fillStyle = 'yellow';
        ctx.fillRect(x*snakeSize, y*snakeSize, snakeSize, snakeSize);
        ctx.fillStyle = 'red';
        ctx.fillRect(x*snakeSize+1, y*snakeSize+1, snakeSize-2, snakeSize-2);
  }

  var scoreText = function() {
    var score_text = "Score: " + score;
    ctx.fillStyle = 'white';
    ctx.font = '20px serif';
    ctx.fillText(score_text, 0, h-5);
    document.getElementById('score').value = score;
  }

  var drawSnake = function() {
      snake = [];
      for (var i = length-1; i>=0; i--) {
          snake.push({x:i, y:0});
      }  
  }
    
  var paint = function(){
      ctx.fillStyle = '#334d00';
      ctx.fillRect(0, 0, w, h);
      ctx.strokeStyle = 'black';
      ctx.strokeRect(0, 0, w, h);

      var head = {x:snake[0].x, y:snake[0].y};
      /*var snakeX = snake[0].x;
      var snakeY = snake[0].y;*/
      if (moveQueue.length){
        direction = moveQueue.pop();
      }
      if (direction == 'right') { 
        head.x++; }
      else if (direction == 'left') { 
        head.x--; }
      else if (direction == 'up') { 
        head.y--; 
      } else if(direction == 'down') { 
        head.y++; }
      moveQueue.length = 0;
      if (head.x <= -1 || head.x >= w/snakeSize || head.y <= -1 || head.y >= h/snakeSize || checkCollision(head.x, head.y, snake)) {

          gameloop = clearInterval(gameloop);
          document.getElementById("submitScore").submit();
        }
        
        if(head.x == food.x && head.y == food.y) {
          var tail = {x: head.x, y: head.y}; //Create a new head instead of moving the tail
          score ++;
          createFood(); //Create new food
        } else {
          var tail = snake.pop(); //pops out the last cell
          tail.x = head.x; 
          tail.y = head.y;
        }
        //The snake can now eat the food.
        snake.unshift(tail); //puts back the tail as the first cell
        for(var i = 0; i < snake.length; i++) {
          bodySnake(snake[i].x, snake[i].y);
        } 
        
        candy(food.x, food.y); 
        scoreText();
        console.log("x= "+head.x);
        console.log("y= "+head.y);
        console.log("length ="+length);
        console.log("snake ="+snake.length);

  }

  var createFood = function() {
      food = {
        x: Math.floor((Math.random() * 27) * 1),
        y: Math.floor((Math.random() * 24) * 1)
      }

      var isOnBody = function(){
        let check = false;
        for(var i=0; i>snake.length; i++){
          var snakeX = snake[i].x;
          var snakeY = snake[i].y;
        
          if (food.x===snakeX && food.y === snakeY) {
            check = true;
            break;
          }
        }
        return check;
      }

      while(isOnBody()) {
        food.x = Math.floor((Math.random() * 27) * 1);
        food.y = Math.floor((Math.random() * 24) * 1);
      }
  }

  var checkCollision = function(x, y, array) {
      for(var i = 0; i < array.length; i++) {
        if(array[i].x === x && array[i].y === y)
        return true;
      } 
      return false;
  }

  var init = function(){
      direction = 'down';
      drawSnake();
      createFood();
      gameloop = setInterval(paint, delay);

  }


    return {
      init : init
    };

    
}());
