package _09_Recursion;

public class _10_OptimizedPower {
    
    public static int OptimizedPower(int x,int n )
    {
        if(n==0)
        {
            return 1;
        }

        // // 
        // int HalfPowerSq = OptimizedPower(x, n/2) * OptimizedPower(x, n/2);

        // Hmlog is trh se nhi kr rhe hai qki isme computation time jyada hoga
        //pr agr hmlog ek variable lekr krte hai to hmara computation time km lgta hai 


        int HalfPower = OptimizedPower(x, n/2);
        int HalfPowerSq = HalfPower * HalfPower;

        if(n%2!=0)
        {
            HalfPowerSq = x*HalfPowerSq;
        }
        return HalfPowerSq;
    }

    public static void main(String[]args)
    {
        
        System.out.println(OptimizedPower(2, 10));
    }
}
