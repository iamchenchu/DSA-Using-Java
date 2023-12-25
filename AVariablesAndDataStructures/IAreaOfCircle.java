import java.util.*;

public class IAreaOfCircle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radious of a circle : ");
        float radious = sc.nextFloat();

        float area = 3.14f * radious * radious ;

        System.out.println("Tha are of a circle is :" + area);

    }
    
}
