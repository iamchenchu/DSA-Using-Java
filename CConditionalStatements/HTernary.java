//package CConditionalStatements;
// variable = condition? statement1 : statement 2;
import java.util.Scanner;

public class HTernary {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your marks to check you passing status : ");
        int marks = sc.nextInt();

        String status = (marks >= 35)? "Wow you are passed " : " Sorry You are failed !!";
        System.out.println(status);


    }
    
}
