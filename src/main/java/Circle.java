import java.util.Set;

public class Circle extends GeometricObject {
    
    private double radius;

    public Circle () {}

    public  Circle ( double radius ) { this.radius = radius; }

    public Circle ( double radius, String color, boolean filled ) {

        this.radius = radius; setColor(color); setFilled(filled);        
    }

    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }


}
