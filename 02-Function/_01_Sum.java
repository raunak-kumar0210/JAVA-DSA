package Function;

import java.util.Scanner;

public class _01_Sum {

    public static int findsum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = findsum(a, b);
        System.out.print(sum);

        sc.close();
    }
}