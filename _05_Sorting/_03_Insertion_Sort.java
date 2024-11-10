package _05_Sorting;

public class _03_Insertion_Sort {
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
        System.out.print("Array After Sorting : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String []args)
    {

        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        InsertionSort(arr);
        
    }
}
