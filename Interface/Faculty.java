public class Faculty extends MonthlyEmployee implements Instrcutor{
    private String officeHours;
    private Course[] teachingCourses;

    public Faculty(String officeHours, Course[] teachingCourses){
        this.officeHours = officeHours;
        this.teachingCourses = teachingCourses;
    }

    public String getOfficerHours(){
        return officeHours;
    }
    public Course[] getTeachingCourses(){
        return teachingCourses;
    }

    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public void setTeachingCourses(Course[] teachingCourses){
        this.teachingCourses = teachingCourses;
    }

    public String toString(){
        return "OfficeHours: " + getOfficerHours();
    }
}