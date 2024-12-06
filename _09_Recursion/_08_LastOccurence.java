package _09_Recursion;

public class _08_LastOccurence {
    
    public static int LastOccurrence(int arr[], int key, int i) {
        
        if (i < 0) {
            return -1;
        }
    
        if (arr[i] == key) {
            return i;
        }
    
        return LastOccurrence(arr, key, i - 1);
    }
    public static void main(String[]args)
    {

        int arr[] = new int[] {1,2,3,2,4,5};

        System.out.println(LastOccurrence(arr, 2, arr.length-1));

    }
}
