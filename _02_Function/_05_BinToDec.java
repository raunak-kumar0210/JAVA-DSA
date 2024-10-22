package _02_Function;
import java.util.*;
public class _05_BinToDec
{
    public static void conversion(int binNum)
    {
        int n = binNum;  
        int decNum = 0;
        int i = 0;
        while(binNum > 0)
        {
            int d = binNum % 10;
            decNum = decNum + ((int)Math.pow(2,i))*d;
            binNum = binNum/10;
            i++;
        }
        System.out.println("Decimal conversion of " + n + " is " + decNum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary number : ");
        int binNum = sc.nextInt();
        conversion(binNum);

        sc.close();
    }
}