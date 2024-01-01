// Write a Java method to compute the sum of the digits in an integer.

import java.util.Scanner;

public class LExercise5 {
    public static int sumDigits(int n) {
        int sumOfDigits = 0;

        while(n>0){
            int lastdigit = n%10;
            sumOfDigits += lastdigit;
            n /= 10;
        }
        return sumOfDigits;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumDigits(digits));


    }
    
}
