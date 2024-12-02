package _07_Strings;

public class _04_UpperCase {

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

    public static void main(String[]args)
    {
        String str1 = "i am raunak";

        uppercase(str1);

    }
}
