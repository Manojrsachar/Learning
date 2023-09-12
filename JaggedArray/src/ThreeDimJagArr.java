
import java.util.Scanner;
public class ThreeDimJagArr {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

///////////////////////////1st ROW initialization//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println("*******************************************************");
System.out.println();
System.out.println("Enter length of 1st Dimension 3d jagged array");
int arr[][][]=new int[scan.nextInt()][][];

///////////////////////////2nd Row initialization/////////////////////////////////////////////////////////////////
System.out.println("******************************************************");
System.out.println();
System.out.println("Enter 2nd Lengths");
System.out.println();
   for(int i=0;i<=arr.length-1;i++) 
     {
       System.out.println("Enter 2D length for 1D "+i);
       arr[i]=new int[scan.nextInt()][];
     }
///////////////////////////3rd Row initialization/////////////////////////////////////////////////////////////////
  System.out.println("***************************************************");
  System.out.println();
  System.out.println("Enter 3d lengths");
  System.out.println();
    for(int i=0;i<=arr.length-1;i++)
      {
       for(int j=0;j<=arr[i].length-1;j++)
        {
        System.out.println("Enter 3rd D length for 1st D "+i+" 2D "+j);
        arr[i][j]=new int[scan.nextInt()];
        }
      }
       
//////////////////////////////Entering the values//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
for(int i=0;i<=arr.length-1;i++)
   {
   for(int j=0;j<=arr[i].length-1;j++)
      {
     for(int k=0;k<=arr[i][j].length-1;k++)
        {
         System.out.print("Enter an element of "+i+" "+j+" "+k+" : ");
         arr[i][j][k]=scan.nextInt();
        }
      }
   }
///////////////////////////////////Printing/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 

System.out.println("**************************************************");
System.out.println();
System.out.println("Array Contents are....");
System.out.println();
   for(int i=0;i<=arr.length-1;i++)
     {
      for(int j=0;j<=arr[i].length-1;j++)
       {
        for(int k=0;k<=arr[i][j].length-1;k++)
         {
           System.out.print(arr[i][j][k]+" | ");
         }
         System.out.println();
       }
        System.out.println();
     }
    }
  }
