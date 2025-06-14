import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    
    public abstract double calculateArea();
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.print("\nEnter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of the circle: " + circle.calculateArea());
        scanner.close();
    }
}


// // Abstract class Vehicle
// abstract class Vehicle {
    
//     public abstract void startEngine();
//     public abstract void stopEngine();
// }

// // Car class inherits from Vehicle
// class Car extends Vehicle {
//     
//     public void startEngine() {
//         System.out.println("Car engine started. Vroom Vroom!");
//     }


//     public void stopEngine() {
//         System.out.println("Car engine stopped.");
//     }
// }

// // Motorcycle class inherits from Vehicle
// class Motorcycle extends Vehicle {

//     public void startEngine() {
//         System.out.println("Motorcycle engine started. Brrrm Brrrm!");
//     }

//     public void stopEngine() {
//         System.out.println("Motorcycle engine stopped.");
//     }
// }

// // Main class to test the Vehicle behavior
// public class VehicleTest {
//     public static void main(String[] args) {
//         Vehicle car = new Car();
//         Vehicle motorcycle = new Motorcycle();
//         System.out.println("=== Car ===");
//         car.startEngine();
//         car.stopEngine();
//         System.out.println("\n=== Motorcycle ===");
//         motorcycle.startEngine();
//         motorcycle.stopEngine();
//     }
// }
