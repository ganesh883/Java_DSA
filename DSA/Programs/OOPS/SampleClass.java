package OOPS;

public class SampleClass {
    public static void main(String[] args) {

        //Object
        Car car = new Car();

        //Calling behaviour
        car.drive();
    }
}

 class Car{

    //Attributes
     String name;
     String Color;

     //Behaviours
     void drive(){
         System.out.println("Driving a Car");
     }
}
