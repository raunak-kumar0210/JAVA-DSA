package _09_Recursion;

public class _03_Factorial {
 
    public static int Factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }

        int fnm1 = Factorial(n-1);
        int fn = n*fnm1;
        return fn;
    }

    public static void main(String[]args)
    {
    
        System.out.println(Factorial(4));
        
    }
}
