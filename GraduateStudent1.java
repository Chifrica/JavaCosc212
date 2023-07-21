public class GraduateStudent1 extends UndergraduateStudent{
    
    // Instance variable
    protected String thesisTitle;

    // Constructor
    public GraduateStudent1(String name, String gender, int age, String regNo, double gpa, String thesisTitle){
        super(name, gender, age, regNo, gpa);
        this.thesisTitle = thesisTitle;
    }

    // Accessor method
    public String getthesisTitle(){
        return thesisTitle;
    }

    public String toString(){
        return super.toString() + "\nThesis: " + thesisTitle;
    }
}
