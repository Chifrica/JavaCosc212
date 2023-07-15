public class TestShapes2 {
    public static void main(String[] args){
        Vector shape = new Vector(3);

        shape.add(new Rectangle(5, 10));
        shape.add(new Square(10));
        shape.add(new Circle(15));

        System.out.println("Shape \tArea");
        System.out.println("******************");

        for(int i = 0; i <shape.size(); i++){
            Shapes nextShape = (Shapes) shape.get(i);
            System.out.println(nextShape.name()+"\t"+nextShape.area());

            if(nextShape instanceof Circle){
                Circle circle = (Circle) nextShape;
                System.out.println("Radius = " + circle.getRadius());
            }
        }

        System.out.println(nextShape.name() + "\t" + nextShape.area());
    }
}