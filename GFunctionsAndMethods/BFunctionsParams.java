/*
returnType methodName(type param1, type param 2){
    // Body
    return statement
} */

// Formal Parameter : we write these during the definition of a method
// Actual Parameter : We write these during the method calling


import java.util.Scanner;

public class BFunctionsParams {

    public static int calculateSum(int a, int b){ // Parameters or formal parameters
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B : ");
        int b = sc.nextInt();

        System.out.println("Sum is : "+ calculateSum(a, b)); // arguments or actual parameters

    }
    
}
