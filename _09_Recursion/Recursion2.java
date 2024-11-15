package _09_Recursion;

public class Recursion2 
{
    // Tiling Problem
    
    public static int Tiling(int n)  // Bcoz height is alredy given we only need to take width(2xn) 
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        // vertical
        int fnm1 = Tiling(n-1);

        // Horizontal
        int fnm2 = Tiling(n-2);

        int TotalTiles = fnm1 + fnm2;

        return TotalTiles;
    }

    // Removing Duplicate Characters

    public static void removeDuplicate(String str, int index, StringBuilder newStr, boolean map[])
    {
        if(index == str.length() )
        {
            System.out.println(newStr);
            return ;
        }

        // kam
        char currChr = str.charAt(index);
        if(map[currChr - 'a'] == true )
        {
            // Duplicate
            removeDuplicate(str, index + 1, newStr, map);
        }
        else
        {
            // not duplicate

            map[currChr - 'a'] = true;
            removeDuplicate(str, index + 1, newStr.append(currChr), map);
        }

    }

    // Friends Pairing 

    public static int FriendsPairing(int n)
    {
        if (n == 1 || n==2)
        {
            return n;
        }
        //choice
        //single
        int fnm1 = FriendsPairing(n-1);

        // pairs
        int fnm2 = FriendsPairing(n-2);

        int pairways = (n-1) * fnm2;

        int TotalPairs = fnm1 + pairways;

        return TotalPairs;
    }

    //Binary String Problem

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
        System.out.println(Tiling(3));

        
        String str =  "appnacollege";
        // boolean map[] = new boolean[str.length()];
        // StringBuilder newStr = new StringBuilder() ;
        removeDuplicate(str, 0, new StringBuilder (""), new boolean [26]);
        System.out.println(FriendsPairing(3));
        BinaryStr(3, 0, "");

    }
}
