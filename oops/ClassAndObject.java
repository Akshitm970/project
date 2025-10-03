class Car {
    String brand;
    int speed;
    
    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class  ClassAndObject{
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Tesla";
        c.speed = 120;
        c.drive();   // Tesla is driving at 120 km/h
    }
}