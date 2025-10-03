package oopsParctice;
class Test{
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Blue";
        car.brand = "Tata";
        car.year = 2020;
        // car.speed = 100;
        // System.out.println(car.speed);
        System.out.println(car.color);
        car.accelerate(10);
        // System.out.println(car.speed);
        car.brake(30);
        // System.out.println(car.speed);
    }
}