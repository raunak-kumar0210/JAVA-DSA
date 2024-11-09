package _04_Arrays;

// Max Sum of SubArray  - Bruteforce Method

import java.util.*;

public class _09_MaxSubarray_Sum_Bruteforce {
    public static void MaxSum(int[] arr)
    {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++)
        {
            int start = i;
            for (int j = 0; j<arr.length; j++)
            {
                int end = j;
                currSum = 0;
                for (int k=start; k<end; k++)
                {
                    currSum = currSum + arr[k];
                }
                if (MaxSum < currSum)
                {
                    MaxSum = currSum;
                }   
            }  
        }
        System.out.println("Max Subarray Sum : " + MaxSum);
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
        MaxSum(arr);

        sc.close();
    }  
}