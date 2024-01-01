import java.util.Scanner;

public class EFactorial {

    public static int fact(int num){
        int factorial = 1;
        for(int i=num; i>=1 ; i--)
        {
            factorial = factorial*i;
        }
        return factorial;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of n to find the factorial : ");
        int n = sc.nextInt();

        System.out.println("Factorial of "+ n +" is : "+ fact(n));

    }
    
}
