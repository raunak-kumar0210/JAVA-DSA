package _02_Function;
import java.util.*;
public class _03_Factorial{
    
    public static int findfactorial(int num){
        int fact=1;
        for (int i =1; i<=num; i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int fact = findfactorial(num);
        System.out.println("factorial of " + num + " = " + fact);

        sc.close();
    }
}