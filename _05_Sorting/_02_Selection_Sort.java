package _05_Sorting;

public class _02_Selection_Sort {
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
        System.out.print("Array After Sorting : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String []args)
    {

        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        SelectionSort(arr);
        
    }
}
