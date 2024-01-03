public class CLargestNumber {

    public static int largestNum(int nums[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            largest = Math.max(largest, nums[i]);
        }
        return largest;
    }

    public static void main(String[] args){
        int[] numbers = {2, 4, 6, 33, 10, 12, 14, 16};
        System.out.println(largestNum(numbers));
    }
    
}
