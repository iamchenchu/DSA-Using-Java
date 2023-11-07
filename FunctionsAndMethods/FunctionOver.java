import java.util.*;

public class FunctionOver {

    public static int sum(int i, int j)
    {
        return i+j;
    }
    public static int sum(int i, int j,int k)
    {
        return i+j+k;
    }
    public static void main(String[] args)
    {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the value of a :");
     int a = sc.nextInt();
     System.out.print("Enter the value of b :");
     int b = sc.nextInt();
     System.out.print("Enter the value of c :");
     int c = sc.nextInt();

     System.out.println("the sum of a and b is : "+ sum(a,b));
     System.out.print("the sum of a and b and c is : "+ sum(a,b,c));
    }

}