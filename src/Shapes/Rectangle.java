package Shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        super.setPerimeter((this.height + this.width) * 2);
        return (this.height + this.width) * 2;
    }

    @Override
    public double calculateArea() {
        super.setArea(this.width * this.height);
        return this.width * this.height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
