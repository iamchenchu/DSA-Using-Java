/* Loops : For repeated tasks we use this concept called loops to reduce the length of the code
 * There are 3 types of loops available in java
 * 1. while loop
 *  whiel(condition){
 *  // Our Code
 *  }
 * 2. for loop
 * 
 * 3. do while loop
*/

public class ALoopsBasics {

    public static void main(String[] args){
        int counter = 0;
        while(counter < 10){
            System.out.println("Hello world!");
            counter++;
        }
        System.out.println("Printed the Hello world 10 times ");
    }
    
}
