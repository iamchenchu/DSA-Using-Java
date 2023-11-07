public class InvertedNumbers {

    public static void inverted_numbers_pyramid(int n){

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++){

                System.out.print(j);
            }
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        inverted_numbers_pyramid(10);
    }
}
