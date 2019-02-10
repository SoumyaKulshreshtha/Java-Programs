import java.util.Scanner;
class Pallandrome
{
	static int no;//why static?
    int r;
	int old_no, new_no =0;
	int checkPallandrome(int no)
	{
		old_no=no;
		while(no>0)
		{
			r=no%10;
			new_no=(new_no*10)+r;
			no=no/10;
		}
		if(new_no==old_no)
			return 1;
		else
			return 0;
	}
    void getinput()
    {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
		no = sc.nextInt();
    }
	public static void main(String args[])
	{
		Pallandrome obj1= new Pallandrome();
        obj1.getinput();
		int ans=obj1.checkPallandrome(no);
		if(ans==1)
			System.out.println("You entered a pallandrome");
		else
			System.out.println("You did not enter a pallandrome");
	}
}
