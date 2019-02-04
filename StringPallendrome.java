/**
* Program to reverse letters of a word entered by user and check if it is pallendrome or not.
* @author Soumya
* @since 04-02-19
*/
import java.util.*;
import java.lang.*;
class StringPallendrome
{
	String word;
    String rev_word="";
	int letterCount;
	void Pallendrome(String word)//method to reverse the letters and check for pallendrome
	{
		letterCount=word.length()-1;
		for(int i=letterCount;i>=0;i--)
		{
			rev_word+=word.charAt(i);//rev_word stores the letters of word in reverse order.
		}
		System.out.println("Word After reversing the letters is : "+rev_word);
		if(rev_word.equals(word))
			System.out.println("You entered a pallendrome");
		else
			System.out.println("You did not enter a pallendrome");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		StringPallendrome obj = new StringPallendrome();
		System.out.println("Enter a word : ");
		String Word = sc.next();
		obj.Pallendrome(Word);
	}
}
