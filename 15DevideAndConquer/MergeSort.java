public class MergeSort{

    public static void mergeSorting(int arr[], int si, int ei)
    {
        if(si >= ei)
        {
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSorting(arr, si, mid); // to create left half
        mergeSorting(arr, mid+1, ei); // to create right half
        merge(arr, si, mid, ei); // calling another method to sort the array
    }
    // merge method to merge sorted arrays
    public static void merge(int arr[], int si, int mid, int ei){

        int temp[] = new int[ei-si+1];
        int i= si; // idx for 1st sorted array
        int j= mid+1; // idx for 2nd sorted array
        int k =0; //idx for temp

        // this is to put the sorted elements into the temp array
        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // for leftover elements of 1st sorted part
        while(i<=mid)
        {
            temp[k++] = arr[i++];
        }
        // for leftover elements of 2nd sorted part
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }
        for(k=0, i=si; k<temp.length; k++,i++)
        {
            arr[i] = temp[k];
        }
    }

    // printing a sorted array
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        int arr[] = {6,3,9,5,2,8,2,3,4,56};
        mergeSorting(arr,0,arr.length-1);
        printArray(arr);
    }
}