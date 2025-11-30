package OOPS;

public class Interface {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.eat();
        a.hunt();
        a.run();

    }
}


class Dog implements  Animal{

    @Override
    public void walk() {
        System.out.println("Walk");
    }

    @Override
    public void hunt() {
        System.out.println("Hunt");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }
}

interface Animal{
    void walk();
    void hunt();
    void run();
    void eat();
}
