package _04_Arrays;

import java.util.*;

public class _04_LinearSearch {
    public static int Linear_Search(int n,int arr[])
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i]==n)
            {
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter an array: ");
        for(int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number to be Searched : ");
        int n = sc.nextInt();

        int result = Linear_Search(n, arr);

        if(result == -1) {
            System.out.println("Number not found!");
        }
        else {
            System.out.println("Number found at index : " + result);
        }
        sc.close();
    }
}
