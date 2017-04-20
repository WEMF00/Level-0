int score = 0;
int speed = 5;
Car large = new Car(0, 300, 130, 200, 55, 0, 1.2); //Green 1
Car small = new Car(0 , 145, 50, 140, 40, 75, 1.5); //orange 3
Car smallright = new Car(0 , 225, 70, 100, 20, 35, -1.3); //Purple 2
Car largeright = new Car(0 , 75, 130, 55, 200, 0, -1.0); //Pink 4
Car top = new Car(0 , 10, 50, 140, 40, 75, 1.8); // Violet 5


void setup(){
size(400,400);

}

int frogx = 200;
int frogy = 375;
int distance;

void draw(){
background(50,100,50); 
text( score, 15, 15);
textSize(14);
ellipse(frogx, frogy, 20, 20);
fill(200, 0, 55);
if (score >= 0){
  largeright.draw();
  largeright.fast();
} if (score >= 1){
  large.draw();
  large.fast();
} if (score >= 3){
  small.draw();
  small.fast();
} if (score >= 5){
  smallright.draw();
  smallright.fast();
  top.draw();
  top.fast();
  
  if (score >= 7 && speed <= 5){
    speed += 1;
    
  } else if (score >= 10 && speed <= 6){
    speed += 3;
  } else if (score >= 13 && speed <= 9){
    speed += 5;
  }
}

  if (intersects(large) || intersects(small) || intersects(smallright) || intersects(largeright) || intersects(top)){
    frogx = 200;
    frogy = 375;
    score -= 1;
  }
  if (frogy <= 0){
    score += 1; 
    frogx = 200;
    frogy = 375;
  }
  if(frogx <= 0 || frogx >= 400){
    frogx = 200;
    frogy = 375;
  }
}

void keyPressed()
{
  int j = 20;
  
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
if ((frogy +5 > car.getY() && frogy -5 < car.getY()+50) && (frogx > car.getX() && frogx < car.getX()+car.getSize()))
          return true;
    else 
        return false;
}