import java.util.Scanner;
class VowelsArray
{
    char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
    public void Check(char alpha)
    {
        int flag=0;
        for(int i=0;i<10;i++)
        {
            if(alpha==vowels[i])
            {
               flag=1;
                break;
            }
        } 
        if(flag==1)
            System.out.println("You entered a vowel");
        else
            System.out.println("You did not enter a vowel");
    }
public static void main(String args[])
{
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet ");
        char alpha = sc.next().charAt(0);
        VowelsArray obj = new VowelsArray();
        obj.Check(alpha);
}
}
    
    
