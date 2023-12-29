//package CConditionalStatements;

import java.util.Scanner;

public class CEvenorOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter value to check : ");
        int n = sc.nextInt();
        if(n%2 == 0) {
            System.out.println("this number is an even number");
        } else {
            System.out.println("This number is not an even number");
        }


    }
    
}
