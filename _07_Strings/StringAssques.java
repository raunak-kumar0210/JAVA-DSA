package _07_Strings;

import java.util.*;
public class StringAssques 
{

    public static void countvowels(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
            {
                count++;
            }
        }
        System.out.println("the no. of vowels present = " + count);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        String st = new String("");
        System.out.println("Enter a string : ");
        st =  sc.nextLine();
        countvowels(st);

        String str = "ShradhaDidi";
        String str1 = "Apnacollege";
        String str2 = "ShradhaDidi";

        System.out.println(str.equals(str1) + " " + str.equals(str2));

        String str3 = "Apnacollege".replace("l","");
        System.out.println(str3);


        sc.close();
    }
    
}
