public abstract class Shapes {

    public String name(){
        return getClass().getName();
    }

    public abstract double area();
    public abstract double perimeter();

    public String toString(){
        return name() + "\nArea: " + area() + "\nPerimeter: " + perimeter() + "\n";
    }
}
