package _02_Function;
import java.util.*;
public class _07_Prime_UsingFunc
{
    // public static void prime(int num)
    // {
    //     if (num==2)
    //     {
    //         System.out.println(num + " is a Prime number");
    //     }
    //     else
    //     {
    //         boolean isprime = true;
    //         for (int i = 2 ; i <= Math.sqrt(num); i++)
    //         {
    //             if(num%i==0){
    //                 isprime = false;
    //             }
    //         }
    //         if (isprime==false)
    //         {
    //             System.out.println(num + " is not a Prime number");
    //         }
    //         else{
    //             System.out.println(num + " is a Prime number");
    //         }
    //     }
    // }
    // public static void main(String[] args)
    // {
    //     prime(3);
    // }


    // by returning value and also reducing number of lines of code


    public static boolean isprime(int num)
    {
        if (num==2)  // do not include this part when the question asks to find out prime numbers within a range of numbers
        {
            System.out.println(num + " is a Prime number");
        }
        else
        {
            for (int i = 2 ; i <= Math.sqrt(num); i++)
            {
                if(num%i==0){
                    return false;
                }   
            }
        }
        return true;
    }
    // public static void main(String[] args)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number : ");
    //     int num = sc.nextInt();
    //     System.out.println(prime(num));
        
    // }


    // prime in range


    public static void primeInRange(int range)
    {   
        for (int i=2 ; i <= range ; i++)
        {
            if(isprime(i)){
                System.out.println(i + "  ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int range = sc.nextInt();
        primeInRange(range);

        sc.close();
    }
}