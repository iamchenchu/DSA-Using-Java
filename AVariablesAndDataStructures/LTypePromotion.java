// Java automatically promotes each byte, short, char operand to int when evaluationg the expression
// If one operand is long, float or double the whole expression is promoted to long, float, or double respectively
// type promotions happens only with the expressions
// 


public class LTypePromotion {

    public static void main(String[] args){
        char a = 'a';
        char b = 'b';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(b-a);       // as it is an expression java automatically converts the char to int and return the value 1
        System.out.print(a);           // prints a coz it is not an expression

    }
    
}
