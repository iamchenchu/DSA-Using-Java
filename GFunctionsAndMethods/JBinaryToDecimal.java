import java.util.Scanner;

public class JBinaryToDecimal {

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int decNo = 0;
        int pow = 0;
        
        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNo = decNo + (lastdigit * (int)Math.pow(2, pow));
            pow++;  
            binNum = binNum/10;
        }
        System.out.println("The decimal no of "+ myNum +" is : "+ decNo);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the binary number to conver to decimal Num : ");
        int binaryNo = sc.nextInt();

        binToDec(binaryNo);
        
    }
    
}
