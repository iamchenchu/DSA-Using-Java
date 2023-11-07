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
