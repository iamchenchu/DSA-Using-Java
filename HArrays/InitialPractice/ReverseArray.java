public class ReverseArray {

    public static void swaparray(int array[])
    {
        int start =0;
        int last = array.length-1;

        while(start<last)
        {
            int temp = array[last];
            array[last] = array[start];
            array[start] = temp;

            start++;
            last--;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int array[] = {2,4,5,3,7,8,9,10};

        swaparray(array);

        for(int i=0; i<array.length;i++)
        {
            System.out.print(array[i]+" ");

        }

    }

}