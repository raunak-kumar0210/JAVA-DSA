package _04_Arrays;

import java.util.*;

public class _03_BinarySearch {
    public static int Binary_Search(int n, int arr[])
    {
        int start =0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if (arr[mid]==n)
            {
                return mid;
            }
            if (arr[mid]< n)
            {
                start = mid+1;
            }
            else 
            {
                end = mid-1;
            }
        }return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter Sorted  array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to be searched: ");
        int n=sc.nextInt();
        int index= Binary_Search(n,arr);
        if(index ==-1)
        {
            System.out.print("Number not Found ");
        }
        else
        {
            System.out.print("Number found at index position : " + index);
        }
        sc.close();
    }
}
