import java.util.Scanner;


public class IPrintPrimes {
    
    public static boolean isPrime(int num){ // will take O(n) TC
        if(num ==2)
        {
            return true;
        }
        for(int i=2; i<=num-1; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimes(int num){ 
        int counter =0;
       for(int i=2; i<=num-1; i++){
         if(isPrime(i)== true){
            System.out.print(i+",");
            counter++;
         }
       }
        System.out.println("\nTotal Prime numbers : "+ counter);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number to print all the primes, till it's range : ");
        int n = sc.nextInt();
        printPrimes(n);



    }
    
}
