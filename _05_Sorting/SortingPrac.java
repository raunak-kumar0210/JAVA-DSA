package _05_Sorting;

import java.util.*;
public class  SortingPrac
{

    // Bubble sort


    public static void BubbbleSort(int arr[])
    {
        int n = arr.length;
        for(int i = 0; i < n-1 ;i ++ )
        {
            for (int j = 0; j< n-1-i ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


      // Selection Sort

    public static void SelectionSort(int arr[])
    {
        int minpos = Integer.MIN_VALUE;

        for(int i =0; i<arr.length-1 ; i++)
        {
            minpos =i;
            for(int j= i+1; j<arr.length ; j++)
            {
                if(arr[minpos]>arr[j])
                {
                    minpos=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
    }


    // Insertion Sort

    public static void InsertionSort(int arr[])
    {
        for(int i = 1; i<arr.length ; i++)
        {
            int curr = arr[i];
            int prev = i-1;
            // Finding the currect position to insert
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev +1] = arr[prev];
                prev--;
            }
            // Insertion
            arr[prev + 1] = curr;

        }
    }

    //Inbuilt Sort

    public static void InbuiltSort(Integer arr[])
    {
        //Arrays.sort(arr);
        //Arrays.sort(arr,1,4);
        //Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,4,Collections.reverseOrder());
    }


    // Counting sort

    public static void CountingSort(int arr[])
    {
        int largest = Integer.MIN_VALUE;

        // finding largest number for creating count[] 
        for(int i =0 ; i<arr.length ; i++)
        {
            largest = Math.max(largest,arr[i]);
        }

        // for creating array count with frequency of elements in arr
        int count[] = new int [largest+1];
        for(int i= 0; i<arr.length ; i++)
        {
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i =0; i<count.length; i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void display(int arr[])
    {
        for(int i=0 ; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    


    // In descending order(ass ques)


    // Bubbble Sort(des)

    public static void bsd(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j = 0; j<arr.length-1-i; j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

     // Selection Sort (des)

     public static void SSd(int arr[])
    {
        int Maxpos = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            Maxpos = i;
            for(int j=i+1; j<arr.length ; j++)
            {
                if(arr[Maxpos]<arr[j])
                {
                    Maxpos = j;
                }
            }            
            int temp =arr[i];
            arr[i]=arr[Maxpos];
            arr[Maxpos]=temp;
        }
    }

    // Insertion Sort(des)

    public static void Insd(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev]<curr)
            {
                arr[prev+1] =arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    // Counting sort(des)

    public static void CsD(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(max,arr[i]);
        }

        int count[] = new int [max +1];
        for(int i=0;i<count.length;i++)
        {
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1;i>=0;i--)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String []args)
    {

        /*Reverse order function only works on objects 
        and int is a basic primitive datatype thats why we need to use 
        Integer is a object type variable which makes object of the array
        */
        //Integer arr[] = {5,4,1,3,2};

        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        CsD(arr);
        display(arr);
    }
}