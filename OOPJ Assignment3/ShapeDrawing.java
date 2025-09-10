import java.util.Scanner;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing Circle of radius " + radius);
    }
}
class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void draw() {
        System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
    }
}
 class ShapeDrawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle input
        System.out.print("Enter Circle Radius: ");
        int radius = sc.nextInt();
        Circle circle = new Circle(radius);

        // Rectangle input
        System.out.print("Enter Rectangle Length: ");
        int length = sc.nextInt();
        System.out.print("Enter Rectangle Breadth: ");
        int breadth = sc.nextInt();
        Rectangle rectangle = new Rectangle(length, breadth);

        System.out.println();
        circle.draw();
        rectangle.draw();

        sc.close();
    }
}
