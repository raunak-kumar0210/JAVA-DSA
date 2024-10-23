package _03_Patterns;
import java.util.*;
public class _01_Hollow_Rectangle {

    public static void HollowRectangle(int n)
    {
        for (int i = 1; i <= n; i++){
            if(i==1 || i==n)
            {
                for (int j = 1; j <= n+1; j++){
                    System.out.print("* ");
                }
            }
            else
            {
                System.out.print("* ");
                for(int j = 1; j <= n-1; j++)
                {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines for pattern : ");
        int n = sc.nextInt();
        
        HollowRectangle(n);

        sc.close();
    }
}
