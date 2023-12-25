public class Quicksort {

    public static void printArray(int arr[]){

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

    public static void quicksorting(int arr[], int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }

        // last element
        int pidx = partition(arr, si, ei);
        quicksorting(arr, si, pidx-1); // left part
        quicksorting(arr, pidx+1, ei); // right part
    }

    public static int partition(int arr[], int si,  int ei)
    {
        int pivot = arr[ei];
        int i = si-1; // to make place for elements samller than pivot 

        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                //swap
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; // pivot = arr[i]
        arr[i] = temp;
        return i;
        

    }

public static void main(String[] args)
{
    int[] arr = {6,3,9,8,2,5};

    quicksorting(arr, 0, arr.length-1);
    printArray(arr);
}
}
