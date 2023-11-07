public class SumNatural {

    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int summ = sum(n-1);
        int sn = n+summ;

        return sn;


    }

    public static void main(String[] args)
    {
        int n = 10;
        System.out.println(sum(n));
    }
    
}
