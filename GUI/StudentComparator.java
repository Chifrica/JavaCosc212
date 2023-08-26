import java.util.*;

class StudentComparator implements Comparator{

    // Instance variables
    
    private int iDNumber;
    private double gPA;

    // Constructor with two parameters

    public StudentComparable (int iDNumber, double gPA){
        this.iDNumber = iDNumber;
        this.gPA = gPA;
    }

    // Constructor with one parameter

    public StudentComparator (int iDNumber){
        this(iDNumber, 0.0);
    }

    // toString method

    public String toString(){
        return iDNumber + "\t" + gPA;
    }

    // compareTo (comparable) method

    public int compare(Object object1, Object object2){
        StudentComparator s1 = (StudentComparator) object1;
        StudentComparator s2 = (StudentComparator) object2;

        if(s2.iDNumber < s1.iDNumber)
            return -1;
        else if (s2.iDNumber > s1.iDNumber)
            return 1;
        else
            return 0;
    }

    // equals (comparable) methods

    public boolean equals(Object object){
        return compare(object) == 0;
    }
}