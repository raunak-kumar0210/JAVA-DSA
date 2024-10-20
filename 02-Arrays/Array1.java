package Arrays;
import java.util.*;
public class Array1
{
//     public static int LinearSearch(int n,int arr[])
//     {
//         for(int i = 0; i < arr.length-1; i++)
//         {
//             if(arr[i]==n)
//             {
//                return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[5];
//         System.out.print("Enter array: ");
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enetr number to be searched: ");
//         int n=sc.nextInt();
//         int index= LinearSearch(n,arr);
//         if(index==-1)
//         {
//             System.out.print("Number not Found ");
//          
//         }
//         else
//         {
//             System.out.print("Number found at index position : " + index);
//         }
//     }
// }


  // Largest and smallest in array


//     public static void Largest(int arr[])
//     {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0; i<arr.length; i++)
//         {
//             if (arr[i] >largest)
//             {
//                 largest = arr[i];
//             }
//             if (arr[i] < smallest)
//             {
//                 smallest = arr[i];
//             }
//         }
//         System.out.println("Largest number in array : " + largest);
//         System.out.println("Smallest number in array : " + smallest);
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[5];
//         System.out.print("Enter array: ");
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         Largest(arr);
//     }
// }



  // Binary Search


    // public static int BinarySearch(int n, int arr[])
    // {
    //     int start =0;
    //     int end = arr.length - 1;
    //     while(start <= end)
    //     {
    //         int mid = (start + end)/2;
    //         if (arr[mid]==n)
    //         {
    //             return mid;
    //         }
    //         if (arr[mid]< n)
    //         {
    //             start = mid+1;
    //         }
    //         else 
    //         {
    //             end = mid-1;
    //         }
    //     }return -1;
    // }
    // public static void main(String[] args)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int arr[] = new int[5];
    //     System.out.print("Enter Sorted  array: ");
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.print("Enter number to be searched: ");
    //     int n=sc.nextInt();
    //     int index= BinarySearch(n,arr);
    //     if(index ==-1)
    //     {
    //         System.out.print("Number not Found ");
    //     }
    //     else
    //     {
    //         System.out.print("Number found at index position : " + index);
    //     }
    // }


    // Reverse Array


    // public static void ReverseArray(int arr[])
    // {
    //     int start = 0;
    //     int last = arr.length - 1;
    //     while(start < last)
    //     {
    //         int temp = arr[start];
    //         arr[start] = arr[last];
    //         arr[last] = temp;

    //         start++;
    //         last--;
    //     }
    //     System.out.print("Reverse Array : ");
    //     for(int i=0 ; i<arr.length ; i++)
    //     {
    //         System.out.print(arr[i]+ " ");        
    //     }
    //     System.out.println();        
    // }
    // public static void main(String[] args)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int arr[] = new int[6];
    //     System.out.print("Enter  array : ");
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     ReverseArray(arr);
    // }


    // Pairs in Array


    // public static void pairsOfArrays(int arr[])
    // {
    //     int tp = 0;
    //     for (int i=0 ; i<arr.length ; i++)
    //     {
    //         for(int j = i+1 ; j<arr.length ; j++)
    //         {
    //             System.out.print("(" + arr[i] + "," + arr[j] + ")");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total number of Pairs = " + tp);
    // }
    //     public static void main(String[] args)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int arr[] = new int[6];
    //     System.out.print("Enter  array : ");
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     pairsOfArrays(arr);
    // }


    // Sub Arrays


    // public static void SubArrays(int arr[])
    // {
    //     int tp = 0;
    //     for (int i=0 ; i<arr.length ; i++)
    //     {
    //         int start=i;
    //         for(int j = i ; j<arr.length ; j++)
    //         {
    //             int end =j;
    //             for(int k = start ; k<=end ; k++)
    //             {
    //                 System.out.print(arr[k] + " ");
    //                 
    //             }
    //             tp++;
    //             System.out.println();                      
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total number of Pairs = " + tp);
    // }
    //     public static void main(String[] args)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int arr[] = new int[5];
    //     System.out.print("Enter  array : ");
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     SubArrays(arr);

