public class SubArray {

    public static void sub(int arr[])
    {
        int counter =0;

        for(int i=1;i<=arr.length;i++)
        {
            int start = arr[i];
            for(int j=1;j<arr.length;j++)
            {
                for(int k=1; k<=i;k++)
                {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {

        int array[] = {1,2,4,5,6,7};
        sub(array);

    }
    
}
