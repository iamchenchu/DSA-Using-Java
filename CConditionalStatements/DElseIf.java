//package CConditionalStatements;

import java.util.Scanner;

public class DElseIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the age : ");
        int age = sc.nextInt();

        if(age >= 18 && age < 25) {
            System.out.println("Adult!!");
        } else if (age >= 13 && age <18){
            System.out.println("Teenager!!");
        } else if(age >= 25){
            System.out.println("Grown man!!");
        }else {
            System.out.println("Child!!");
        }
    
} 
}
