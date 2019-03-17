void setup(){
size (500,500);
}
void draw(){
  background(#BFBFBF);
  noFill();
  for (int i = 20; i > 0; i--) {
if (i % 2 == 0){
  fill (#FF0303);
}
else{
  fill (#050000);
}
ellipse(250, 250, i*10, i*10); 
}
}