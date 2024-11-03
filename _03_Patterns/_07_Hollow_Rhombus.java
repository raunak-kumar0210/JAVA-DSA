package _03_Patterns;
import java.util.*;

public class _07_Hollow_Rhombus {
    public static void HollowRhombus(int n)
    {
        int Outspace = n-1;
        int insSpace = n-2;
        for (int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= Outspace; j++)
            {
                System.out.print("  ");
            }
            if(i == 1 ||  i ==n)
            {
                for(int j = 1; j <= n; j++){
                    System.out.print("* ");
                }
            }
            else
            {
                System.out.print("* ");
                for(int j = 1 ; j <= insSpace; j++)
                {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            Outspace--;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines for pattern : ");
        int n = sc.nextInt();
        
        HollowRhombus(n);
        
        sc.close();
    }
}