public class BSelectionSort {

    public static void selectionSortForAscending(int arr[]){

        for(int i=0; i<arr.length; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]= temp;
        }

    }

    public static void selectionSortForDescending(int[] arr){
        for(int i=0; i<arr.length; i++){
            int minPos =i;
            for(int j = i+1; j<arr.length; j++){
                if(minPos < arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void displayArray(int[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args){

        int arr[] = {5, 4, 1, 3, 2};
        selectionSortForAscending(arr);
        displayArray(arr);
        System.out.println("");
        selectionSortForDescending(arr);
        displayArray(arr);

    

    }
    
}
