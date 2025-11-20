package EX3;

public class User {
    String username;
    String email;
    public User(String u,String e){
        this.username=u;
        this.email=e;
    }
    public String toString(){

      return "User{username= '"+username+"' , email= '"+email+"' }";
    }
}

