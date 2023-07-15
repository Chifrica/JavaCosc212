/*
1.  A class, Person, with an instance variable, name. Write appropriate 
    accessor and mutator methods for the class. Also write a toString method 
    for the class.

2.  Employee, that extends Person, and has: two additional instance 
    variables, ID and payRate; and an additional method, pay, that returns 
    the payRate. Override the toString method accordingly.

3.  Faculty, that extends Employee, and has two additional variables; 
    officeHours of type String and teachingCourses, which is an array of 
    Courses. Each course has course code and course title. Write appropriate 
    accessor, mutator and toString methods for the class.

4.  TestPersons, that has two methods: void printPerson(Person p) that 
    prints its argument. And a main method that creates an instance of each 
    of the above classes and prints it using printPerson method.

*/

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

/*                                          2
                Employee, that extends Person, and has: two additional instance 
                variables, ID and payRate; and an additional method, pay, that returns 
                the payRate. Override the toString method accordingly.
*/

//Employee Class

class Employee extends Person {
    private int ID;
    private double payRate;

    public Employee(String name, int ID, double payRate) {
        super(name);
        this.ID = ID;
        this.payRate = payRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double pay() {
        return payRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", ID=" + ID +
                ", payRate=" + payRate +
                '}';
    }
}

/*                                          3
            Faculty, that extends Employee, and has two additional variables; 
            officeHours of type String and teachingCourses, which is an array of 
            Courses. Each course has course code and course title. Write appropriate 
            accessor, mutator and toString methods for the class.
*/
//Faculty Class

class Faculty extends Employee {
    private String officeHours;
    private Course[] teachingCourses;

    public Faculty(String name, int ID, double payRate, String officeHours, Course[] teachingCourses) {
        super(name, ID, payRate);
        this.officeHours = officeHours;
        this.teachingCourses = teachingCourses;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public Course[] getTeachingCourses() {
        return teachingCourses;
    }

    public void setTeachingCourses(Course[] teachingCourses) {
        this.teachingCourses = teachingCourses;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + getName() + '\'' +
                ", ID=" + getID() +
                ", payRate=" + getPayRate() +
                ", officeHours='" + officeHours + '\'' +
                ", teachingCourses=" + Arrays.toString(teachingCourses) +
                '}';
    }
}

/*                                          4
                TestPersons, that has two methods: void printPerson(Person p) that 
                prints its argument. And a main method that creates an instance of each 
                of the above classes and prints it using printPerson method.
*/

//TestPerson Class

class TestPersons {
    public static void main(String[] args) {
        Person person = new Person("John Doe");
        Employee employee = new Employee("Jane Smith", 123, 20.0);
        Faculty faculty = new Faculty("Alice Johnson", 456, 30.0, "9 AM - 5 PM",
                new Course[]{
                        new Course("CSC101", "Introduction to Computer Science"),
                        new Course("ENG201", "English Composition")
                });

        printPerson(person);
        printPerson(employee);
        printPerson(faculty);
    }

    private static void printPerson(Person p) {
        System.out.println(p.toString());
        System.out.println("----------------");
    }
}


//  Please make sure to implement it with the required instance variables, 
//  accessor/mutator methods, and toString method.