// BREAK : this statement will be used to exit any of the condition or loop
// CONTINUE : 

public class JBreakStatement {

    public static void main(String[] args){

        for(int i=0; i<10; i++){
            if(i==5){
                System.out.print("Reached the break statement so exting the loop");
                break;
            }
            System.out.println("Hello World!!");
        }

    }
    
}
