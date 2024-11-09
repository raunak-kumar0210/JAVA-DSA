package _04_Arrays;

import java.util.*;

public class _06_SubArrays {
    public static void Sub_Arrays(int arr[])
    {
        int tp = 0;
        for (int i=0 ; i<arr.length ; i++)
        {
            int start=i;
            for(int j = i ; j<arr.length ; j++)
            {
                int end =j;
                for(int k = start ; k<=end ; k++)
                {
                    System.out.print(arr[k] + " ");
                    
                }
                tp++;
                System.out.println();                      
            }
            System.out.println();
        }
        System.out.println("Total number of Pairs = " + tp);
    }
        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter  array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        Sub_Arrays(arr);

        sc.close();
    }
}
