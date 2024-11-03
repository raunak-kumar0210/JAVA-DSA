package _03_Patterns;

import java.util.Scanner;

public class _10_Pascal_Triangle {

    
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    
    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    
    public static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i, j) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        printPascalTriangle(n);
        sc.close();
    }
}

