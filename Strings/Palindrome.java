import java.util.Scanner;

public class Palindrome {

    public static boolean palindrome(String str)
    {

        int n = str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the word to check the palindrome status : ");
        String word = sc.nextLine();
        System.out.println(palindrome(word));


    }
    
}
