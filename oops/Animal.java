package oops;

 abstract class Animal {
     public static void main(String[] args) {
         Dog animal = new Dog();
         animal.sleep();
     }

 }
abstract class Animal1 {
    public void sound() {
         System.out.println("Infinite");
    }
 }
 class Dog extends Animal {
    public void sleep() {
        System.out.println("dog");
    }
}