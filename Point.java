package EX4;

public class Point {
    private int x;
    private int y;
       public Point(){
      this(0,0);//appeler le constructeur avec argument;
   }
   public Point(int x,int y){
    this.x=x;
    this.y=y;
   }
   void Translate(int dx,int dy){
    this.x+=dx;
    this.y+=dy;
   }

}
