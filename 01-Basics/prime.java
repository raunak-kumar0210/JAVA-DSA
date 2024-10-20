package Basics;
import java.util.*;
public class prime {
        public static void Checkprime(int num)
        {
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

        }
        public static void main(String[] args)
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            Checkprime(num);

            sc.close();
        }
        
}