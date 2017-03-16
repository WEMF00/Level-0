Car large = new Car(0, 300, 150, 200, 55, 0, 4);
Car small = new Car(0 , 225, 50, 200, 55, 0, 6);

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
large.draw();
large.fast();
small.draw();
small.fast();

  
}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
      //Frog Y position goes up
      }
      else if(keyCode == DOWN)
      {
        //Frog Y position goes down 
      }
      else if(keyCode == RIGHT)
      {
       //Frog X position goes right
      }
      else if(keyCode == LEFT)
      {
        //Frog X position goes left
      }
   }
} 
void keeper(){
  if(frogy >= 0) {
     frogy = 0;
  }
}