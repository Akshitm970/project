/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author akshitm
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();  // inherited
        b.ride();
    }

}

class Vehicle {
    void start() { System.out.println("Vehicle started"); }
}
class Bike extends Vehicle {
    void ride() { System.out.println("Bike is riding"); }
}