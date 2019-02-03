/**
* Program to convert decimal no to Binary
* @author Soumya
*/
class Binary
{
    int Dec_no=8;
    int r;
    int count;
    int Dec = Dec_no;
    int No;
    int BinConvSize()//Method to find size of array to store binary no.
    {
        No=Dec_no;
        while(No>0)
        {
            No=No/2;
            count++;
        }
        return count;
    }
    void BinConv(int count)//Method to convert decimal no to binary
    {
        int[] binNo= new int[count];        
        while(Dec_no>0)
        {
            int i=0;
            r=Dec_no%2;
            binNo[i]=r;          
            i++;
            Dec_no=Dec_no/2;
        }
        for(int j=0; j<count; j++)//Loop to print binary no.
        {
            System.out.print(binNo[j]);
        }
        System.out.print(" is the binary no for the decimal no. "+Dec);
    }
  
    public static void main(String args[])
    {
        Binary obj1= new Binary();
        int size = obj1.BinConvSize();
        obj1.BinConv(size);
    }
}
