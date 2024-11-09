package _04_Arrays;

// import java.util.*;

public class ArrayAssQues 
{

    //  Question 1


    // public static int Distinct(int arr[])
    // {
    //     int key = arr[0];
    //     for (int i = 1; i < arr.length; i++)
    //     {
    //         if (arr[i] == key)
    //         {
    //             return 1;
    //         }
    //         key ++;
    //     }
    //     return -1;
    // }
    // public static void main(String[] args)
    // {
    //     Scanner sc = new Scanner (System.in);
    //     int arr[] = new int [5];
    //     System.out.println("Enter array: ");
    //     for (int i = 0; i < arr.length; i++)
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     int res = Distinct(arr);
    //     if (res == 1)
    //     {
    //         System.out.println("True");
    //     }
    //     else
    //     {
    //         System.out.println("False");
    //     }
    //     sc.close();
    //     }


    //  Question 2 ( thoda casual tarika by me)


    // public static int Prices (int price[])
    // {
    //     int position = 0;
    //     int buyprice = price[0];
    //     int sellprice = Integer.MIN_VALUE;
    //     for (int i = 1; i < price.length; i++)
    //     {
    //         if (price[i] < buyprice)
    //         {
    //             buyprice = price[i];
    //             position = i;
    //         }
    //     }
    //     for(int j = position; j < price.length; j++)
    //     {
    //         if (price[j] > sellprice)
    //         {
    //             sellprice = price[j];
    //         }
    //     }
    //     if ((sellprice - buyprice) < 0)
    //     {
    //         return 0;
    //     }
    //     else
    //     {
    //         return sellprice - buyprice;
    //     }
    // } 
    // public static void main(String[] args)
    // {
    //     int price[] ={7,1,5,3,6,4};
    //     int profit = Prices(price);
    //     if(profit == 0)
    //     {
    //         System.out.println("Max profit = 0");
    //     }
    //     else
    //     {
    //         System.out.println("Max profit =" + profit);
    //     }
    // }
    // }


    // Profesnional Tarika


    // public static int Prices(int price[]) 
    //     {
    //         int buyprice = Integer.MIN_VALUE;
    //         int maxprofit = 0;
    //         for(int i = 1; i < price.length; i++)
    //         {
    //             if (price[i] < maxprofit)
    //             {
    //                 int profit = price[i] - buyprice;
    //                 maxprofit = Math.max(maxprofit,profit);
    //             }
    //             else{
    //                 buyprice = price[i];
    //             }
    //         }
    //         return maxprofit;
            
    //     }
    // public static void main(String[] args)
    // {
    //     int price[] ={7,1,5,3,6,4};
    //     int profit = Prices(price);
    //     if(profit == 0)
    //     {
    //         System.out.println("Max profit = 0");
    //     }
    //     else
    //     {
    //         System.out.println("Max profit =" + profit);
    //     }
    // }
    // }


    // Questin 4


    public static void tpw(int arr[])
    {
        int waterlevel = 0;
        int trappedwater = 0;
        int n = arr.length;
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for(int i =1; i<n ; i++)
        {
            leftmax[i] = Math.max(arr[i], leftmax[i-1]);
        }

        int rightmax[] = new int[n];
        rightmax[n-1] = arr[n-1];
        for(int i =n-2; i>=0 ; i--)
        {
            rightmax[i] = Math.max(arr[i],rightmax[i+1]);
        }
        for(int i =0 ; i<n ; i++)
        {
            waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedwater = trappedwater + (waterlevel - arr[i]);
        }
        System.out.println(" Total Trapped water =" + trappedwater);
    }
    public static void main(String[] args)
    {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        tpw(arr);
        
    }
}