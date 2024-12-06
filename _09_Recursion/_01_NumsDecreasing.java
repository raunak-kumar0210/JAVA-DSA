package _09_Recursion;

public class _01_NumsDecreasing {
    
    public static void NumbersDec(int n)
    {
        if(n==1)
        {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        NumbersDec(n-1);
    }

    public static void main(String[]args)
    {
        NumbersDec(5);
        
    }
}
