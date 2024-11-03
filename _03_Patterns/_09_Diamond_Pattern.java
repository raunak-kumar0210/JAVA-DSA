package _03_Patterns;
import java.util.*;

public class _09_Diamond_Pattern {

    public static void DiamondPattern(int n)
    {
        if (n%2 == 0)
        {
            int lines = n/2;
            int space1 = lines-1;
            int space2 = 0; 

            for (int i = 0; i < lines ; i++)
            {
                for (int j =1 ; j <= space1; j++)
                {
                    System.out.print("  ");
                }
                for (int k = 1 ; k <= (2*i+1); k++)
                {
                    System.out.print("* ");
                }
                space1--;           
                System.out.println();
            }
            for (int i = lines; i >= 0 ; i--)
            {
                for (int j =1 ; j <= space2; j++)
                {
                    System.out.print("  ");
                }
                for (int k = 1 ; k <= (2*i-1); k++)
                {
                    System.out.print("* ");
                }
                space2++;         
                System.out.println();
            }
        }
        else
        {
            int lines = n/2;
            int space1 = lines;
            int space2 = 1; 

            for (int i = 0; i < lines ; i++)
            {
                for (int j =1 ; j <= space1; j++)
                {
                    System.out.print("  ");
                }
                for (int k = 1 ; k <= (2*i+1); k++)
                {
                    System.out.print("* ");
                }
                space1--;           
                System.out.println();
            }
            for(int i = 1; i <= n ; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
            for (int i = lines; i >= 0 ; i--)
            {
                for (int j =1 ; j <= space2; j++)
                {
                    System.out.print("  ");
                }
                for (int k = 1 ; k <= (2*i-1); k++)
                {
                    System.out.print("* ");
                }
                space2++;         
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines for pattern : ");
        int n = sc.nextInt();
        
        DiamondPattern(n);

        sc.close();
    }
}