package _10_DivideConquer;

public class MergeSort 
{
    public static void Display(int arr[])
    {
        for(int i=0 ; i<arr.length ;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }    

    public static void Divide(int arr[], int si, int ei )
    {
        if(si >= ei)
        {
            return;
        }
        int mid = (si + ei)/2;
        Divide(arr, si ,mid );
        Divide(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei)
    {
        int temp[] = new int [ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp
        
        while(i<=mid && j<=ei)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
             }
             k++;
        }

        // for left part
        while(i<=mid)
        {
            temp[k++] = arr[i++];
        }

        // for right part
        while(j<=ei)
        {
            temp[k++] = arr[j++];
        }

        // copy to original array
        for( k=0 , i=si ; k < temp.length ; k++, i++ )
        {
            arr[i] = temp[k];
        }
    }
    public static void main(String[]args)
    {
        int arr[] = new int [] {6,3,9,2,5,8};
        Divide(arr, 0, arr.length-1);
        Display(arr);
    }
}
