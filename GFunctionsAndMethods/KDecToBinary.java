import java.util.Scanner;

public class KDecToBinary {

    public static void decToBinary(int n){
        int pow = 0;
        int myNum = n;
        int binaryNum = 0;
        while(n>0){
            int remainder = n%2;
            binaryNum = binaryNum + (remainder *(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }

        System.out.println("The Binary no of "+ myNum+" is : "+ binaryNum);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the decimal number to convert it to binary : ");
        int n = sc.nextInt();
        decToBinary(n);

    }
    
}
