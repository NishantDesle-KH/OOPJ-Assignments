class Shape {
    public double area() {
        return 0.0;
    }
}
class Rectangle extends Shape {
    private double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

 
    public double area() {
        return Math.PI * radius * radius;
    }
}
class ShapeArea{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Circle cir = new Circle(7);

        System.out.println("Rectangle Area = " + rect.area());
        System.out.printf("Circle Area = %.2f\n", cir.area());
    }
}
