// Question 2: In a program, input the side of a square. You have to output the area of the square. (Hint : area of a square is (side x side))

import java.util.Scanner;

public class MExercise2 {

    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Please enter the side of a square :");
        int side = sc.nextInt();

        System.out.println("The area of the given square is : "+(side*side));

    }
    
}
