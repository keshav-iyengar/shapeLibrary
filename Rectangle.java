public class Rectangle implements Shape {

    private double length;
    private double width;


    public Rectangle(int l, int w) {

        this.length = l;
        this.width = w;

    }

    public double getLength() { return this.length; }

    public double getWidth() { return this.width; }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
