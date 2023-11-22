package Shapes;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * this.radius);
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double calculateArea() {
        super.setArea(Math.PI * Math.pow(this.radius, 2));
        return Math.PI * Math.pow(this.radius, 2);
    }

    public final Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
