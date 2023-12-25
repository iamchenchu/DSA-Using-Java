import java.util.*;

public class ProductAB{


    public static int product() // this is function without params and it is returing the int value at the end.
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a :");
        int a = sc.nextInt();
        System.out.print("Please enter b :");
        int b= sc.nextInt();
        int c = a*b;
        System.out.print(" The product of A and B :"+c);
        return c;
    }

    public static void main(String[] args)

    {
        product();

    }
}