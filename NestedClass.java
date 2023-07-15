/*
    A nested class, also known as an inner class, is a class that is defined within another class. 
    The nested class is tightly bound to its enclosing class and has access to the members 
    (variables and methods) of the enclosing class, including its private members.
*/

class OuterClass {
    private int outerData;

    public void outerMethod() {
        System.out.println("Outer method");
        NestedClass nested = new NestedClass();
        nested.innerMethod();
    }

    // Nested class
    class NestedClass {
        private int innerData;

        public void innerMethod() {
            System.out.println("Inner method");
            outerData = 10; // Accessing outer class member
            innerData = 20; // Accessing inner class member
            System.out.println("Outer data: " + outerData);
            System.out.println("Inner data: " + innerData);
        }
    }
}

class Main {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.outerMethod();
    }
}


/*
    There are four types of nested classes in Java:

 1.   Static nested classes: These are static classes defined within another class. 
        They are similar to regular classes but are enclosed within another class for organizational purposes. 
        Static nested classes can access only the static members of the enclosing class.

        Static member classes are analogous to other static class members.
        • Like a class method, a static member class is a top-level entity.
        • A static member class has access to all static members of its outer class.
        • static member classes can be defined only in top-level classes .
*/

class StaticClass {
    private static int outerData;

    public static void outerMethod1() {
        System.out.println("Outer method");
        StaticNestedClass nested = new StaticNestedClass();
        nested.innerMethod();
    }

    // Static nested class
    static class StaticNestedClass {
        private int innerData;

        public void innerMethod() {
            System.out.println("Inner method");
            outerData = 10; // Accessing outer class static member
            innerData = 20; // Accessing inner class member
            System.out.println("Outer data: " + outerData);
            System.out.println("Inner data: " + innerData);
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        StaticClass.outerMethod1();
    }
}


/*
  2.  Non-static nested classes (Inner classes): These are non-static classes defined within another class. 
        They have access to both static and non-static members of the enclosing class. 
        Inner classes can also have different access modifiers, such as private, protected, or public.

        A member class is analogous to an instance field or instance method.
        • Like other instance members, a member class can have any access modifier.
        • Every instance of a member class is linked with an instance of the containing class.
        • Member classes cannot have static fields, static methods or static classes

  3.  Local classes: These are classes defined within a method or a block of code. 
        Local classes are used when you need a class for a specific purpose within a small scope. 
        They have access to the members of the enclosing class and the local variables of the enclosing method or block.
*/

class OuterClass2 {
    private int outerData = 10;

    public void outerMethod2() {
        System.out.println("Outer method");
        
        class LocalClass {
            private int innerData = 20;

            public void innerMethod() {
                System.out.println("Inner method");
                outerData = 30; // Accessing outer class member
                innerData = 40; // Accessing inner class member
                System.out.println("Outer data: " + outerData);
                System.out.println("Inner data: " + innerData);
            }
        }
        
        LocalClass localObj = new LocalClass();
        localObj.innerMethod();
    }
}

class Main2 {
    public static void main(String[] args) {
        OuterClass2 outerObj = new OuterClass2();
        outerObj.outerMethod2();
    }
}

/*
  4.  Anonymous classes: These are special types of local classes that do not have a name. 
        They are declared and instantiated at the same time. Anonymous classes are often used when you need 
        to define a one-time implementation of an interface or extend a class without explicitly creating a named subclass.
*/

class AnonymousClassExample {
    public static void main(String[] args) {
        // Creating an anonymous class instance of the interface
        MyInterface myInterface = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("Anonymous class is doing something");
            }
        };

        myInterface.doSomething(); // Invoking the method of the anonymous class
    }
}

interface MyInterface {
    void doSomething();
}

/*
    Nested classes provide several benefits, including:

    Encapsulation: Nested classes can access the private members of their enclosing class, allowing for better encapsulation of related functionality.
    Code organization: By nesting classes, you can group related classes together, making the code more readable and maintainable.
    Increased encapsulation and information hiding: By defining a class within another class, you can limit its visibility and prevent it from being accessed by other classes that are not part of the enclosing class.
    It's important to note that nested classes are a design choice and should be used judiciously based on the requirements of your application.
 */