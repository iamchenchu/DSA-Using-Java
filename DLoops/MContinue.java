// Display all number except the multiples of 10

import java.util.Scanner;

public class MContinue {
    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        do{
            System.out.print("Please enter your number : ");
            int n = sc.nextInt();
            if(n%10 == 0){
                continue;
            }
            System.out.println("The number was : "+ n);
        }while(true);

    }
    
}
