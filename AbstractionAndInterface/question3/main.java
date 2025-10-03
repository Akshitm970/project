package AbstractionAndInterface.question3;

import oops.Vehi;

public class main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        Vehicle bike = new Bike();
        bike.startEngine();
    }
}
