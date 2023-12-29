//package CConditionalStatements;

import java.util.Scanner;

public class AConditionStatements {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the age :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult : You can vote and drive!!");
        }else if(age >13 && age <18){
            System.out.println("Teenager!!");
        }
         else {
            System.out.println("Not Adult : You can not vote and drive");
        }
    }
    
}
