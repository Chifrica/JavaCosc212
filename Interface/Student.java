public class Student {
    //Instance variable
    protected int Id;
    protected String name;
    protected double Gpa;

    //Constructors
    public Student (int id, String name, double gpa){
        this.Id = id;
        this.name = name;
        this.Gpa = gpa;
    }

    //Getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getGPA(){
        return gpa;
    }

}