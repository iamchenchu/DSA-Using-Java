// keep entering the numbers till user enters a multiple of 10

import java.util.Scanner;

public class KBreak {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Please enter the num : ");
            int n = sc.nextInt();
            if(n % 10 ==0 ){
                break;
            }
        } while(true);

    }
}
