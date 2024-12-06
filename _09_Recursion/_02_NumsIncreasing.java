package _09_Recursion;

public class _02_NumsIncreasing {
 
    public static void NumbersInc(int n)
    {
        if(n==1)
        {
            System.out.print(n + " ");
            return ;
        }
        NumbersInc(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[]args)
    {
        NumbersInc(5);
        
    }
}
