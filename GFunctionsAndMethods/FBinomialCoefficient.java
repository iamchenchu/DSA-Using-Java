//     ^nCr = n!/r!(n-r)!

import java.util.Scanner;

public class FBinomialCoefficient {

    public static int fact(int num){
        int fact = 1;
        for(int i=1; i<num; i++){
            fact = fact * i;
        }
        return fact;

    }

    public static int binomialCoefficient(int n, int r)
    {
        
        int nfact = fact(n);
        int rfact = fact(r);
        int nsubrFacr = fact(n-r);
        int bcoeff =nfact/rfact*(nsubrFacr);
        return bcoeff;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Please enter the value of r : ");
        int r = sc.nextInt();

        System.out.println("Binamial Coefficient is : "+ binomialCoefficient(n, r));

    }
    
}
