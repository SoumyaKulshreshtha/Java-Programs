/**
* Program to check if a number is Amstrong no. or not
* @author Soumya
*/
class Amstrong
{
    int no=153;
    int a;
    int a_no;
    int old_no;
    public void check() //Method to check for Amstrong no.
    {
        old_no=no;
        while(no>0)
        {
            a=no%10;
            a_no=a_no+(a*a*a);
            no=no/10;
        }
        if(old_no==a_no)
            System.out.println(old_no+" is an Amstrong no.");
        else
            System.out.println(old_no+" is not an Amstrong no.");
    }
    public static void main(String args[])
    {
        Amstrong number1=new Amstrong();
        number1.check();
    }
}
