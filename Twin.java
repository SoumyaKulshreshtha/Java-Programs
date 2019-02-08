/**
* Program to check if nos entered by user are twin prime or not
* @author Soumya
*/
import java.util.Scanner;
class Twin
{   
    public static boolean prime(int num)//To check if a number is prime or not
    {
        int count=0;
        if(num<2)
            return(false);
        else
        {
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                    count++;
            }
            if(count<1)
                return(true);
            else 
                return(false);
        }
    }
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the first munber");
    int num1=sc.nextInt();
    System.out.println("Enter the second munber");
    int num2=sc.nextInt();
    if((num2-num1==2)||(num1- num2==2))
        {
            if(prime(num1)&&prime(num2))
                System.out.println("The numbers you entered are twin prime numbers");
        }
    else
        System.out.println("the numbers you entered are not twin prime numbers");
}
}
    
