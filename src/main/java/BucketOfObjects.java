import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BucketOfObjects {
    private List<GeometricObject> items = new ArrayList<>();

    public BucketOfObjects() {}

    public void addObject(GeometricObject item) { this.items.add(item); }

    public double getTotalArea() {
        // Using Iterator to iterate through GeometricObject list
        Iterator<GeometricObject> iter = this.items.iterator();
        double area = 0;
        while(iter.hasNext()) {
            GeometricObject obj = iter.next();
            area = area + obj.getArea();
        }
        return area;
    }
    
    public double getTotalPerimeter() {
        // Using Iterator to iterate through GeometricObject list
        Iterator<GeometricObject> iter = this.items.iterator();
        double perimeter = 0;
        while(iter.hasNext()) {
            GeometricObject obj = iter.next();
            perimeter = perimeter + obj.getPerimeter();
        }
        return perimeter;
    }

    public String toString() {
        // Using Iterator to iterate through GeometricObject list
        Iterator<GeometricObject> iter = this.items.iterator();
        String objString = "";
        while(iter.hasNext()) {
            GeometricObject obj = iter.next();
            objString = objString + obj.getClass().getName() + (iter.hasNext() ? ", " : "");
        }
        return objString;
    }
    

}
