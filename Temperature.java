package EX5;

public class Temperature {
   private double value;
   public Temperature(double v){
    if(v<-273.15)//on peut aussi faire selement l'appelle de la fct setValue 
    throw new IllegalArgumentException("Enter Nomber >-273.5");
    else 
    this.value=v;
   } 
   double getValue(){
    return this.value;
   }
   void setValue(double v){
     if(v<-273.15)
    throw new IllegalArgumentException("Temperature inValide");
    else 
    this.value=v;
   }
}
