package _09_Recursion;

public class _14_BinaryString {
    
    public static void  BinaryStr(int n, int lastplace, String str)
    {
        // Base case
        // if(n==0)
        // {
        //     System.out.println(str);
        //     return;
        // }
        // if(lastplace == 0)
        // {
        //     BinaryStr((n-1),0,str+ "0");
        //     BinaryStr((n-1),1,str+ "1");
        // }
        // else
        // {
        //     BinaryStr((n-1), 0, str+ "0");
        // }

        //  OR

        //Base Case

        if(n == 0)
        {
            System.out.println(str);
            return ;
        }
        BinaryStr((n-1), 0, str + "0");
        if(lastplace == 0)
        {
            BinaryStr((n-1), 1, str + "1");
        }  
    }

    public static void main(String[]args)
    {
        
        BinaryStr(3, 0, "");

    }
}
