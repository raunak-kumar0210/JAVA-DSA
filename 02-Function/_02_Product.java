package Function;
import java.util.Scanner;

public class _02_Product {

    public static int findproduct(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod=findproduct(a,b);
        System.out.print(prod);

        sc.close();
    }
}