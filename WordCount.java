/**
* Program to count no of words entered by user (A word ends with space).
* @author Soumya
* @since 04-02-19
*/
import java.lang.*;
import java.util.*;
import java.io.*;
class WordCount
{
	String Para;
	int WordCount;
	static InputStreamReader stream;
	static BufferedReader in;
	int ParaSize;
	void CountNoOfWords(String Para)
	{
		ParaSize=Para.length();
		for(int i=0;i<ParaSize-1;i++)
		{
			if(Para.charAt(i)==' '&& Para.charAt(i+1)!=' ')
                   WordCount++;
		}
        if(ParaSize>0)
            WordCount++;
		System.out.println("No of Words in the pharagraph is : "+WordCount);
	}
	public static void main(String args[])
	{
		stream=new InputStreamReader(System.in);
		in=new BufferedReader(stream);
        	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a pharagraph");
		//String phara="Hey! I am Soumya Kulshreshtha. How are you? Tell me.";		
		try
		{
		String phara=in.readLine();
		WordCount obj = new WordCount();
		obj.CountNoOfWords(phara);
	        }
	       catch(Exception ae)
		{
			System.out.println(ae.getMessage());
 		}
       }
}
