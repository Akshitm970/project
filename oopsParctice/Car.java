package oopsParctice;

public class Car {
    String color;
    String brand;
    String model;
    int year;
    private int speed;
    public void accelerate(int a){
        speed += a;
    }
    public  void brake(int d) {
        speed -= d;
    }
}
