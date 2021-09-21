/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;
public class Numbers {
	public static void main (String[] args) {
		Scanner s1= new Scanner(System.in);
int a= s1.nextInt();
int b=s1.nextInt();
if(b%2!=0 && b!=a*a)
System.out.println("Not even and not square of previous" );
else if(b%2==0 && b!=a*a)
System.out.println("Even. Quotient is: "+ b/2 );
else
System.out.println("Even. Square of Previous ");
	}
}