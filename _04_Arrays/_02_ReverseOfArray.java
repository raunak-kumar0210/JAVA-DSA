package _04_Arrays;

import java.util.*;

public class _02_ReverseOfArray {
    public static void ReverseArray(int arr[])
    {
        int start = 0;
        int last = arr.length - 1;
        while(start < last)
        {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;

            start++;
            last--;
        }
        System.out.print("Reverse Array : ");
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+ " ");        
        }
        System.out.println();        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.print("Enter  array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        ReverseArray(arr);
        sc.close();
    }
}
