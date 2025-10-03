package exam.question9.implementation;

import exam.question9.iterface.Flyable;
import exam.question9.iterface.Swimmable;

public class Duck extends Animal implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck cant fly");
    }
    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }

    @Override
    public void makesound() {
        System.out.println("Quack Quack");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
        duck.makesound();
        duck.eat();
    }
}
