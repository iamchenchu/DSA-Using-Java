import java.util.*;

public class BinomCoefficient{

    public static int fact(int f)
    {
        int facto =1;
        for(int i=1;i<=f;i++)
        {
            facto = i*facto;
        }
        return facto;
    }
    public static int binomcoff(int n, int r)
    {
        int nfact = fact(n);
        int rfact = fact(r);
        int nrfact = fact(n-r);
        int binomcoff = nfact/(rfact*nrfact);
        return binomcoff;

    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the values of N to calculate Binomial Coefficient :");
        int n_value = sc.nextInt();
        System.out.print("Please enter the values of R to calculate Binomial Coefficient :");
        int r_value = sc.nextInt();
        System.out.println("the binomial coefficient is : "+ binomcoff(n_value,r_value));
        
        
    }
}