package _07_Strings;

public class _08_StringBasics {
    public static void main(String[]args)
    {
        String str = "Raunak";
        String str1 = new String("Kumar");

        int l = str.length();
        char ch = str.charAt(0);
        String str2 = str + " " + str1;
        String str4 = str.substring(1,2);

        System.out.println(l);
        System.out.println(ch);
        System.out.println(str2);
        System.out.println(str4);

        String str5 = "Apnacollege";
        String str6 = "ShradhaDidi";

        System.out.println(str.equals(str5) + " " + str.equals(str6));

        String str7 = "Apnacollege".replace("l","");
        System.out.println(str7);


        //stringbuilder

        StringBuilder sb = new StringBuilder("");

        for(char ch1='a';ch1<'z';ch1++)
        {
            sb.append(ch1);
        }
        System.out.println(sb);

    }
}
