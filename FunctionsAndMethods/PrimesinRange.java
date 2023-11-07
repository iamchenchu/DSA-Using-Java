public class PrimesinRange
{
    public static boolean isPrime(int n)
    {
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                isPrime = false;
            }
        }
        return isPrime;

    }

    public static void primeRange(int n)
    {
        for(int i = 2; i<=n;i++)
        {
            if(isPrime(i))
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        primeRange(100);
    }
    
}