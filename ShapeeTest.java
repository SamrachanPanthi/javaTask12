// import java.util.Scanner;

// // Abstract class Shape
// abstract class Shape {
//     public abstract double calculateArea();
//     public abstract double calculatePerimeter();
// }

// // Rectangle class inherits from Shape
// class Rectangle extends Shape {
//     private double length;
//     private double width;

//     // Constructor
//     public Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }
//     public double calculateArea() {
//         return length * width;
//     }


//     public double calculatePerimeter() {
//         return 2 * (length + width);
//     }
// }

// // Circle class inherits from Shape
// class Circle extends Shape {
//     private double radius;

//     // Constructor
//     public Circle(double radius) {
//         this.radius = radius;
//     }


//     public double calculateArea() {
//         return Math.PI * radius * radius;
//     }
//     public double calculatePerimeter() {
//         return 2 * Math.PI * radius;
//     }
// }

// // Main class to test the shapes
// public class ShapeeTest {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter length of the rectangle: ");
//         double length = scanner.nextDouble();

//         System.out.print("Enter width of the rectangle: ");
//         double width = scanner.nextDouble();

//         Shape rectangle = new Rectangle(length, width);
//         System.out.println("Rectangle Area: " + rectangle.calculateArea());
//         System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

//         System.out.print("\nEnter radius of the circle: ");
//         double radius = scanner.nextDouble();

//         Shape circle = new Circle(radius);
//         System.out.println("Circle Area: " + circle.calculateArea());
//         System.out.println("Circle Perimeter: " + circle.calculatePerimeter()); // ← fixed here

//         scanner.close();
//     }
// }
