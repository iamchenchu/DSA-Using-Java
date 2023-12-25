// If one operand is long, float or double the whole expression is promoted to long, float, or double respectively
// type promotions happens only with the expressions

public class LTypepromotion2 {

    public static void main(String[] args){
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a+b+c+d;
        System.out.println(ans);     // type promotion 
    }
    
}
