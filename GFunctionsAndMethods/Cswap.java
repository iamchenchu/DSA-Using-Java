public class Cswap{

    public static void swap(int a, int b){
        //swap
        int temp;
        temp = a;
        a = b;
        b= temp;

        System.out.println("Value of a is : "+ a);
        System.out.println("Value of b is : "+ b);

    }

    public static void main(String[] args){
        int a =10;
        int b = 5;
        swap(a, b);

        System.out.println("Value of a is : "+ a); //change is applicable within function only 
        System.out.println("Value of b is : "+ b); //change is applicable within function only 

    }
}