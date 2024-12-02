package _07_Strings;

public class _02_ShortestPath {

    public static double ShortestPath(String path)
    {
        int stpath;
        int x=0;
        int y=0;
        for(int i=0; i<path.length();i++)
        {
            char ch =path.charAt(i);

            if(ch=='n')
            {
                y++;
            }
            else if(ch=='s')
            {
                y--;
            }
            else if(ch=='e')
            {
                x++;
            }
            else if(ch=='w')
            {
                x--;
            }
        }
        x=x*x;
        y=y*y;
        stpath = (int)Math.sqrt(x+y);

        return stpath;

    }

    public static void main(String[]args)
    {
        String path = "wneenesennn";
        System.out.println(ShortestPath(path));
        
    }
}
