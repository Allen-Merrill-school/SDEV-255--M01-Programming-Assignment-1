
public class Main {
    public static void main(String[] args) {
        //create the 3 polygons
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        //output the area and perimeter
        System.out.println("Polygon 1 - Perimeter: " + polygon1.getPerimeter() + ", Area: " + polygon1.getArea());
        System.out.println("Polygon 2 - Perimeter: " + polygon2.getPerimeter() + ", Area: " + polygon2.getArea());
        System.out.println("Polygon 3 - Perimeter: " + polygon3.getPerimeter() + ", Area: " + polygon3.getArea());
    }
}

class RegularPolygon {
    //data fields
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    //constructor with no arg
    public RegularPolygon() {
    }

    //constructor with specified sides
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    //constrcutor with specified sides and length
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    //accessor and mutator methods
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //calculate perimeter
    public double getPerimeter() {
        return n * side;
    }

    //calculate area using formula
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}

