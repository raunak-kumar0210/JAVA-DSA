package _09_Recursion;

public class _07_FirstOccurence {
    
    public static int FirstOccurence(int arr[], int key, int i )
    {
        if(i == arr.length )
        {
            return -1;
        }
        
        if(arr[i] == key)
        {
            return i;
        }
        return FirstOccurence(arr, key , i+1);
    }

    public static void main(String[]args)
    {

        int arr[] = new int[] {1,2,3,2,4,5};

        System.out.println(FirstOccurence(arr, 2, 0));

    }
}
