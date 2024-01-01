// Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not) A number is called a palindrome
// if the number is equal to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand,
// 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.

import java.util.Scanner;

public class LExercise3 {
    public static boolean isPalindrome(int num){
        int palindrome = num;
        int revNum = 0;
        while(palindrome != 0){
            int lastdigit = palindrome % 10;
            revNum = revNum * 10 + lastdigit;
            palindrome = palindrome/10;

        }
        if(num == revNum){
            return true;
        }

        return false;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number to find it's palindrome status : ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));


    }
    
}
