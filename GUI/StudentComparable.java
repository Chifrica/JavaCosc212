class StudentComparable implements Comparable{

    // Instance variables
    
    private int iDNumber;
    private double gPA;

    // Constructor with two parameters

    public StudentComparable (int iDNumber, double gPA){
        this.iDNumber = iDNumber;
        this.gPA = gPA;
    }

    // Constructor with one parameter

    public StudentComparable (int iDNumber){
        this(iDNumber, 0.0);
    }

    // toString method

    public String toString(){
        return iDNumber + "\t" + gPA;
    }

    // compareTo (comparable) method

    public int compareTo(Object object){
        StudentComparable s = (StudentComparable) object;
        if(iDNumber < s.iDNumber)
            return -1;
        else if (iDNumber > s.iDNumber)
            return 1;
        else
            return 0;
    }

    // equals (comparable) methods

    public boolean equals(Object object){
        return compareTo(object) == 0;
    }
}