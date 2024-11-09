package _04_Arrays;

import java.util.*;

public class _01_largestAndSmallest {
    public static void Largest(int arr[])
        {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if (arr[i] >largest)
            {
                largest = arr[i];
            }
            if (arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println("Largest number in array : " + largest);
        System.out.println("Smallest number in array : " + smallest);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        Largest(arr);
        sc.close();
    }
}