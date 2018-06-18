public class Circle implements Shape {

    private double radius;

    public Circle(int radius) {

        this.radius = radius;

    }

    public double getRadius() { return this.radius; }

    @Override
    public double getArea() {
       return Math.PI * Math.pow(this.radius, 2);
    }
}
