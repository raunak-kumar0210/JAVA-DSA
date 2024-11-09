package _04_Arrays;

import java.util.*;
    
    // Max Sum By Kadane's algorithm (IMP)

public class _11_MaxSubarray_Sum_Kadanes {

    public static void KadaneAlgo(int arr[])
    {
        int currrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++)
        {
            currrSum = currrSum + arr[i];
            if (currrSum < 0)
            {
                currrSum = 0;
            }
            if (currrSum > MaxSum)
            {
                MaxSum = currrSum;
            }
        }
        System.out.println("Max Sum  = " + MaxSum);
    }
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter Array : ");
        for (int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        KadaneAlgo(arr);

        sc.close();
    } 
}
