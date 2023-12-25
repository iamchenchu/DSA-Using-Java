//Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.Scanner;

public class MExercise3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of pencil :");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of pen :");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of eraser :");
        float eraser = sc.nextFloat();

        System.out.print("Your bill is :"+(pencil + pen + eraser));

    }
    
}
