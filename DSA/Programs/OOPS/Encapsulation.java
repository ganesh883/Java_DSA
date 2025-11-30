package OOPS;

public class Encapsulation {
    public static void main(String[] args) {

            BankAccount bk = new BankAccount();

            bk.setBalance(20);
            bk.getBalance();
    }
}

class BankAccount{
    private int balance;

    void setBalance(int amt){
        if(amt>0){
            balance=amt;
        }
        System.out.println("Balance Update");
    }

    void getBalance(){
        System.out.println(balance);
    }

}
