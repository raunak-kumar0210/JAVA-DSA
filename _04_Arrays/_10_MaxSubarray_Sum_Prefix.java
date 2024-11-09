package _04_Arrays;

import java.util.*;

// Max Sum Of Subarray - Prefix Sum

public class _10_MaxSubarray_Sum_Prefix {
    public static void MaxSum(int arr[])
    {
        int currrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        
        // Calculate prefix Array

        //while using Preifx Sum Method we need to calculate sum of an array from an index to  all the elements present before it 

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int  i = 0; i<arr.length ; i++)
        {
            int start = i;
            for (int j=0; j<arr.length ; j++)
            {
                int end = j;
                if (start == 0)
                {
                    currrSum = prefix[end];
                }
                else
                {
                    currrSum = prefix[end] - prefix[start-1] ; // to find the largest value 
                }
                if (MaxSum < currrSum)
                {
                    MaxSum = currrSum;

                }
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
        MaxSum(arr);

        sc.close();
    }  
}
