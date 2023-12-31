// Print the reverse number of given number 


public class GReverseNumber {

    public static void main(String[] args){
        int n = 31071998;
        
        while(n>0) {
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }
    }

    
}
