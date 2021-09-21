// Assignment : Write a Program to identify the duplicates & the number of occurrences.
//              e.g. [1,2,2,4,8,9,8,7,7,7,8] =
//              Expected :
//  Step 1 :            [1], [2,2], [4], [8,8,8], [9], [7,7,7]
//  Step 2 :            [9],[8,8,8],[7,7,7],[4,4,4,4]....  [sorted order]
//  Step 3 :            [4,4,4,4],[8,8,8],[7,7,7],[9].... [sort based on no. of occurrences & then natural sort]

import java.util.*;
class Main
{ public static void step1(int[] arr)
  { 
      int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }
           System.out.print("Step 1: ");
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited) 
            {
              System.out.print("[");
              for(int j=0;j<fr[i];j++)
              System.out.print(" "+ arr[i]+",");
              System.out.print("]");
              System.out.print(",");
        
            }    
        }       
  }
  public static void step2(int[] arr)
  { System.out.print("Step 2: ["); 
    for (int i = 0; i < arr.length; i++)   
    {  
     for (int j = i + 1; j < arr.length; j++)   
     {  
     int tmp = 0;  
     if (arr[i] < arr[j])   
     {  
       tmp = arr[i];  
       arr[i] = arr[j];  
       arr[j] = tmp;  
     }  
     }  
     
     System.out.print(" "+arr[i]+",");  
    }
    System.out.print("]");
  }      
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int arr[] = new int[num];
    for(int i=0; i<num; i++)  
    arr[i]=sc.nextInt(); 
    step1(arr);
    System.out.println("");
    step2(arr);
  }
}
