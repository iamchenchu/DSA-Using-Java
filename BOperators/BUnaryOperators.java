// Unary Operators : ++ --
// Preincrement and degrement : ++a, --a      -> first value will change and will be used
// Postincrement and degrement : a++, a--     -> value will be used then will be changed


public class BUnaryOperators {

    public static void main(String[] args){
        int a = 10;
        int b = 20;
        //post increment and decrement
        int c = a++;
        int d = b--;
        System.out.println(c);
        System.out.println(a);
        System.out.println(d);
        System.out.println(b);

        //pre increment and decrement
        int e = ++a;
        int f = --b;
        System.out.println(e);
        System.out.println(f);     


    }
    
}
