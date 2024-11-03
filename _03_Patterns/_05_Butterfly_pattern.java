package _03_Patterns;
import java.util.*;

public class _05_Butterfly_pattern {
    public static void ButterflyPattern(int n)
    {
        if (n % 2 == 0){
            int space1 = n-2;
            int space2 = 0;
            int lines = n/2;
            for (int i = 1; i <= lines ; i++)
            {
                for(int j = 1; j <= i ; j++)
                {
                    System.out.print("* ");
                }
                for(int k = 1; k <= space1 ; k++)
                {
                    System.out.print("  ");
                }
                for(int l = 1; l <= i ; l++)
                {
                    System.out.print("* ");
                }
                space1 = space1 - 2;
                System.out.println();
            }
            for (int i = lines; i >= 1 ; i--)
            {
                for(int j = 1; j <= i ; j++)
                {
                    System.out.print("* ");
                }
                for(int k = 1; k <= space2 ; k++)
                {
                    System.out.print("  ");
                }
                for(int l = 1; l <= i ; l++)
                {
                    System.out.print("* ");
                }
                space2 = space2 + 2;
                System.out.println();
            }
        }
        else
        {
            int space1 = n-2;
            int space2 = 1;
            int lines = n/2;
            for (int i = 1; i <= lines ; i++)
            {
                for(int j = 1; j <= i ; j++)
                {
                    System.out.print("* ");
                }
                for(int k = 1; k <= space1 ; k++)
                {
                    System.out.print("  ");
                }
                for(int l = 1; l <= i ; l++)
                {
                    System.out.print("* ");
                }
                space1 = space1 - 2;
                System.out.println();
            }
            for(int i =1; i <= n ; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
            for (int i = lines; i >= 1 ; i--)
            {
                for(int j = 1; j <= i ; j++)
                {
                    System.out.print("* ");
                }
                for(int k = 1; k <= space2 ; k++)
                {
                    System.out.print("  ");
                }
                for(int l = 1; l <= i ; l++)
                {
                    System.out.print("* ");
                }
                space2 = space2 + 2;
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines for pattern : ");
        int n = sc.nextInt();
        ButterflyPattern(n);
        
        sc.close();
    }
}