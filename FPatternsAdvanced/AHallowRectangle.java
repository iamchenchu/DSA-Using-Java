import java.util.Scanner;
public class AHallowRectangle {
    public static void makeRectangle(int r, int c){
        // outer Loop
        for(int i=1; i<=r; i++){
            // Inner Loop
            for(int j=1; j<=c; j++){
                //cell - (i, j)
                if(i==1 || i==r || j==1 || j==c){
                    //Boundery cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Row Value : ");
        int r = sc.nextInt();
        System.out.print("Please enter the Col Value : ");
        int c = sc.nextInt();
        makeRectangle(r, c);

    }
}