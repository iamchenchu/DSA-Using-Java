public class ShortPath {

    public static float getShortPath(String str)
    {
        int x =0, y =0;
        
        for(int i=0;i<str.length();i++)
        {
            char dir = str.charAt(i);
        
        //south  
        if(dir == 'N')
        {
            y--;
        }

        // North
        else if(dir == 'N')
        {
            y++;
        }
        //west
        else if(dir == 'W')
        {
            x--;
        }
        //east
        else{
            x++;
        }
    }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    
    }
    public static void main(String[] args)
    {
       
        String path = "WNEENESENNN";

        System.out.println(getShortPath(path));
    }

    
}
