/*Write a program that reads a set of integers, and then prints the sum of the even and odd integers */

import java.util.Scanner;

public class OExercise2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number to get EvnSum and OddSum : ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        do{
            int lastDigit = n%10;
            if(lastDigit % 2 == 0){
                evenSum +=  lastDigit;
            }else{
                oddSum += lastDigit;
            }
            n = n/10;

        }while(n>1);

        System.out.println("The Even sum is : "+ evenSum);
        System.out.println("The Odd sum is : "+ oddSum);
    }
    
}
