package OOPS;

public class Abstraction {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        p1.generateReceipt(20);
        p1.pay(20);
    }
}


class CreditCardPayment extends Payment{
    @Override
    void pay(int amt) {
        System.out.println(amt);
    }
}

//Abstract is basically the idea/entites
// In abstract class, the abstract method doesn't have the body
//All the abstract methods should be implemented in the child class of abstract method
abstract class Payment{
    abstract void pay(int amt);

    void generateReceipt(int amt){
        System.out.println(amt);
    }
}
