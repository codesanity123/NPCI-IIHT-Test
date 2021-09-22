
import java.util.*;
class Main
{ 
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows");
    int row = sc.nextInt();
    System.out.println("Enter number of columns");
    int col = sc.nextInt();
    int tdarr[][] = new int[row][col];
    for(int i=0; i<row;i++)
         {  if (i%2==0)
            { for(int j=0; j<col;j++)
                tdarr[i][j]=sc.nextInt();
            }
            else
            {
             for(int j=col-1; j>=0;j--)
                tdarr[i][j]=sc.nextInt();   
            }
         }
    for(int[] nums : tdarr){
                for(int num : nums){
                    System.out.print(num+"        ");
               }
            System.out.println();
   }
  }
}
