package _05_Sorting;

//using import to be able to use Arrays.sort
import java.util.*;

public class _05_Inbuilt_Sort {
    public static void main(String[] args) {

        /*
         * Reverse order function only works on objects
         * and int is a basic primitive datatype thats why we need to use
         * Integer is a object type variable which makes object of the array
         */

        Integer arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer arr1[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr1, 1, 4);
        System.out.println(Arrays.toString(arr1));

        Integer arr2[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));

        Integer arr3[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr3, 1, 3, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr3));

    }
}

    