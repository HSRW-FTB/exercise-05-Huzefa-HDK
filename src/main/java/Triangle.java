public class Triangle extends GeometricObject {
    double side1, side2, side3;
    
    Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    double getSide1() {
        return this.side1;
    }
    void setSide1(double side1) {
        this.side1 = side1;
    }

    double getSide2() {
        return this.side2;
    }
    void setSide2(double side2) {
        this.side2 = side2;
    }

    double getSide3() {
        return this.side3;
    }
    void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        // 
        return ( this.side1 + this.side2 + this.side3 );
    }
    @Override
    public double getArea() {
        // using Heron's formula
        double s = this.getPerimeter() / 2;
        double a = this.side1, b = this.side2 , c = this.side3;
        return Math.sqrt(( s * (s - a) * (s - b) * (s - c) ));
    }

    @Override
    public String toString() {    
        return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
    }
}
