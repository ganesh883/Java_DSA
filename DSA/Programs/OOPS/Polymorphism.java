package OOPS;

public class Polymorphism {
    public static void main(String[] args) {

        OverLoading ov = new OverLoading();
        ov.name();
        ov.name("Ganesh");

        Overriding1 ov1 = new Overriding1();
        ov1.Carnames("Parent");

        Overriding2 ov2 = new Overriding2();
        ov2.Carnames("Child");
    }
}

class OverLoading{
    String name;
    int age;

    void name(){
        System.out.println("Name is Ganesh");
    }

    void name(String name){
        System.out.println("Name is"+ name);
    }
}

class Overriding1{
    String Carname;
    String Price;

    void Carnames(String carname) {
        System.out.println("Parent Carname is " + carname);
    }
}

class Overriding2 extends Overriding1{
    @Override
    void Carnames(String carname) {
        System.out.println("Child Carname is"+ carname);
    }
}
