package _09_Recursion;

public class _05_Fibonacci {
    
    public static int Fibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        
        int nm1 = Fibonacci(n-1);
        int nm2 = Fibonacci(n-2);
        int Sum =  nm1 + nm2;

        return Sum;
    }
    public static void main(String[]args)
    {
        
        System.out.println(Fibonacci(25));

    }
}
