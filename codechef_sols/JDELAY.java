//Kumar Ankit
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int[] s=new int[n];
		    int[] j=new int[n];
		    int c=0;
		    for(int i=0;i<n;i++){
		        s[i]=sc.nextInt();
		        j[i]=sc.nextInt();
		        if(j[i]-s[i]>5)
		        c++;
		    }
		    System.out.println(c);
		    
		}
	}
}
