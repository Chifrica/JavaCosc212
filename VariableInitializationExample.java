/* 
1. Write a program to show that each loaded type has only one instance of 
    java.lang.Class associated with it, irrespective of how many times it is 
    used in a class.
2. Write a program to show that Loading may be caused either by creating 
    instance of a class or by accessing a static member.
3. Write a class to show that class variables are initialized with their default 
    values when loaded. Also show that instance variables are initialized
    with their default values when an object is created.
4. Demonstrate that Verification actually takes place in the Loading
    process. To do this, write a class, Base, and a class, SubClass, that 
    extends Base. Compile both classes. Then modify Base by changing the 
    signature of one of its methods and compile it alone. Now write a test 
    program that uses Subclass and try to compile and run it. 
*/

// The following program demonstrates that each loaded type has only one instance 
// of java.lang.Class associated with it:

class MyClass {
    // Class implementation
}

class ClassInstanceExample {
    public static void main(String[] args) {
        Class<?> class1 = MyClass.class;
        Class<?> class2 = MyClass.class;

        System.out.println(class1 == class2); // Output: true
    }
}

/*
    In this above program, the MyClass is loaded and the java.lang.
    Class instance associated with it is stored in the variables class1 and class2.
    The comparison class1 == class2 returns true, indicating that they both refer 
    to the same java.lang.Class instance. This demonstrates that each loaded type has 
    only one java.lang.Class instance associated with it.

*/

/*                                                 2
                Write a program to show that Loading may be caused either by creating 
                an instance of a class or by accessing a static member.

                The following program demonstrates that loading can be caused by creating
                an instance of a class or by accessing a static member:
*/

class MyClass2 {
    // Static member
    public static int staticField;

    // Instance initialization block
    {
        System.out.println("Loading MyClass");
    }
}

class LoadingExample {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass();

        // Access a static member of MyClass
        int value = MyClass2.staticField;

        // Output: Loading MyClass
    }
}

/*
    In this above program, creating an instance of MyClass (new MyClass()) 
    and accessing its static member (MyClass.staticField) both trigger the 
    loading of the MyClass class. The program output demonstrates that the class is 
    loaded when either of these actions is performed.

*/

/*                                          3

                Write a class to show that class variables are initialized with their default 
                values when loaded. Also show that instance variables are initialized
                with their default values when an object is created.
                    
                The following class demonstrates the initialization of class and instance 
                variables with their default values:

*/

public class VariableInitializationExample {
    static int staticVariable; // Class variable
    int instanceVariable; // Instance variable

    public static void main(String[] args) {
        VariableInitializationExample example = new VariableInitializationExample();

        System.out.println("Static variable: " + staticVariable); // Output: 0
        System.out.println("Instance variable: " + example.instanceVariable); // Output: 0
    }
}

/*
    In this above program, the class VariableInitializationExample has a 
    static variable staticVariable (class variable) and an instance variable instanceVariable. 
    When the class is loaded, the static variable is automatically initialized 
    with its default value of 0. When an instance of the class is created 
    (new VariableInitializationExample()), the instance variable is initialized 
    with its default value of 0. The program output demonstrates the default 
    values of both variables.

*/

/*                                          4
                Demonstrate that Verification actually takes place in the Loading
                process. To do this, write a class, Base, and a class, SubClass, that 
                extends Base. Compile both classes. Then modify Base by changing the 
                signature of one of its methods and compile it alone. Now write a test 
                program that uses Subclass and try to compile and run it.

                The following example demonstrates that verification takes place during the 
                loading process:
*/

class Base {
    public void method() {
        System.out.println("Base method");
    }
}

class SubClass extends Base {
    public void method() {
        System.out.println("SubClass method");
    }
}

class TestVerificationExample {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.method();
    }
}

/*
    In this above program, the Base class is compiled first, followed by the SubClass class.
    After that, a test program is written in the VerificationExample class, 
    which creates an instance of SubClass and calls its method().

    Now, modify the Base class by changing the signature of its method:
*/

class Base2 {
    public void method(int value) { // Changed signature
        System.out.println("Base method");
    }
}
/*
    Compile only the Base class separately.

    If you try to compile and run the VerificationExample class without 
    recompiling the SubClass class, you will encounter a compilation error.

*/