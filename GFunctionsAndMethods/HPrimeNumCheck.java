import java.util.Scanner;

public class HPrimeNumCheck {

    public static boolean isPrimeOptimized(int num){ // will take Ologn TC
        if(num ==2)
        {
            return true;
        }
        for(int i =2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

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

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number to check it's Prime status : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isPrimeOptimized(n));

        
    }
    
}
