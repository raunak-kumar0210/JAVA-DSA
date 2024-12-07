package _09_Recursion;

public class _11_TillingProblem {
    
    public static int Tiling(int n)  // Bcoz height is alredy given we only need to take width(2xn) 
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        // vertical
        int fnm1 = Tiling(n-1);

        // Horizontal
        int fnm2 = Tiling(n-2);

        int TotalTiles = fnm1 + fnm2;

        return TotalTiles;
    }

    public static void main(String[]args)
    {
        System.out.println(Tiling(3));

    }
}
