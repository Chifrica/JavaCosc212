public class Triangle  extends Shapes{
    //Instance variable
    private double side1;
    private double side2;
    private double side3;

    //Constuctor
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Getters
    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    //Perimeter method
    public double perimeter(){
        return side1 + side2 + side3;
    }

    //Area method
    public double area(){
        double s = perimeter() / 2;
        double area = (s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}