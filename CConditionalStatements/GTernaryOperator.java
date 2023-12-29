//package CConditionalStatements;
// variable = condition? statement1 : statement 2;

import java.util.Scanner;

public class GTernaryOperator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number to check it's type : ");
        int n = sc.nextInt();

        String type = ((n%2) == 0) ? "This is even number" : "This is odd number";
        System.out.println(type);


    }
    
}
