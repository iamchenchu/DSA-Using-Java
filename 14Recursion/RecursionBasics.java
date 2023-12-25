public class RecursionBasics {

    public static void printDecrement(int n){
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDecrement(n-1);
    }

    public static void main(String[] args)
    {
        int n=10;
        printDecrement(n);

    }
    
}
