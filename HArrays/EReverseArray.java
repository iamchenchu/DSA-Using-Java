public class EReverseArray {

    public static void reverseArray(int numbers[]){
        int first = 0; 
        int last = numbers.length-1;

        while(first < last ){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--; 
        }
    }

    public static void main(String[] args){
        int[] numbers = {2, 4, 6, 13, 15, 18, 20, 26}; 
        reverseArray(numbers);
        for(int i=1; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");  
        }
        System.out.println();
    }
    
}
