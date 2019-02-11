import java.util.Scanner;
class MagicMatrix
{
    static int matrix[][];
    static int row=0;
    int j;
    int SumCf,SumCl,SumRf,SumRl,SumD1,SumD2=0;


    void getInput()
    {   
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
              System.out.println("Enter a value: ");
               matrix[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
              System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
                
    }
    void checkMagic()
    {
        for(int i=0;i<row;i++)
        {
           j=row-1;
           SumCf=SumCf+matrix[i][0];//Sum of First column row (row value is changing, column value is 0)
           SumCl=SumCl+matrix[i][row-1];//Sum of Last column (row value is changing, column value is fixed i.e the size of matrix)
           SumRf=SumRf+matrix[0][i];//Sum of First row (row value is 0, column value is changing)
           SumRl=SumRl+matrix[row-1][i];//Sum of last row (row value is fixed i.e. size of matrix, column value is changing)
           SumD1=SumD1+matrix[i][i];//sum of diagonal1(row and column value is same and is changing)
           SumD2=SumD2+matrix[i][j];//sum of diagonal2(row and column value is changing)
           j--;
        }
        if((SumCf==SumCl)&&(SumCl==SumRf)&&(SumRf==SumRl)&&(SumRl==SumD1)&&(SumD1==SumD2))
            System.out.println("You entered Magic matrix");
        else
            System.out.println("You did not enter a magic matrix");
    }

    public static void main(String args[])
    {
    MagicMatrix array1 = new MagicMatrix();
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no. of rows for square matrix: ");
    row = sc.nextInt();
    
    matrix = new int[row][row];
    array1.getInput();
    array1.checkMagic();
    }
  }
