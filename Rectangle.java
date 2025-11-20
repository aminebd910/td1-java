package EX2;
import java.util.Scanner;
class Rectangle{
    private double width;
    private double height;
   
    public double getWidth(){
      return this.width;
    }
     public double getHeight(){
      return this.height;
    }
    public void setWidth(double w){
      if(w>0)
        this.width=w;
      else 
        throw new IllegalAccessError("Nomber negatif");
    }
public void setheight(double h){
  if(h>0)
     this.height=h;
  else 
       throw new IllegalAccessError("Nomber negatif");
    };
    public double area(){
      return this.width*this.height;
    };


   
}