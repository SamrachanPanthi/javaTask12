class Vehicle {
    // Method of Vehicle class
    public void drive() {
        System.out.println("The vehicle is being driven.");
    }
}


class Car extends Vehicle {
    public void display() {
        System.out.println("Car Details:");
        System.out.println("Brand: Toyota");
        System.out.println("Model: abc");
        System.out.println("Year: 2023");
    }
}

// subclass Main.java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.display();
    }
}
