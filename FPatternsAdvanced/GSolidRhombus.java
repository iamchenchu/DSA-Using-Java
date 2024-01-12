import java.util.Scanner;

public class GSolidRhombus {

    public static void solidRhombus(int n){
        for(int i=1; i<=n; i++){
            // spaces " " : (n-i)+1
            for(int j=1; j<=(n-i)+1; j++){
                System.out.print(" ");
            }

            // stars "*" : n
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the n value to print rhombus : ");
        int n =sc.nextInt();
        solidRhombus(n);

    }
    
}
