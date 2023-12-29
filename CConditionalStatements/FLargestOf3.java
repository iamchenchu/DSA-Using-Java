//package CConditionalStatements;

import java.util.Scanner;

public class FLargestOf3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please ente the value of a : ");
        int a = sc.nextInt();
        System.out.print("Please ente the value of b : ");
        int b = sc.nextInt();
        System.out.print("Please ente the value of c : ");
        int c = sc.nextInt();
        if(a>=b && a>=c) {
            System.out.println("a is the largest element");
        } else if(b>=a && b>=c) {
            System.out.println("b is the largest element");
        } else {
            System.out.println("C is the largest element");
        }
    }
    
}
