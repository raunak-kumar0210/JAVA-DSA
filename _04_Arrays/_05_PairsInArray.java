package _04_Arrays;

import java.util.*;

public class _05_PairsInArray {
    public static void pairsOfArrays(int arr[])
    {
        int tp = 0;
        for (int i=0 ; i<arr.length ; i++)
        {
            for(int j = i+1 ; j<arr.length ; j++)
            {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of Pairs = " + tp);
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
        pairsOfArrays(arr);
        sc.close();
    }
}
