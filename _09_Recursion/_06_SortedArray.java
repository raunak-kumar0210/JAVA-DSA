package _09_Recursion;

public class _06_SortedArray {
    
    public static boolean IsSorted(int arr[] , int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }
        if(arr[i] > arr[i+1])
        {
            return false;
        }
        
        return IsSorted(arr , i+1);
    }
    public static void main(String[]args)
    {

        int arr[] = new int[] {1,2,3,2,4,5};
        System.out.println(IsSorted(arr, 0));

    }
}
