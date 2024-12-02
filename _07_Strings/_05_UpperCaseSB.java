package _07_Strings;

public class _05_UpperCaseSB {

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

    public static void main(String[]args)
    {

        String str1 = "i am raunak";

        uppercasesb(str1);

    }
}
