//

import java.util.Scanner;

public class NPrimeNumberCheck {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int n = sc.nextInt();

        if(n==2){
            System.out.println(n + " is a prime number");
        } else {
            boolean isPrime = true;
            for(int i=2; i<n-1; i++){
                if(n%i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true ){
                System.out.println(n + " is a Prime number");
            } else {
                System.out.println(n + " is not a Prime number");
            }
        }

    }
    
}

/*
 We can optimise the code more to reduce the TC
 for(int i = 2; i<= Math.sqrt(n); i++){
    if(n%i == 0){
        isPrime = false;
        }
 }
 */
