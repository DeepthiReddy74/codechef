import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		for(int i=1;i<=t;i++){
		    int n = sc.nextInt();
		    int  m = sc.nextInt();
		    if(m>=n)
		    System.out.println(0);
		    else
		    System.out.println(n-m);
		}

	}
}