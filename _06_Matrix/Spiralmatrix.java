package _06_Matrix;

public class Spiralmatrix 
{
    public static void sm(int matrix[][])
    {
        int startrow = 0;
        int endrow = matrix.length-1;
        int startcolm = 0;
        int endcolm = matrix[0].length-1;
        while(startrow<=endrow && startcolm <= endcolm)
        {
            for(int i=startcolm ; i<= endcolm; i++)
            {
                System.out.print(matrix[startrow][i] + " ");
            }

            for(int j=startrow + 1 ; j<= endrow; j++)
            {
                System.out.print(matrix[j][endcolm] + " ");
            }

            for(int i=endcolm-1 ; i>= startcolm; i--)
            {
                // not really sure 4 what so i'll comment it out 

                // if(startrow == endrow)
                // {
                //     break;
                // }
                System.out.print(matrix[endrow][i] + " ");
            }

            for(int j=endrow-1 ; j>= startrow+1; j--)
            {
                // if(startrow == endrow)
                // {
                //     break;
                // }
                System.out.print(matrix[j][startcolm] + " ");
            }

            startrow++;
            endrow--;
            startcolm++;
            endcolm--;
        }
    }

    
    public static void main(String[]args)
    {
        int matrix[][] = {{1 ,2 ,3 ,4},
                          {5 ,6 ,7 ,8},
                          {9 ,10 ,11 ,12},
                          {13 ,14 ,15 ,16}};
                          

        sm(matrix);
    }
}                  

       