//Program to sort Strings.

import java.io.*;
import java.util.*;
public class Sorted
{
public static void main (String args[])
	{  
           int i,j;
           String t;
           Scanner s=new Scanner(System.in);
           System.out.println("Enter the length string");
           int length=s.nextInt();
           Scanner sc=new Scanner(System.in);
           String[] str = new String[length];
	   System.out.println("Enter string");
           for(i=0;i<length;i++)
		{
			str[i]=sc.nextLine();
		}
           for (i = 0;i<length;i++)
		 {
	            for (j=i+1;j<length;j++)
			 {
		                if(str[i].compareTo(str[j])>0)
				 {
		                    t=str[i];
		                    str[i]=str[j];
		                    str[j]=t;
		                }
		         }
                  }
             System.out.println("Sorted String");
             for (i = 0;i<=length-1;i++)
                {
            		System.out.println(str[i]);
		}

           
	} 
}
