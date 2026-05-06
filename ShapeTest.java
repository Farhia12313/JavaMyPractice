// Base class
class Shape {
    public double calculateArea() {
        return 0;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Testing class
public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rect = new Rectangle(4, 6);
        Shape tri = new Triangle(3, 8);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Triangle Area: " + tri.calculateArea());
    }
}
