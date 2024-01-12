import java.util.Scanner;

public class IDiamondPattern {

    public static void diamond(int n){

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of line to print : ");
        int n = sc.nextInt();
        diamond(n);
    }
    
}
