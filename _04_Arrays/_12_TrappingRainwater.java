package _04_Arrays;

import java.util.*;

public class _12_TrappingRainwater {
    
    public static void rainWater(int arr[], int width)
    {
        int n = arr.length;
        
        int trappedwater = 0;
        
        int rightmax[] = new int [n];
        rightmax[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--)
        {
            rightmax[i] = Math.max(arr[i], rightmax[i+1]);
        }
        int leftmax[] = new int [n];
        leftmax[0] = arr[0];
        for(int i = 1; i< n; i++)
        {
            leftmax[i] = Math.max(arr[i], leftmax[i-1]);
        }
        
        for (int i = 0; i<n; i++)
        {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater +=  (waterlevel- arr[i]) * width;
        }
        System.out.println("Total trapped water level = " + trappedwater);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        System.out.print("Enter Array : ");
        for (int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Width of single pillar : ");
        int width = sc.nextInt();

        rainWater(arr,width);


        sc.close();
    }
}