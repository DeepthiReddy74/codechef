import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int withoutCombo = (x * 2) + (y * 3);
        int combo = ((z * 2) + y);
        System.out.println(Math.min(withoutCombo, combo));

	}
}