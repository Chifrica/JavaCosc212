public class TestStudent1 {
    public static void main(String[] args) {
        // Student1 s = new Student1();
        
         Student1 s = new UndergraduateStudent(null, null, 0, null, 0);
         s.name = "Blessing";
         s.gender = "Male";
         s.age = 95;
         s.regNo = "U19EX1030";

        UndergraduateStudent ugs = (UndergraduateStudent)s;
        ugs.gpa = 5.0;

        System.out.print("\n\n" + ugs.toString());

        UndergraduateStudent us = new GraduateStudent1(null, null, 0, null, 0, null);
        us.name = "Isiyaku";
        us.gender = "Female";
        us.age = 99;
        us.regNo = "U15CS1070";
        us.gpa = 5.0;

        GraduateStudent1 g = (GraduateStudent1)us;
        g.thesisTitle = "Java ++";

        System.out.println("\n\n" + g.toString());
    }
}
