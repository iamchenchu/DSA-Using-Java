//package CConditionalStatements;

import java.util.Scanner;

public class EIncomeTax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your income :");
        int income = sc.nextInt();

        if(income < 500000) {
            System.out.println("Your tax is : 0" );
        } else if(income > 500000 && income <=100000) {
            System.out.println("Your Tax is :"+ (int)(income *0.2));
        } else {
            System.out.println("Your tax is :"+(int)(income * 0.3));
        }
    }
    
}
