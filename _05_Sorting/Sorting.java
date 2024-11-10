
package _05_Sorting
;
  // Bubble sort in Asending order


public class Sorting {
    public static void bubblesortAes(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = 0; j<arr.length -1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array After Sorting : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    } 


   // Bubble Sort in Descending order


    public static void bubblesortDes(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = 0; j<arr.length -1-i; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array After Sorting : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }


      // Selction sort Aesending order

      public static void SelectionsortAes(int arr[])
    {
        
        for (int i = 0; i < arr.length-1; i++)
        {
            int minpos = i;
            for (int j = i+1; j<arr.length ; j++)
            {
                if(arr[minpos] > arr[j])
                {
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array After Sorting : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }


       //  INsertion sort Ascending order


    public static void InsertionSortAsce(int arr[])
    {
        
        for(int i = 1; i<arr.length; i++)
        {
            int curr = arr[i];
            int prev = i-1;
            // finding out currect pos to insert
            while(prev >=0 && arr[prev] > curr)
            {
                arr[prev+1] = arr[prev];
                prev --;
            }
            // Insertion
            arr[prev+1] = curr;
        }
        System.out.println("Array after sorting : " );
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }   
    public static void main(String[] args)
    {
        int arr[] = {4,5,1,3,2,6};
        InsertionSortAsce(arr);
    }  
}