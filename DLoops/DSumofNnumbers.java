import java.util.Scanner;

public class DSumofNnumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the n number to find the total sum :");
        int n = sc.nextInt();
        int sum = 0;
        int i =1;
        while(i<=n) {
            sum +=i;
            i++;
        }
        System.out.println("Sum of n natural numbers is : "+ sum);

    }
    
}
