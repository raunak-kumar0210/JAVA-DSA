package _04_Arrays;

import java.util.*;

public class _07_SubArray_Sum {
    public static void SumofSubarray(int arr[])
    {

        int tp = 0;
        int sum = 0;
        for (int i = 0; i< arr.length; i++)
        {
            int start = i;
            for (int j = i; j< arr.length; j++)             
            {
                int end = j;
                for (int k = start; k <= end;k ++)
                {
                    
                    System.out.print(arr[k] +  " ");
                    sum = sum +(arr[k]);
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Sum of Subarrays : " + sum);
        System.out.print("Total number of subarrays = " + tp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter Array : ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        SumofSubarray(arr);

        sc.close();
    }
}
