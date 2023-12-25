// explicitly converting one type of data to another type is called type casting, where as type conversion happens within compatable types
// usuablly we can not convert the float to int in type conversion byt here in type casting it is possible
// narrowing, explicit conversion

import java.util.Scanner;

public class KTypeCasting {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float a = 25.12f;
        int b = (int)a;
        System.out.println(b);

        char ch = 'a';
        int number = ch;

        System.out.println(number);

    }
    
}
