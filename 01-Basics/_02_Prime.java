package _01_Basics;
import java.util.*;
public class _02_Prime {
        
        public static void main(String[] args)
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            boolean isPrime = true;
            if (num==2){
                System.out.println(num +" is a Prime Number");
            }

            else{
                for (int i = 2; i<= Math.sqrt(num); i++)
                {
                    if(num%i==0)
                    {
                        isPrime=false;
                    }
                }
                if(isPrime==true)
                {
                    System.out.println(num +" is a Prime number");
                }
                else{
                    System.out.println(num +" not a Prime number");
                }
            }
            sc.close();
        }
        
}