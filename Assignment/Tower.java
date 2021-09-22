
import java.util.*;
class Main
{ 
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter height of tower");
    int num = sc.nextInt();
    
    int sum=5;
    int temp_sum=5;
    for (int i=0;i<num;i++)
    {   
        if(i<2)
    {  
        for (int j=0;j<=i;j++)
            {   
                System.out.print(i+1+" ");
            }
        System.out.println("");    
    }
       else
    {   
            for (int j=0;j<=i;j++)
            {   
                sum=sum+temp_sum;
                System.out.print(temp_sum+" ");
            }
        temp_sum=sum;        
        System.out.println("");    
    }
  }
}
}
