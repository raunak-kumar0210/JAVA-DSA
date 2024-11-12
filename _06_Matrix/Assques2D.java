package _06_Matrix;

public class Assques2D 
{
    public static void q1(int matrix[][])
    {
        int count=0;
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==7)
                {
                    count++;
                }
            }
        }
        System.out.print("The number of times 7 is present = " + count);
    }


    public static void q2(int matrix[][])
    {
        int sum = 0;
        int row = 1;
        for(int i=0; i<matrix[0].length; i++)
        {
            sum = sum+matrix[row][i];
        }
        System.out.print("sum of elements of 2nd row = " + sum);
    }

    public static void q3(int matrix[][])
    {
        int transpose[][] = new int[matrix[0].length][matrix.length]; 
        
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                transpose[j][i] = matrix[i][j];
                
            }
            
        }
        System.out.println("after transpose");
        for(int i=0; i<matrix[0].length; i++)
        {
            for(int j=0; j<matrix.length; j++)
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args)
    {
        int matrix[][] = { {4,7,8},
                           {8,8,7} };
        
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        q3(matrix);
    }
    
}
