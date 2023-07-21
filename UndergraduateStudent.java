public class UndergraduateStudent extends Student1{
    // Instance variable
    protected double gpa;

    // Constructor
    public UndergraduateStudent(String name, String gender, int age, String regNo, double gpa){
        super(name, gender, age, regNo);
        this.gpa = gpa;
    }

    // Accessor method
    public double getGpa(){
        return gpa;
    }

    public String toString(){
        return super.toString() + "\nGPA: " + gpa;
    }
}
