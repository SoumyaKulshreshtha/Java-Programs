/**
* Program to count no of lines entered by user( A line ends with '.','?','!').
* @author Soumya
* @since 04-02-19
*/
import java.lang.*;
class CountLines
{
	String Para;
	int LineCount;
    int ParaSize;
	void CountNoOfLines(String Para)
	{
		ParaSize=Para.length()-1;
		for(int i=0;i<ParaSize;i++)
		{ 
			if((Para.charAt(i) == '.' && (Para.charAt(i+1)!= '.' || Para.charAt(i+1)!= '?'|| Para.charAt(i+1)!= '!')) || (Para.charAt(i)=='?'&& (Para.charAt(i+1)!= '.' || Para.charAt(i+1)!= '?'|| Para.charAt(i+1)!= '!'))|| (Para.charAt(i)=='!'&& (Para.charAt(i+1)!= '.' || Para.charAt(i+1)!= '?'|| Para.charAt(i+1)!= '!')))
                LineCount++;
		}
        if(Para.charAt(ParaSize)=='.'||Para.charAt(ParaSize)=='?'||Para.charAt(ParaSize)=='!')
            LineCount++;
		System.out.println("No of lines in the paragraph is : " + LineCount);
	}
	public static void main(String args[])
	{
        String para="Hey! I am Soumya Kulshreshtha. How are you? Tell me.";		
		CountLines obj = new CountLines();
		obj.CountNoOfLines(para);
	}
}
