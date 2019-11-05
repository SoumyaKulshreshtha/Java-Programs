/**
* Program to find first two maximum numbers in an array
* @author Soumya
* @since 04-02-19
*/
class ArrayMax
{
    int [] Nos_Array={5,4,45,0,1};
    int max;
    int max2;
    void CheckMax()
    {
        max= Nos_Array[0];
        max2= Nos_Array[0];
        for(int i=0;i<5;i++)
        {
            if(Nos_Array[i]>max)
                max=Nos_Array[i];
        }
        for(int i=0;i<5;i++)
        {
            if(Nos_Array[i]<max && Nos_Array[i]>max2)
                max2=Nos_Array[i];
        }
        System.out.println("Maximum no. is: "+max);
        System.out.println("Second max no. is: "+max2);
    }
    public static void main(String args[])
    {
        ArrayMax obj1 = new ArrayMax();
        obj1.CheckMax();
    }
}
        
