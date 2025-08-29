// Main class
public class abstraction {

    // Abstract class
    abstract class Vehicle {    // abstract class ka object nahi bna sakte
        int no_tyre;

        void common() {   // concrete method
            System.out.println("This is a vehicle with " + no_tyre + " tyres. (common method)");
        }

        abstract void stop();   // abstract method
    }

    // Subclass (concrete class)
    class Car extends Vehicle {
        @Override
        void stop() {
            System.out.println("Car stops with brake. (abstract method implementation)");
        }
    }

    // main method
    public static void main(String[] args) {
        abstraction obj = new abstraction(); // outer class object (needed for inner classes)
        Car car = obj.new Car(); // create car object
        car.no_tyre = 4;

        car.common();   // calling common method
        car.stop();     // calling abstract method implementation
    }
}
// Abstraction means hiding internal details and showing only functionality to the user. In Java, abstraction is achieved using abstract classes and interfaces.