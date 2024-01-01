/*Function Overloading : Multiple functions with same name but different parameters, 
type of parameters can be differenet and also number of parameters
 */

 
public class GFunctionOverLoading {

    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args){

        System.out.println(sum(4,3));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(2,3,6));
        System.out.println(sum(3.4f, 5.3f));


    }
    
}
