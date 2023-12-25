public class SubArrays {

    public static void subarrays(int arra[]){

        int counter =0;

        for(int i=0;i<arra.length-1;i++)
        {
            for(int j=i+1;j<=arra.length-1;j++)
            {
                System.out.print("("+arra[i]+","+arra[j]+")");
                counter++;
            }
            System.out.println();
        }
        System.out.println("the numbver of pairs are : " + counter);
        
    }

    public static void main(String[] args)
    {
        int array[] = {1,2,3,4,5,6,7,8,9};

        subarrays(array);

        

    }
    
}
