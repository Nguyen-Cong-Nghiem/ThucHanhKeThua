public class Circle extends Shape {
   private double radius = 10;
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double  getArea() {
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }
    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                +", which is a subclass of "
                + super.toString();
    }

}
