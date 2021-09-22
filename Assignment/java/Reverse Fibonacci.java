import java.util.*;
class Main{
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
      int n=num;
      int j=0;
      int fib[] = new int[n];
      if(n>=0)
        fib[0] = 0;
      if(n>=1)
        fib[1] = 1;
      for(int i=2;i<n;i++)
       { fib[i] = fib[i-1] + fib[i-2];
         if (fib[i]>=num)
         { j=i;
         break;
       }
       }
      for(int i=j-1;i>=0;i--)
        System.out.print(fib[i]+" ");
    }
}
