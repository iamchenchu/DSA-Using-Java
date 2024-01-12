import java.util.Scanner;

public class HHollowRhombus {

    public static void hallorhombus(int n){

        for(int i=1; i<=n; i++){
            if(i==1 || i==n){
                for(int j=1; j<=(n-i)+1; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=n; j++){
                    System.out.print("*");
                }
                //System.out.println();
            }
            else{
                for(int j=1; j<=n-i+1; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=1; j++){
                    System.out.print("*");
                }
                for(int j=1; j<=n-2; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=1; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
            
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the n value : ");
        int n = sc.nextInt();
        hallorhombus(n);


    }
    
}
