class Swap
{
	int no1=5;
	int no2=3;
	void no_swap()
	{
		no1=no1+no2;
		no2=no2+no1;
		no2=no1-(no2-no1);
		no1=no1-no2;
		System.out.println("First no is "+no1);
		System.out.println("Second no is "+no2);
	}
	public static void main(String args[])
	{
		Swap obj1 = new Swap();
		obj1.no_swap();
	}
}
