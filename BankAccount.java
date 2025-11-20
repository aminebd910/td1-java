package EX6;

public class BankAccount {
   private String iban;
   private long balanceIncents;
   public BankAccount(String i,long s){
    if(i==null || s<0)
        throw new IllegalAccessError("information invalide");
else {
this.iban=i;
this.balanceIncents=s;
}
}
public void deposit(long amount){
    if(amount<=0)
        System.out.println("L'amount a deposer est invalide");
    else
        this.balanceIncents+=amount;
}
public void Withdraw(long amount){
    if(balanceIncents-amount<0 || amount<0)
        System.out.println("operation echouee");
    else
        this.balanceIncents-=amount;
}
public long getBalanceIncents(){
  return this.balanceIncents;
}
String getFormatteBallence(){
    return balanceIncents+" EUR";
}
    
}
