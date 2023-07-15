public class GraduateStudent extends Student implements Instructor{
    private String thesisTitle;
    private String officeHours;
    private Course[] teachingCourses;
    
    public GraduateStudent(int id, String name, double gpa, String title){
        super(id, name, gpa);
        thesisTitle = title;
    }

    public String getOfficeHours(){
        return officeHours();
    }

    public Course[] getTeachingCourses{
        return teachingCourses;
    }
}