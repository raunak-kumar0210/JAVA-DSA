package _09_Recursion;

public class Recursion1 
{

    //Numbers in decresing order

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

    // Numbers in Incresing order

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

    //Factorial of a number

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

    // Sum of n Natural Numbers

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

    // nth Fibonacci series

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

    // Check Array is sorted or not

    public static boolean IsSorted(int arr[] , int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }
        if(arr[i] > arr[i+1])
        {
            return false;
        }
        
        return IsSorted(arr , i+1);
        
    }

    // First Occurence

    public static int FirstOccurence(int arr[], int key, int i )
    {
        if(i == arr.length )
        {
            return -1;
        }
        
        if(arr[i] == key)
        {
            return i;
        }
        return FirstOccurence(arr, key , i+1);
    }

    // Last Occurence

    public static int LastOccurence(int arr[], int key, int i )
    {
        if(i == arr.length )
        {
            return -1;
        }
        
        if(arr[i] == key)
        {
            return i;
        }
        return LastOccurence(arr, key , i-1);
    }

    // Power 

    public static int Power(int base, int exponent)
    {
        
        if(exponent == 0)
        {
            return 1;
        }
        return base * Power(base, exponent - 1);
    }


    // Optimized Power

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
        NumbersDec(5);
        NumbersInc(5);
        System.out.println(Factorial(4));
        System.out.println(Sum(4));
        System.out.println(Fibonacci(25));

        int arr[] = new int[] {1,2,3,2,4,5};
        System.out.println(IsSorted(arr, 0));

        System.out.println(FirstOccurence(arr, 2, 0));

        System.out.println(LastOccurence(arr, 2, arr.length-1));

        System.out.println(Power(2, 10));
        System.out.println(OptimizedPower(2, 10));
    }
    
}
