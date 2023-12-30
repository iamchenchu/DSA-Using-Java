/* Write a Java program to get a number from the user and print whether it is positive or negative. */

import java.util.Scanner;

public class KExercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println(num+ " The number is negative");
        } else {
            System.out.println(num + " The number is positive");
        }

    }
    
}
