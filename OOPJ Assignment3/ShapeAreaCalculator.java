import java.util.Scanner;

interface Shape {
    double calculateArea();
}
class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}
class Rectangle implements Shape {
    private double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateArea() {
        return length * breadth;
    }
}
class Square implements Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }
 
    public double calculateArea() {
        return side * side;
    }
}
class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println("Circle Area = " + circle.calculateArea());

        System.out.print("Enter length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double breadth = sc.nextDouble();
        Shape rectangle = new Rectangle(length, breadth);
        System.out.println("Rectangle Area = " + rectangle.calculateArea());

        System.out.print("Enter side of Square: ");
        double side = sc.nextDouble();
        Shape square = new Square(side);
        System.out.println("Square Area = " + square.calculateArea());

        sc.close();
    }
}
