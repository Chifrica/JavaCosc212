package Examination;
/*
 * Write a Java program that will create an array of String for the student’s names,
 * and a ragged two-dimensional array of int to store their marks. The program
 * should calculate and display the average mark for each student in the form
 * 
 * Fatima’s average mark was #.##.
 */

public class PQ1 {
    public static void main(String[] args) {
        
        // Array of string for the student's names.
        String [] names = {"Yusuf", "Femi", "Fatima"};
        
        // A ragged two-dimensional array of int.
        int [][] marks = {
            {6, 8, 8,7},
            {5, 9, 6},
            {7, 6, 9, 4, 8}
        };

        int [] sum = new int[3];
        double [] average = new double[3];

        for (int i = 0; i < marks.length; i++){
            sum[i] = 0;
            for (int j = 0; j < marks[i].length; j++)
                sum[i] += marks[i][j];
            average[i] = (double) sum[i] / marks[i].length;
                
            System.out.printf("%s's average " + "marks was %5.2f\n", names[i], average[i]); 
        } // End of outer loop.
    } // End of main method().
} // End of class.