package _07_Strings;

public class Strings 
{

    public static boolean pal(String str)
    {

        for(int i=0; i<str.length()/2; i++)
        {
            if(str.charAt(i) == str.charAt(str.length()-1-i))
            {
                return true;
            }
        }
        return false;
        
    }
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

    public static void largeststring(String str[])
    {
        
        String largest = str[0];
        
        for(int i=1;i<str.length;i++ )
        {
            if(largest.compareTo(str[i]) < 0)
            {
                largest = str[i];
            }
        }
        System.out.println(largest);
    }

    public static void uppercase(String str)
    {
        String str1 ="";
        str1=str1+ Character.toUpperCase(str.charAt(0));
        for(int i=1;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch ==' ' && i<str.length()-1)
            {
                str1 =str1+ch;
                i++;
                str1= str1+ Character.toUpperCase(str.charAt(i));
            }
            else
            {
                str1= str1+ch;
            }
        }
        System.out.println(str1);
    }

    public static void uppercasesb(String str)
    {
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch ==' ' && i<str.length()-1)
            {
                sb.append(Character.toUpperCase(ch));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static String Compress(String str)
    {
        String str1 = "";
        
        for(int i=0;i<str.length();i++)
        {
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            str1 = str1 + str.charAt(i);
            if(count>1)
            {
                str1=str1+count.toString();
            }
        }
        return str1;
    }
    public static void main(String[]args)
    {
        String str = "Raunak";
        String str1 = new String("Kumar");
        String str3 = new String("noon");
        String path = "wneenesennn";
        String fruits[] = {"mango","banana","apple"};
        String str5 = "i am raunak";
        String str6 = "aabbbccc";
        

        int l = str.length();
        char ch = str.charAt(0);
        String str2 = str + " " + str1;
        String str4 = str.substring(1,2);

        System.out.println(l);
        System.out.println(ch);
        System.out.println(str2);
        System.out.println(str4);
        System.out.println(pal(str3));

        System.out.println(ShortestPath(path));
        largeststring(fruits);

        //stringbuilder

        StringBuilder sb = new StringBuilder("");

        for(char ch1='a';ch1<'z';ch1++)
        {
            sb.append(ch1);
        }
        System.out.println(sb);

        uppercase(str5);
        uppercasesb(str5);

        System.out.println(Compress(str6));
    }
}