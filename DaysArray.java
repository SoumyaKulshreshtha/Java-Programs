//Days from 1st Jan 2018
import java.util.Scanner;
class DaysArray
{   
    int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    int count_date;
    int count_day;
    int count_year;
    int count_yr=0;
    public void calDays(int date, int month, int year)
    {   
        for(int i=1;i<month;i++)
        {
            count_day=count_day+days[i];
        }
        count_day=count_day+date;
        count_year=year-2018;
        count_day=count_day+(count_year*365);
        for(int yr=2018; yr<=year;yr++)
        {
               if((year%4==0)||(year%100==0 && year%400==0))
                    count_yr++;
        }
        count_day=count_day + count_yr;
        if((month==2)&&((year%4==0)||(year%100==0 && year%400==0)))
            count_day=count_day+1;
        System.out.println("No of days till the date you entered form 1st Jan 2018 are: " + count_day);
               
    }
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter date");
    int date=sc.nextInt();
    System.out.println("Enter month");
    int month=sc.nextInt();
    System.out.println("Enter year");
    int year=sc.nextInt();
    if((date<1||date>31)||((month<1)||(month>12))||(year<2018))
        System.out.println("You did not enter valid values");
    else if((month==2&&((year%4==0)||(year%100==0 && year%400==0))&&date>29))
        System.out.println("You did not enter valid values");
    else if(month==2&&date>28)
        System.out.println("You did not enter valid values");
    else
    {
        DaysArray obj=new DaysArray();
        obj.calDays(date,month,year);     
    }
}
}

