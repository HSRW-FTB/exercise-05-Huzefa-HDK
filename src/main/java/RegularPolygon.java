public class RegularPolygon extends GeometricObject {
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }
    RegularPolygon(int noOfSides, double lengthOfSides) {
        this.n = noOfSides;
        this.side = lengthOfSides;
        this.x = 0;
        this.y = 0;
    }
    RegularPolygon(int noOfSides, double lengthOfSides, double xValue, double yValue) {
        this.n = noOfSides;
        this.side = lengthOfSides;
        this.x = xValue;
        this.y = yValue;
    }

    double getX() { return x; }
    void setX(double x) { this.x = x; }

    double getY() { return y; }
    void setY(double y) { this.y = y; }

    int getN() {return n; }
    void setN(int n) { this.n = n; }

    double getSide() { return side; }
    void setSide(double side) { this.side = side; }

    @Override
    public double getPerimeter() {
        return n*side;
    }
    @Override
    public double getArea() {
        return (( n * Math.pow(side, 2) ) / ( 4 * Math.tan(Math.PI / n) ) );
    }

    @Override
    public String toString() {
        return "RegularPolygon: number of sides = " + this.n + " side length = " + this.side; 
    }
}
