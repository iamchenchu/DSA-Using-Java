import java.util.Scanner;

public class CInvertedHalfPyramid {

    public static void invertedHalfPyramid(int n){
        
        for(int i=1; i<=n; i++){
            int num = 1;
            for (int j=n; j>=i; j--){ 
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void invertedHlfpyramid2(int n){
        for(int i=1; i<=n; i++){
            int num =1;
            for(int j=1; j<=n-i+1;j++){
                System.out.print(j +" ");
               // num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the levels : ");
        int n = sc.nextInt();
        invertedHalfPyramid(n);
        invertedHlfpyramid2(n);

    }
    
}
