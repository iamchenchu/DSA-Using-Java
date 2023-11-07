import java.util.*;

public class Factorial{

    public static int fact(int n)
    {
        int facto = 1;

        for(int i =1; i<=n; i++)
        {
            facto = i*facto;
        }
        System.out.print("The factorial is :"+ facto);
        return facto;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the number to find the factorial : ");
        // int n = sc.nextInt();
        // fact(n);
        
        System.out.print("Enter the number to find the factorial : ");
        int n = sc.nextInt();
        fact(n);
        
        
    }


}