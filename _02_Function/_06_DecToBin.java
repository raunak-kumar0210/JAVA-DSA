package _02_Function;
import java.util.*;
public class  _06_DecToBin{
    public static void conversion(int decNum){
        int i=0;
        int n=decNum;
        int binNum=0;
        while(decNum > 0){
            int remainder = decNum % 2;
            binNum = binNum + (int)Math.pow(10,i)*remainder;
            decNum = decNum/2;
            i++;
        }
        System.out.println("Binary conversion of " + n + " is " + binNum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number : ");
        int decNum = sc.nextInt();
        conversion(decNum);

        sc.close();
    }
}