public class CountingSort {

    public static void countingsort(int[] arrr)
    {
        // to find the largest element in the array 
        int largest = Integer.MIN_VALUE;
        for(int i=1;i<arrr.length;i++)
        {
            largest = Math.max(largest,arrr[i]);
        }
        // now we will find the freaquency of each number in the count array, we will create a new array for storing the new count frequency, we will take size as largest+1 
        // because if we have 0 in the array then for that also we need to count the frequency 
        int count[] = new int[largest+1];
        for(int i=0; i<arrr.length;i++)
        {
            count[arrr[i]]++;
        }
        int j=0;
        for(int i=0; i<arrr.length;i++)
        {
            while(count[i]>0){
                arrr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int[] arrr)
    {
        for(int i=0;i<arrr.length;i++)
        {
            System.out.print(arrr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,4,1,3,2,4,3,7};
        countingsort(arr);
        printArray(arr);
    }
}
