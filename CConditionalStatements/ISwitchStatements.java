//package CConditionalStatements;

import java.util.Scanner;

public class ISwitchStatements {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the switch case no : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("For addition");
                break;
            case 2 :
                System.out.println("For Subtraction");
                break;
            case 3 : 
                System.out.println("For Multiplication");
                break;
            case 4 :
                System.out.println("For Division");
                break;
        
            default:
                System.out.println("Unknow operation");

                break;
        }


    }
    
}
