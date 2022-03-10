package Measurable;

public class Bankaccounts implements Measurable{
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        
        return "Bank Account[ Balanc= "+balance+" ]";}


    public double getMeasure(){
        return balance;
    }
    public void setMeasurable(double balance){
        this.balance=balance;
    }

    public Bankaccounts(double balance) {
        this.balance = balance;
    }
    
    
    
    
}
