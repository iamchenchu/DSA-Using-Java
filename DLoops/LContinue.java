// If we want to skip some specific conditions in a loop we may use this continue keyword

public class LContinue {

    public static void main(String[] args){
        for(int i=1; i<=10; i++){

            if(i==7){

                continue;
            }
            System.out.println(i);
        }
    }
    
}
