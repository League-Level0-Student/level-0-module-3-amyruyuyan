int X1 = 125;
int X2 = 375;
void setup(){
  size (500,500);
}
void draw(){
  background(#ADADAD);
  noFill();
  for (int i = 20; i > 0; i--){
ellipse (X1, 250, i*10, i*10);
}
for (int x = 20; x > 0; x--){
ellipse (X2, 250, x*10, x*10); 
}
X1 = X1 + 1;
X2 = X2 - 1;
if (X1 == 500){
X1 = 125;  
}
if (X2 == 0){
X2 = 375;
}
}