import java.util.Scanner; // Import the Scanner class

// Base class to represent a Circle
class Circle {
    protected double radius;  // Protected to be accessible by derived class

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to compute the area of the circle
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}

// Derived class to represent a Cylinder
class Cylinder extends Circle {
    private double height;  // Height of the cylinder

    // Constructor to initialize the radius and height
    public Cylinder(double radius, double height) {
        super(radius);  // Call the constructor of the base class
        this.height = height;
    }

    // Method to compute the surface area of the cylinder
    public double computeArea() {
        // Surface area of the cylinder: 2πr^2 + 2πrh
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to compute the volume of the cylinder
    public double computeVolume() {
        // Volume of the cylinder: πr^2h
        return Math.PI * radius * radius * height;
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius and height of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();  // Read radius input

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();  // Read height input

        // Create a cylinder object with user-provided radius and height
        Cylinder cylinder = new Cylinder(radius, height);

        // Compute and display the area and volume
        System.out.println("Surface Area of the Cylinder: " + cylinder.computeArea());
        System.out.println("Volume of the Cylinder: " + cylinder.computeVolume());

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
