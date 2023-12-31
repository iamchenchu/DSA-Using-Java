/* Printing the star pattern
*
**
***
****
*****
*/

public class AStrarPattern {
    public static void main(String[] args){
        for(int i=1; i<=5; i++)
        {   // one line
            for(int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
