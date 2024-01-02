

import java.util.Scanner;

public class BInvertedRotatedHalfPyramid {
    public static void rotatedHalfPyramid(int r, int c){
        // outer loop
        for(int i=1; i<=r; i++){
            //InnerLoop
            for(int j=1; j<=c; j++){
                if(i == r || j==c || j == r-i || i==c-j  ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the row count : ");
        int r = sc.nextInt();
        System.out.print("Please enter the column count : ");
        int c = sc.nextInt();
        rotatedHalfPyramid(r, c);


    }
    
}
