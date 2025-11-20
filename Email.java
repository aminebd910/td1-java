package EX7;

final class Email {
    final String value;
    public Email(String v){
     if(v==null || !v.contains("@"))
         throw new IllegalAccessError("pas de @");        
        this.value=v;
     }
     
    public String getVal(){
       return this.value;
    }
}
