package _02_Function;
import java.util.*;
public class _04_Bin_Coeff {
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
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();
        System.out.print("Enter value for r : ");
        int r = sc.nextInt();
        int nmr = n-r;
        int fact_of_n = findfactorial(n);
        int fact_of_r = findfactorial(r);
        int fact_of_nmr = findfactorial(nmr);
        int binomialcoefficient = fact_of_n/(fact_of_r * fact_of_nmr);
        System.out.println("Binomial Coefficient = " + binomialcoefficient);

        sc.close();
    }
}