// rev = (rev*10)+lastdigit

public class HReverseNum {

    public static void main(String[] args) {
        int n = 31071998;
        int rev = 0;
        while(n > 0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit; 
            n = n/10;

        }
        System.out.println(rev);

    }
    
}
