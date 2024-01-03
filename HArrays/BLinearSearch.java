// search that happens one by one 

public class BLinearSearch {

    public static boolean linearSearch(int num[], int key){
        for(int i=0;i<num.length; i++){
            if(num[i]==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){

        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key =100 ;
        System.out.println(linearSearch(numbers, key));
    }
    
}
