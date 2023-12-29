//package CConditionalStatements;

import java.util.Scanner;

public class JCalculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of a :");
        int a= sc.nextInt();
        System.out.print("Please enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Please enter your operator for calculation : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

    }
    
}
