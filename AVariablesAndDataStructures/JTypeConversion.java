// Conversion happens when type is compatable or destination type > source type 
// converting one type data to another type of the data
// byte > short > int > float > long > double this is the way of compatable types
// when destination is smaller than the source then it's called the lossy conversion
// widening or implicit conversion or type conversion : sourse type will become smaller than the destination always 

import java.util.Scanner;

public class JTypeConversion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);  // this is possible 



    }
    
}
