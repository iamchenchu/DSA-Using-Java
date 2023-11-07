import java.util.*;

public class FunctionOver2 {

    public static float sum(float i, float j)
    {
        return i+j;
    }
    public static float sum(float i, float j,float k)
    {
        return i+j+k;
    }
    public static void main(String[] args)
    {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the value of a :");
     float a = sc.nextFloat();
     System.out.print("Enter the value of b :");
     float b = sc.nextFloat();
     System.out.print("Enter the value of c :");
     float c = sc.nextFloat();

     System.out.println("the sum of a and b is : "+ sum(a,b));
     System.out.print("the sum of a and b and c is : "+ sum(a,b,c));
    }

}