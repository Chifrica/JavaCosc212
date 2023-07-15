import javacosc212.polymorphism.Square;

public class TestShapes {
    public static void main(String[] args){
        Shapes[] shape = new Shapes[4];

        shape[0] = new Rectangle(10, 5);
        shape[1] = new Square(10);
        shape[2] = new Circle(15);
        shape[3] = new Triangle(2,3,4);

        for(int i = 0; i < shape.length; i++){
            // System.out.println("\n" + shape[i].name());
            // System.out.println("Perimeter " + shape[i].perimeter());
            // System.out.println("Area " + shape[i].area());

            System.out.println(shape[i]);
        }
    }
}