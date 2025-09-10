import java.util.Scanner;

class ShapeArea {
    // Square
    void calculateArea(int side) {
        int area = side * side;
        System.out.println("Square Area = " + area);
    }
    // Rectangle
    void calculateArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Rectangle Area = " + area);
    }
    // Circle
    void calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area = " + String.format("%.2f", area));
    }
}
 class ShapeAreaCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeArea shape = new ShapeArea();

        // Square
        System.out.print("Enter side of Square: ");
        int side = sc.nextInt();
        shape.calculateArea(side);

        // Rectangle
        System.out.print("Enter length of Rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        int breadth = sc.nextInt();
        shape.calculateArea(length, breadth);

        // Circle
        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        shape.calculateArea(radius);

        sc.close();
    }
}
