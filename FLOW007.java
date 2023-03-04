// https://www.codechef.com/problems/FLOW007
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
            int n = s.nextInt();
            int rev = 0;
            
            while(n!=0){
                int last = n%10;
                rev = (rev*10)+last;
                n=n/10;
            }
            
            System.out.println(rev);
		}
	}
}



