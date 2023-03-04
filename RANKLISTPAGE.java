// https://www.codechef.com/problems/RANKLISTPAGE
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
		    int x = s.nextInt();
		    int y = x/25;
		    if(x%25==0){
		        System.out.println(y);
		    }else{
		        System.out.println(y+1);
		    }
		}
	}
}
