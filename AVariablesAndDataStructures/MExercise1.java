// Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)

import java.util.Scanner;

public class MExercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A :");
        int A = sc.nextInt();
        System.out.print("Enter the value of B :");
        int B = sc.nextInt();
        System.out.print("Enter the value of C :");
        int C = sc.nextInt();

        int average = ((A+B+C)/3);
        System.out.println("The average of the above 3 numbers is  :"+ average);

    }
    
}
