public class Student1 {
    // Instance variables
    protected String name;
    protected String gender;
    protected int age;
    protected String regNo;

    // COnstructors
    public Student1(String name, String gender, int age, String regNo){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.regNo = regNo;
    }

    // Accessor methods
    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public String getRegNo(){
        return regNo;
    }

    public String toString(){
        return "Name: " + name + "\nGender: " + gender + "\nAge: " + age + "\nReg No: " + regNo; 
    }
}
