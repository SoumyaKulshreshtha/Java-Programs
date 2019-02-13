import java.util.*;
class Prime
{
    int a=2;
    int count;
    int no_count=0;
    public void nos()
    {
        while(no_count<100)
        {
            count=0;
            for(int i=2;i<=Math.sqrt(a);i++)
            {
                if(a%i==0)
                    count++;
            }
            if(count<1)
            {
                System.out.println(a);
                no_count++;
            }
            a++;
        }
    }
public static void main(String args[])
{
    Prime no= new Prime();
    no.nos();
}
}

