public class RotatedSorted {

    public static int search(int[] arr, int tar,int si, int ei)
    {
        if(si>ei)
        {
            return -1;
        }

        // work
        int mid = si+(ei-si)/2;

        //case found in best case
        if(arr[mid]==tar)
        {
            return mid;
        }
        // case for line one 
        if(arr[si]<=arr[mid])
        {
            if(arr[si]<=tar&& tar <= arr[mid]){
                search(arr, tar, si, mid);
            } else{
                search(arr, tar, mid+1, ei);
            }
        }

        // case for l2
        else{

            if(arr[mid]<=tar && tar <=arr[ei])
            {
                return search(arr, tar, mid+1, ei);
            }else{
                return search(arr, tar, si, mid-1);
             }

        }
        
    }


    public static void main(String[] args)
    {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
    
}
