import java.util.Scanner;

public class DFloydTraingle {
    public static void floyidtraingle(int n){
        int num = 1;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the levels to print the flyds triangle : ");
        int n = sc.nextInt();
        floyidtraingle(n);

    }
    
}
