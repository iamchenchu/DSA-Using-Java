import java.security.Principal;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter the first name :");
        String fname = sc.nextLine();
        System.out.print("enter the last name :");
        String lname = sc.nextLine();

        String fullname = fname + " "+lname;

        System.out.println(fullname);

        System.out.println(fullname.charAt(5));

        int n= fullname.length();

        for(int i=0;i<n;i++)
        {
            System.out.println(fullname.charAt(i));
        }
        System.out.println();
    }
    
}
