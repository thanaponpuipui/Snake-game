window.onload = function(){

drawModule.init();

	document.onkeydown = function(event) {

        keyCode = event.keyCode;
        switch(keyCode) {
        
        case LEFT_KEY:
        case A_KEY: 
          if (direction != 'right' || score===1) {
            direction = 'left';
            moveQueue.unshift(direction);
            console.log('left');
          }
          break;

        case RIGHT_KEY:
        case D_KEY:
          if (direction != 'left' || score===1) {
          direction = 'right';
          moveQueue.unshift(direction);
          console.log('right');
          }
          break;

        case UP_KEY:
        case W_KEY:
          if (direction != 'down' || score===1) {
          direction = 'up';
          moveQueue.unshift(direction);
          console.log('up');
          }
          break;

        case DOWN_KEY:
        case S_KEY:
          if (direction != 'up' || score===1) {
          direction = 'down';
          moveQueue.unshift(direction);
          console.log('down');
          }
          break;
          }
      }


}
