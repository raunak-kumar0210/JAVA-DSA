package _04_Arrays;
// import java.util.*;

public class Arraypractice {

       // Linear Search


//     public static int linearsearh(int arr[], int  key)
//     {
//         for (int i = 0; i<arr.length; i++)
//         {
//             if(key == arr[i])
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int arr[]  = new int [5];
//         System.out.println("Enter Aray: ");
//         for (int i = 0; i <5; i++)
//         {
//             arr[i] = sc.nextInt();
//         } 
//         System.out.println("Enter number to be searched: ");
//         int key = sc.nextInt();

//         int index = linearsearh(arr, key);
//         if (index == -1)
//         {
//             System.out.println("Number not found: ");
//         }
//         else
//         {
//             System.out.println("Number found at " +  index);
//         }
//         sc.close();
//     }
// }


       // Binary search


//     public static int Binarysearch(int arr[], int key)
//     {
//         int start =0 ;int end = arr.length - 1;
//         while (start <= end)
//         {
//             int mid =(start + end) / 2;
//             if (arr[mid] == key)
//             {
//                 return mid;
//             }
//             if (arr[mid] < key)
//             {
//                 start = mid + 1;
//             }
//             if (arr[mid] > key)
//             {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args)
//     {
//         int arr[] = {1,2,3,4,5,6,7};
//         int key = 4;
//         int index = Binarysearch(arr, key);
//         System.out.println("Number found at " + index);

//     }
// }


        // Pairs Of Arrays


//     public static void pairsOfArrays(int arr[])
//     {
//         for(int i = 0; i < arr.length; i++)
//         {
//             for(int j = i+1; j < arr.length; j++)
//             {
//                 System.out.print("(" + arr[i] + "," + arr[j] + ")");
//             }
//             System.out.println(" ");
//         }
//     }
//     public static void main(String[] args)
//     {
//         int arr[] = {1,2,3,4,5,6,7};
//         pairsOfArrays(arr);
//     }
// }


        // Subarray


    // public static void Subarray(int arr[])
    // {
    //     int tp =0;
    //     for(int i = 0; i < arr.length; i++)
    //     {
    //         int start = i;
    //         for(int j = i; j < arr.length; j++)
    //         {
    //             int end = j;
    //             for(int k = start; k <= end; k++)
    //             {
    //                 System.out.print(arr[k] + " " );
    //             }
    //             tp++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total number of pairs = " + tp);
    // }
    // public static void main(String[] args)
    //     {
    //         int arr[] = {1,2,3,4,5,6,7};
    //         Subarray(arr);
    //     }
    // }


        // Subarray Sum (Brute force method)


    // public static void SubarraySum(int arr[])
    // {
    //     int tp =0;
    //     int currSum = 0;
    //     int MaxSum = Integer.MIN_VALUE;
    //     for(int i = 0; i < arr.length; i++)
    //     {
    //         int start = i;
    //         for(int j = i; j < arr.length; j++)
    //         {
    //             int end = j;
    //             currSum = 0;
    //             for(int k = start; k <= end; k++)
    //             {
    //                 currSum = currSum + arr[k];
    //             }
    //             tp++;
    //             System.out.println("curSum = " + currSum);
    //             if (currSum > MaxSum)
    //             {
    //                 MaxSum = currSum;
    //             }
    //         }
    //     }
    //     System.out.println("Total number of pairs = " + tp); 
    //     System.out.println("Maximum Sum = " + MaxSum); 
    // }
    // public static void main(String[] args)
    //     {
    //         int arr[] = {1,-2,6,-1,3};
    //         SubarraySum(arr);
    //     }
    // }


            // Sum of Subarray( Prefix Array mathod)


    // public static void PrefixArray(int[] arr)
    // {
    //     int currSum = 0;
    //     int MaxSum = Integer.MIN_VALUE;

    //     int prefix[] = new int[arr.length];
    //     prefix[0] = arr[0];
    //     for(int i = 1; i < arr.length; i++)
    //     {
    //         prefix[i] = prefix[i-1] + arr[i];            
    //     }

    //     for(int i = 0; i < arr.length; i++)
    //     {
    //         int start = i;
    //         for(int j = 0; j < arr.length; j++)
    //         {
    //             int end = j;
    //             if (start == 0)
    //             {
    //                 currSum = prefix[end];
    //             }
    //             else{
    //                 currSum = prefix[end] - prefix[start - 1];                
    //             }
    //             if (currSum > MaxSum)
    //             {
    //                 MaxSum = currSum;
    //             }
    //         }
    //     }
    //     System.out.println("MaxSum: " + MaxSum);
    // }
    // public static void main(String[] args)
    // {
    //     int arr[] = {1,-2,6,-1,3};
    //     PrefixArray(arr);
    // }
    

            // Sum of Subarray( Kadanes Method)


    // public static void KadanesMethod(int arr[])
    // {
    //     int currrSum = 0;
    //     int MaxSum = Integer.MIN_VALUE;

    //     for(int i = 0; i < arr.length; i++)
    //     {
    //         currrSum += arr[i];
    //         if (currrSum < 0)
    //         {
    //             currrSum = 0;
    //         }
    //         MaxSum = Math.max(MaxSum, currrSum);
    //     }
    //     System.out.println("MaxSum: " + MaxSum);
    // }
    // public static void main(String[] args)
    // {
    //     int arr[] = {1,-2,6,-1,3};
    //     KadanesMethod(arr);
    // }


            // Trapping RainWater


        public static void TrappingRainWater(int arr[], int width)
        {
            int n = arr.length;
            int trappedwater = 0;

            // left max

            int leftmax[] = new int [n];
            leftmax[0] = arr[0];
            for(int i=1; i<n; i++)
            {
                leftmax[i] = Math.max(leftmax[i-1], arr[i]);
            }

            // right max
            int rightmax[] = new int [n];
            rightmax[n-1] = arr[n-1];
            for(int i= n-2; i>=0; i--)
            {
                rightmax[i] = Math.max(rightmax[i+1], arr[i]);
            }

            for( int i = 0 ; i<n; i++)
            {
                int waterlevel = Math.min(leftmax[i], rightmax[i]);
                trappedwater += (waterlevel - arr[i]) * width;
            }
            System.out.println("Trapped water = " + trappedwater);
        }
        public static void main(String[] args)
        {
            int width = 1;
            int arr[] = {4,2,0,6,3,2,5};
            TrappingRainWater(arr,width);
        }
}





