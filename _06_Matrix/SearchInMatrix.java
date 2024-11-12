package _06_Matrix;

public class SearchInMatrix 
{
    public static boolean StaircaseSearch(int matrix[][] , int key)
    {
        int row =0;
        int col =matrix[0].length-1;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==key)
            {
                System.out.print("key found at: " + "(" + row + "," + col + ")");
                return true;
            }

            else if(matrix[row][col]>key)
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.print("Key not found.");
        return false;
    }

    //Taking the starting point from bottom left

    public static boolean StaircaseSearch1(int matrix[][] , int key)
    {
        int row =matrix.length-1;
        int col =0;
        while(row>=0 && col<matrix.length)
        {
            if(matrix[row][col]==key)
            {
                System.out.print("key found at: " + "(" + row + "," + col + ")");
                return true;
            }

            else if(matrix[row][col]>key)
            {
                row--;
            }
            else
            {
                col++;
            }
        }
        System.out.print("Key not found.");
        return false;
    }

    public static void main(String[]args)
    {
        int matrix[][] = {{10 ,20 ,30 ,40},
                          {15 ,25 ,35 ,45},
                          {27 ,29 ,37 ,48},
                          {32 ,33 ,39 ,50}};
        
        int key =33;
        StaircaseSearch1(matrix,key);
    }
    
}
