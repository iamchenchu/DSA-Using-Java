import java.util.Scanner;

public class SearchingIn2D {


    public static void printArray(int matrix[][])
    {
        int m = matrix.length, n = matrix[0].length;
        for(int i=0; i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static boolean search(int matrix[][], int key){

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.print("the lement found at :"+ i +","+ j);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {

        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        int m = matrix.length, n= matrix[0].length;

        for(int i=0; i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]= sc.nextInt();
            }
        }

        printArray(matrix);
        search(matrix,5);




    }
    
}
