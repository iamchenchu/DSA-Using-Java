import java.util.Scanner;

public class E01traingle {

    public static void binaryTraingle(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();

        }

    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the levels to print the binary traingle : ");
        int n = sc.nextInt();
        binaryTraingle(n);

    }
    
}
