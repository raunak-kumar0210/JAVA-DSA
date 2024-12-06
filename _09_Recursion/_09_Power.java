package _09_Recursion;

public class _09_Power {
    
    public static int Power(int base, int exponent)
    {
        
        if(exponent == 0)
        {
            return 1;
        }
        return base * Power(base, exponent - 1);
    }
    public static void main(String[]args)
    {

        System.out.println(Power(2, 10));
        
    }
}
