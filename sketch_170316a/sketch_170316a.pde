Car jake = new Car(100,100, 50, 50, 200, 55, 0, 4);
CrazyCar dave = new CrazyCar(100,100, 50, 50, 200, 55, 0, 4);
void setup(){
  size(1000, 1000);
}

void draw(){
  background(50, 150, 50);
 jake.draw(); 
 jake.fast();
 dave.draw();
 dave.fast();
}