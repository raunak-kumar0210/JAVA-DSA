package _08_Bit_Manipulation;

public class BitAssQues 
{
    public static void main(String[]args)
    {
        int a=2; int b=4;
        System.out.println("Before swap " + "a = " + a + " and " + "b = " + b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swap " + "a = " + a + " and " + "b = " + b);

        int x=3;
        System.out.println( x + "+" + 1 + " = " + -~x);

        // Convert uppercase character to lowercase
        for(char ch='A';ch<='Z';ch++) 
        
        {
            System.out.print((char)(ch|' '));
            // prints abcdefghijklmnopqrstuvwxyz}}}   
        }
    }
}
