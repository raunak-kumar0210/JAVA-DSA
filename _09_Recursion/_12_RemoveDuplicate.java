package _09_Recursion;

public class _12_RemoveDuplicate {
    
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

    public static void main(String[]args)
    {
        
        String str =  "appnacollege";
        removeDuplicate(str, 0, new StringBuilder (""), new boolean [26]);

    }
}
