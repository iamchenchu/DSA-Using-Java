// Logical Operators : &&, ||, !
// && : Both statements should be true in order to be the the execution is to be true 
// || : At least one statement should be true in order to be the execution is to be true 
// ! : If the condition is false then it prints true 

public class DLogicalOperators {

    public static void main(String[] args){

        System.out.println((5>2) && (7<10)); // true coz both are true
        System.out.println((1>2 ) && (3<10)); // false coz one is false
        System.out.println((5>2) || (3<1));  // true coz at least one is true
        System.out.println(!(5>2));  // prints the false as it's negation of true 

    }
    
}
