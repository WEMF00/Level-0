Car large = new Car(0, 300, 150, 200, 55, 0, 4);
Car small = new Car(0 , 165, 50, 140, 40, 75, 6);
Car smallright = new Car(0 , 225, 70, 100, 20, 35, -5);
Car largeright = new Car(0 , 105, 130, 55, 200, 0, -3);
Car top = new Car(0 , 45, 50, 140, 40, 75, 7);


void setup(){
size(400,400);

}

int frogx = 200;
int frogy = 375;
int distance;

void draw(){
background(50,100,50); 
ellipse(frogx, frogy, 50, 50);
fill(200, 0, 55);
largeright.draw();
largeright.fast();
large.draw();
large.fast();
small.draw();
small.fast();
smallright.draw();
smallright.fast();
top.draw();
top.fast();

  if (intersects(large) || intersects(small) || intersects(smallright) || intersects(largeright) || intersects(top)){
    frogx = 200;
    frogy = 375;  
  }
  if (frogx <= 0){
    text( "A winner is you", 200, 200);
    textSize(14);
  }
}

void keyPressed()
{
  int j = 30;
  
  if(key == CODED){
      if(keyCode == UP)
      {
        frogy -= j;
      }
      else if(keyCode == DOWN)
      {
        frogy += j;
      }
      else if(keyCode == RIGHT)
      {
        frogx += j;
      }
      else if(keyCode == LEFT)
      {
        frogx -= j;
      }
   }
} 

void keeper(){
  if(frogy >= 0) {
     frogy = 0;

  }
  
}

 boolean intersects(Car car) {
if ((frogy > car.getY() && frogy < car.getY()+50) && (frogx > car.getX() && frogx < car.getX()+car.getSize()))
          return true;
    else 
        return false;
}
