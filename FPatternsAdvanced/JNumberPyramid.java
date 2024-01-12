import java.util.Scanner;

public class JNumberPyramid {

    public static void numberPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the n value to print the number pyramid : ");
        int n = sc.nextInt();
        numberPyramid(n);
    }
    
}
