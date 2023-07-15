public class Course {
    private int courseCode;
    private int creditHours;
    private String title;

    public Course (int courseCode, int creditHours, String title){
        this.courseCode = courseCode;
        this.creditHours = creditHours;
        this.title = title;
    }

    public Course(String string, String string2) {
    }

    public int getCourseCode(){
        return courseCode;
    }

    public int getCreditHours(){
        return creditHours;
    }

    public String getTitle(){
        return title;
    }

    public void setCourseCode(int courseCode){
        courseCode = courseCode;
    }

    public void setCreditHours(int creditHours){
        creditHours = creditHours;
    }

    public void setTitle(String title){
        title = title;
    }

    public String toString(){
        return "CourseCode: " + courseCode + "\nCreditHours: " + creditHours + "\nTitle: " + title;
    }
}