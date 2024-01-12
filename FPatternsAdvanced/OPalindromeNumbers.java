import java.util.Scanner;

public class OPalindromeNumbers {

    public static void palindromeNumbers(int n){
        for(int i=1; i<=n; i++){
            // for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for numbers
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i;j++){
                int k = j;
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of lines to print the palindrome number pattern : ");
        int n = sc.nextInt();
        palindromeNumbers(n);
        
    }
    
}
