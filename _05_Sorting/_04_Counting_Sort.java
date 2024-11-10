package _05_Sorting;

public class _04_Counting_Sort {
    public static void CountingSort(int arr[])
    {
        int largest = Integer.MIN_VALUE;

        // finding largest number for creating count[] array
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
        System.out.print("Array After Sorting : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String []args)
    {

        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        CountingSort(arr);
        
    }
}
