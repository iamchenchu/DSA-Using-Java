

import java.util.Scanner;

public class BInvertedRotatedHalfPyramid {

    public static void rotatedHalfPyramid(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars 
            for(int j=1; j<=i; j++){
            System.out.print("*");
            }
            System.out.println(); 
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the levels : ");
        int n = sc.nextInt();
        rotatedHalfPyramid(n);


    }
    
}
