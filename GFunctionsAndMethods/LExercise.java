//Write a Java method to compute the average of three numbers

import java.util.Scanner;

public class LExercise {

    public static int average(int a, int b, int c){
        return ((a+b+c)/3);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of num 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Please enter the value of num 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Please enter the value of num 3 : ");
        int num3 = sc.nextInt();
        System.out.println(average(num1, num2, num3));

    }
    
}
