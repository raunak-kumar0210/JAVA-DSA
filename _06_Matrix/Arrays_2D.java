package _06_Matrix;
import java.util.*;
public class Arrays_2D 
{   

    // creating a Simple 2d array and printing it 


    // public static void main(String[]args)
    // {
    //     Scanner sc = new Scanner(System.in);

    //     int matrix[][] = new int[3][3];
    //     System.out.print("Enter elements of matrix: ");
    //     for(int i=0; i<3; i++)
    //     {
    //         for(int j=0; j<3; j++)
    //         {
    //             matrix[i][j]=sc.nextInt();
    //         }
    //     }
    //     for(int i=0; i<3; i++)
    //     {
    //         for(int j=0; j<3; j++)
    //         {
    //         System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    //     sc.close();
    // } 

    

    // Search an element in a 2d array


    public static boolean matrix(int matrix[][],int key)
    {
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(matrix[i][j] == key)
                {
                    System.out.println("Element found at" + "(" + i + "," + j + ")" );
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }

    public static void display(int matrix[][])
    {
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        System.out.print("Enter elements of matrix: ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the element to be searched :");
        int key = sc.nextInt();
        display(matrix);
        matrix(matrix,key);
        sc.close();
    }
}