    //     sc.close();
    // }


    //  Subarray Sum


    // public static void SumofSubarray(int arr[])
    // {

    //     int tp = 0;
    //     int sum = 0;
    //     for (int i = 0; i< arr.length; i++)
    //     {
    //         int start = i;
    //         for (int j = i; j< arr.length; j++)             
    //         {
    //             int end = j;
    //             for (int k = start; k <= end;k ++)
    //             {
                    
    //                 System.out.print(arr[k] +  " ");
    //                 sum = sum +(arr[k]);
    //             }
    //             tp++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Sum of Subarrays : " + sum);
    //     System.out.print("Total number of subarrays = " + tp);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int arr[] = new int[5];
    //     System.out.print("Enter Array : ");
    //     for (int i = 0; i < arr.length; i++) 
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     SumofSubarray(arr);

    //     sc.close();
    // }
    
    
    // Max Sum of SubArray  - Bruteforce Method


//     public static void MaxSum(int[] arr)
//     {
//         int currSum = 0;
//         int MaxSum = Integer.MIN_VALUE;
//         for (int i = 0; i<arr.length; i++)
//         {
//             int start = i;
//             for (int j = 0; j<arr.length; j++)
//             {
//                 int end = j;
//                 currSum = 0;
//                 for (int k=start; k<end; k++)
//                 {
//                     currSum = currSum + arr[k];
//                 }
//                 System.out.println("currSum: " + currSum);
//                 if (MaxSum < currSum)
//                 {
//                     MaxSum = currSum;
//                 }   
//             }  
//         }
//         System.out.println("Max Subarray Sum : " + MaxSum);
//     }
//     public static void main(String[] args) 
//     {

//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[5];
//         System.out.print("Enter Array : ");
//         for (int i = 0; i<arr.length; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         MaxSum(arr);

//         sc.close();
//     }  

// }


// Max Sum Of Subarray - Prefix Sum


    // public static void MaxSum(int arr[])
    // {
    //     int currrSum = 0;
    //     int MaxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[arr.length];
        
    //     // Calculate prefix Array

    //     //while using Preifx Sum Method we need to calculate sum of an array from an index to all all the elements present before it 

    //     prefix[0] = arr[0];
    //     for (int i = 1; i < arr.length; i++)
    //     {
    //         prefix[i] = prefix[i-1] + arr[i];
    //     }
    //     for (int  i = 0; i<arr.length ; i++)
    //     {
    //         int start = i;
    //         for (int j=0; j<arr.length ; j++)
    //         {
    //             int end = j;
    //             if (start == 0)
    //             {
    //                 currrSum = prefix[end];
    //             }
    //             else
    //             {
    //                 currrSum = prefix[end] - prefix[start-1] ; // to find the largest value ( I guess :) )
    //             }
    //             if (MaxSum < currrSum)
    //             {
    //                 MaxSum = currrSum;

    //             }
    //         }
    //     }
    // System.out.println("Max Sum  = " + MaxSum);
    // }
    // public static void main(String[] args) 
    // {

    //     Scanner sc = new Scanner(System.in);
    //     int arr[] = new int[5];
    //     System.out.print("Enter Array : ");
    //     for (int i = 0; i<arr.length; i++)
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     MaxSum(arr);

    //     sc.close();
    // }  


    // Max Sum By Kadane's algorithm (IMP)


    public static void KadaneAlgo(int arr[])
    {
        int currrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++)
        {
            currrSum = currrSum + arr[i];
            if (currrSum < 0)
            {
                currrSum = 0;
            }
            if (currrSum > MaxSum)
            {
                MaxSum = currrSum;
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
        KadaneAlgo(arr);

        sc.close();
    } 
}