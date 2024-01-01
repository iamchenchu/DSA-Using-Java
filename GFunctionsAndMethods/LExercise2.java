//Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.
// Also write a program to test your method.

import java.util.Scanner;

public class LExercise2 {
    public static boolean isEven(int num){
        if(num%2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to check it's even status : ");
        int num = sc.nextInt();
        System.out.println(isEven(num));

    }
    
}
