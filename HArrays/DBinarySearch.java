public class DBinarySearch {

    public static int birnarySearch(int[] numbers, int key){

        int start =0; 
        int end = numbers.length;
        while(start <= end){
            int mid = start + end-1;

            if(numbers[mid] == key){
                return mid;
            }else if(numbers[mid] < key) { // right
                start = mid + 1;
            }else{ // ledt
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 14;
        System.out.println(birnarySearch(numbers, key));

    }
    
}
