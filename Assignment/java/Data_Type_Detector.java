/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

public class Type 
{
	public static void main (String[] args) {
	 Scanner in = new Scanner(System.in);
	 
     if(in.hasNextInt())
     {
         int num=in.nextInt();
         if (num>=-32768 && num<32768)
            System.out.println("You have entered an Short Int Value as : " + num);
         else if (num>= -2147483648 && num<=2147483647)                
            System.out.println("You have entered an Int Value as : " + num);
     }
        else if(in.hasNextLong())
            System.out.println("You have entered an Long Value as : " + in.nextLong());
        else if(in.hasNextFloat())
            System.out.println("You have entered an Float Value as : " + in.nextFloat());
        else if(in.hasNextDouble())
            System.out.println("You have entered an Double Value as : " + in.nextDouble());
        else 
            System.out.println("Token not an Integer or a real value.");
	}
}
