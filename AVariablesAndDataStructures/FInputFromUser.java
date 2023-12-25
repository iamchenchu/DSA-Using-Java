import java.util.Scanner;

public class FInputFromUser {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String name = sc.next(); // captures only one word until the next space
        System.out.println(name);

        String fullName = sc.nextLine(); // captures all the words until the nextline
        System.out.println(fullName);

        while (!sc.hasNextInt()) {
            System.out.println("That's not an integer. Please enter an integer:");
            sc.next(); // Consume the non-integer input
        }
        int number = sc.nextInt();
        System.out.println(number);

        

    }
    
}
