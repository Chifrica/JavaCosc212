/*
    Upcasting is another type of object typecasting. 
    In Upcasting, we assign a parent class reference object to the child class. 

    In Upcasting and Downcasting, we typecast a child object to a parent object 
    and a parent object to a child object simultaneously. 
    We can perform Upcasting implicitly or explicitly, but downcasting cannot be 
    implicitly possible.

    In Java, we cannot assign a parent class reference object to the child class, 
    but if we perform downcasting, we will not get any compile-time error. 
    However, when we run it, it throws the "ClassCastException". 

    Now the point is if downcasting is not possible in Java, then why is it allowed by the compiler? 
    In Java, some scenarios allow us to perform downcasting. 
    Here, the subclass object is referred by the parent class.

    Below is an example of downcasting in which both the valid and the invalid scenarios are explained: 
*/

class Parent {
    String name;

    public void showMessage(){
        System.out.println("Parent method ius called.");
    }
}

class Child extends Parent {
    int age;

    public void showMessage(){
        System.out.println("Child method is called");
    }
}

public class Down1 {
    public static void main(String[] args){
        Parent p = new Child();
        p.name = "Blessing";

        Child c = (Child)p;
        c.age = 30;

        System.out.println(c.age + "\n" + c.name);
        c.showMessage();
    }
}

/*
        Upcasting
    In Java, we rarely use Upcasting. We use it when we need to develop a code 
    that deals with only the parent class. 
    A child object is typecasted to a parent object.
    We can perform Upcasting implicitly or explicitly.
    In the child class, we can access the methods and variables of the parent class.
    We can access some specified methods of the child class.
    Parent p = new Parent()
       
        Downcasting
    Downcasting is used when we need to develop a code that accesses behaviors of the child class.
    The reference of the parent class object is passed to the child class.
    Implicitly Downcasting is not possible.
    The methods and variables of both the classes(parent and child) can be accessed.
    All the methods and variables of both classes can be accessed by performing downcasting.
    Parent p = new Child()
Child c = (Child)p;
*/