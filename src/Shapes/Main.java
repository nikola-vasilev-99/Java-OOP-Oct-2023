package Shapes;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4.4, 6.9);
        Shape circle = new Circle(4.5);

        System.out.println("Rectangle's perimeter is: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle's area is: " + rectangle.calculateArea());
        System.out.println("Circle's perimeter is: " + circle.calculatePerimeter());
        System.out.println("Circle's area is: " + circle.calculateArea());
    }
}
