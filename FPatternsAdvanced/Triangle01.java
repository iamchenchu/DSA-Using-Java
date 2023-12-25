public class Triangle01 {

    public static void flyod(int n)
    {
        for(int i=1; i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)% 2 == 1)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        flyod(10);

    }
    
}
