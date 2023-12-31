//Write a program to print the multiplication table of a number N, entered by the user.

import java.util.Scanner;

public class OExercise4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value to get it's table : ");
        int n = sc.nextInt();
        for(int i= 1; i<=10; i++){
            System.out.println(n + " * "+ i + " = "+n*i);
        }
    }
    
}
