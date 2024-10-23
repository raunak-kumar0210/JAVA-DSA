package _03_Patterns;

import java.util.*;
public class _02_Half_Pyramid {
    public static void HalfPyramid(int n)
    {
        int space = n-1;
        for(int i = 1; i <= n ; i++)
        {
            for(int j = 1; j <=space ; j++)
            {
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++)
            {
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines for pattern : ");
        int n = sc.nextInt();
    
        HalfPyramid(n);
        
        sc.close();
    }
}