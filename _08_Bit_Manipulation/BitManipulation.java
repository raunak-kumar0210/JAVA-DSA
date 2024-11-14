package _08_Bit_Manipulation;

public class BitManipulation 
{
    public static void EvenOrOdd(int n)
    {
        int bitmask = 1;
        if((n & bitmask) == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd numaber");
        }
    }

    public static int  GetIthBit(int n , int i)
    {
        int bitmask = 1<<i;
        if((n & bitmask) ==0 )
        {
            return 0;
        }
        else{
            return 1;
        }    
    }

    public static int  SetIthBit(int n , int i)
    {
        int bitmask = 1<<i;
            return n | bitmask;
    }
    
    public static int  ClearIthBit(int n , int i)
    {
        int bitmask = ~(1<<i);
            return n & bitmask;
    }

    public static int UpdateIthbit(int n, int i, int newbit)
    {
        if (newbit == 0)
        {
            return ClearIthBit(n,i);
        }
        else
        {
            return SetIthBit(n,i);
        }


        //     OR

        // int bitmask = ~(1<<i);
        // n=  n & bitmask;
        // int bitmask1 = newbit<<i;
        // return n | bitmask1;
    }

    public static int ClearlastIthBits(int n , int i)
    {
        int bitmask = (~0)<<i;
        return n & bitmask;

    }

    public static int ClearBitsInRange(int n , int i, int j)
    {
        int a= ~(0)<<j+1;
        int b= (1<<i)-i;
        int bitmask = a|b;
        return n& bitmask;
    }

    public static boolean powerOf2(int n)
    {
        if ((n & (n-1)) == 0)
        {
            return true;
        }
        return false;
        
    }

    public static int CountSetBits(int n)
    {
        int count =0;
        while(n>0)
        {
            
            if((n  & 1) != 0)
            {
                count ++;

            }
            n=n<<1;
        }
        
        return count;
    }

    public static int FastExpo(int b, int e)
    {
        int ans=1;
        while(e>0)
        {
            if((e & 1) !=0)
            {
                ans=ans*b;
            }
        b=b*b;
        e=e>>1;
        }
        return ans;
    }

    public static void main(String[]args)
    {
        EvenOrOdd(10);
        EvenOrOdd(3);
        EvenOrOdd(1);
        System.out.println(GetIthBit(10,3));
        System.out.println(SetIthBit(10,2));
        System.out.println(ClearIthBit(10,1));
        System.out.println(UpdateIthbit(10,2,1));
        System.out.println(ClearlastIthBits(15,2));
        System.out.println(ClearBitsInRange(10,2,4));
        System.out.println(powerOf2(4));
        System.out.println(CountSetBits(3));
        System.out.println(FastExpo(5,4));

    }
}
