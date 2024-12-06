package _09_Recursion;

public class _04_SumOfNatural {
    
    public static int Sum(int n)
    {
        if(n==1)
        {
            return 1;
        }

        int SumOfn = Sum(n-1);
        int sum = n + SumOfn;
        return sum;
    }

    public static void main(String[]args)
    {
        
        System.out.println(Sum(4));
        
    }
}
