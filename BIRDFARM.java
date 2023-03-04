// https://www.codechef.com/problems/BIRDFARM
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
		    int y = s.nextInt();
		    int z = s.nextInt();
		    if(z%x==0 && z%y==0){
		        System.out.println("ANY");
		    }else if(z%x==0 && z%y!=0){
		        System.out.println("CHICKEN");
		    }else if(z%y==0 && z%x!=0){
		        System.out.println("DUCK");
		    }else{
		        System.out.println("NONE");
		    }
		}
	}
}
