package _09_Recursion;

public class _13_FriendsPairing {
    
    public static int FriendsPairing(int n)
    {
        if (n == 1 || n==2)
        {
            return n;
        }
        //choice
        //single
        int fnm1 = FriendsPairing(n-1);

        // pairs
        int fnm2 = FriendsPairing(n-2);

        int pairways = (n-1) * fnm2;

        int TotalPairs = fnm1 + pairways;

        return TotalPairs;
    }
    public static void main(String[]args)
    {
        
        System.out.println(FriendsPairing(3));

    }
}
