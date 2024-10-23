package _03_Patterns;

import java.util.*;
public class _04_ZeroOne_Triangle {
    public static void ZeroOneTriangle(int n)
    {
        for(int i = 1; i <= n ; i++)
        {
            for(int j = 1; j <=i ; j++)
            {
                if((i+j) % 2 == 0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                } 
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines for pattern : ");
        int n = sc.nextInt();
        
        ZeroOneTriangle(n);
        
        sc.close();
    }
}