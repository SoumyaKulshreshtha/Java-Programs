  
/**
* Program for Binary Search
* @author Soumya Kulshreshtha
*/
class SearchSort
{
	int low, high,mid,min;
    int BinarySearch(int array[],int Element)
	{
		low=0;
		high=9;
		mid=(high+low)/2;
		while(true)
		{
			if(array[mid] == Element)
				break;
			else if(array[mid]< Element)
			{
				low=mid;
				mid=(low+high)/2;
			}
			else if(array[mid] > Element)
			{
				high=mid;
				mid=(high+low)/2;
			}
		}
		return mid;
	}
	public static void main(String args[])
	{
        int Array[] = {0,12,15,18,20,25,50,60,75,80};
		SearchSort obj = new SearchSort();
		int index = obj.BinarySearch(Array,12);
		System.out.println("12 is in index position " + index);
	}
}
