public class Circle extends Shapes {
    public double radius;

    public Circle (double r){
        radius = r;
    }

    // Area method
    public double area(){
        return (Math.PI * (radius * radius));
    }

    // Perimeter method
    public double perimeter(){
        return (2.0 * Math.PI) * radius;
    }

    public double getRadius(){
        return radius;
    }
}