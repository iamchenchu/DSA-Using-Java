public class BinarySearch {

    public static int binarySearch(int marks[], int key)
    {
        int start = marks[0];
        int end = marks.length-1;
        

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(marks[mid]==key)
            {
                return mid;
            }
            if(marks[mid]<key)
            {
                marks[start]=marks[mid]+1;
            }else{
                marks[end]=marks[mid]-1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int marks[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("The element found at : "+binarySearch(marks, key));

    }
    
}
