class CrazyCar extends Car{
  
  CrazyCar(int x1, int y1, int w1, int h1, int r1, int g1, int b1, int speed){
    super(x1, y1, w1, h1, r1, g1, b1, speed);
  }
  void move(){
    x += random(10)-5;
    y += random(10)-5;
  }
}