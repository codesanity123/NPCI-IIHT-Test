/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

public class Numbers {
    static int count_digits(int n)
    {
     String num = Integer.toString(n);
     return num.length();
    }
	public static void main (String[] args) {
	 Scanner s1= new Scanner(System.in);
     int number=s1.nextInt();
     int num=count_digits(number);
     if(num<2)
     System.out.println(+num);
     else if (num%2==0)
     System.out.println(+num+","+num*num);
     else if (num%3==0)
     System.out.println(+num+","+num*num*num);
     else
     {
         int diff= num%2;
         int num1=num-diff;
         System.out.println(+num+"["+num1+"],"+num1*num1);
     }
	}
}