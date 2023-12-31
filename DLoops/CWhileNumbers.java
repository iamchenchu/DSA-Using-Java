import java.util.Scanner;

public class CWhileNumbers {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the number to print number : ");
    int n = sc.nextInt();
    int counter = 1;

    while(counter <=n) {
        System.out.println(counter);
        counter++;
    }
    }
    
}
