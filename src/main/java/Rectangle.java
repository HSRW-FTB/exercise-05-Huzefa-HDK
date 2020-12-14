
public class Rectangle extends GeometricObject {
    
    private double width, height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width; this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width; this.height = height;
    }

    public void setWidth(double width) { this.width = width; }

    public double getWidth() { return this.width; }

    public void setHeight(double height) { this.height = height; }

    public double getHeight() { return this.height; }

    public void setFilled(int n) { 
        if (n > 0) super.setFilled(true); else super.setFilled(false);
    }

    public void changeColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
