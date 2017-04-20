class Car {
  int x;
  int y;
  int w;
  int h;
  int r;
  int g;
  int b;
  float speedmult;
 Car(int x1, int y1, int w1, int r1, int g1, int b1, float fastmult){
    x = x1;
    y = y1;
    w = w1;
    r = r1;
    g = g1;
    b = b1;
    speedmult = fastmult;
 }
 void draw(){
  rect(x,y,w, 40);
  fill(r,g,b);
 }
 void fast(){
   x += speed * speedmult;
   if (x >= 405 + w){
     x = -w;
   }
   else if (x <= -5 - w){
     x = 400 + w;
   
   }
   
 }
 int getX(){
     return x;
   }
   
 int getY(){
     return y;
   }
   
 int getSize(){
   return w;
 }
 
 int getSpeed(){
  return speed; 
 }
}