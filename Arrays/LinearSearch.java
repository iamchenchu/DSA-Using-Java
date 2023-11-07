public class LinearSearch {

    public static int findkey(int marks[], int key)
    {
        for(int i=1; i<marks.length;i++)
        {
            if(marks[i]==key)
            {
                return i;
            }  
        }
        return -1;
    }

    public static void main(String[] args){

        int marks[] = {3,4,2,62,76,9,4};
        int k = 9;
        findkey(marks, k);

        int index = System.out.print("the element is found at "+  );





    }
    
}
