package OOPS;

public class Inheritance {
    public static void main(String[] args) {

       ChildClass c = new ChildClass();
       c.study();
       c.age(12);
       c.name("Ganesh");
    }
}


class ParentClass{
    String name;
    int age;
    int DOB;

    void name(String name){
        System.out.println("Name is " + name);
    }

    void age(int age){
        System.out.println("Age is "+ age);
    }
}

class ChildClass extends ParentClass{
    void study(){
        System.out.println("Child is Studying");
    }

}