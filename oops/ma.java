package oops;

public class ma {
    public static void main(String[] args) {
        Animals a = new Dogs() ;
        a.sound();
        a.sleep();
        vehicles v = new car() ;
        v.start();
        v.stop();
vehicles.brake();
Vehi.speak();
Vehi c = new vh();
c.sound();
    }
}
//interface Animals{
//    void eat();
//}
//
//class Dogs implements Animals{
//    @Override
//    public void eat() {
//        System.out.println("Dog Eat");
//    }
//}
//abstract class Animal3{
//    abstract void sound();
//    void eat(){
//        System.out.println("Animal3 Eat");
//    }
//}

interface Animals {
    void sound();   // abstract by default
    void sleep();   // abstract by default
}

// Implementing interface
class Dogs implements Animals {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void sleep() {
        System.out.println("Dog sleeps");
    }
}


interface vehicles{
    void start();
    default void stop(){
        System.out.println("stop");
    }
    static void brake(){
        System.out.println("brake");
    }
}
class car implements vehicles{
    public void start(){
        System.out.println("car start");
    }
}