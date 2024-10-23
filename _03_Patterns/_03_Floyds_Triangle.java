package _03_Patterns;
import java.util.*;
public class _03_Floyds_Triangle {

    public static void FloydTriangle(int n)
    {
        int a = 1;
        for(int i = 1; i <= n ; i++)
        {
            for(int j = 1; j <=i ; j++)
            {
                System.out.print(a + " ");
                a++;
            }
            
            System.out.println();

        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines for pattern : ");
        int n = sc.nextInt();
        
        FloydTriangle(n);
        
        sc.close();
    }
}