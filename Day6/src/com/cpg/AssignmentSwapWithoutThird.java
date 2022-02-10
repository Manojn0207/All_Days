package com.cpg;
import java.util.*;
public class AssignmentSwapWithoutThird {
	public static void main(String args[])
	{
		String a ;
		String b ;
		System.out.println("Enter the string1");
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		System.out.println("Enter the string2");
		b=sc.nextLine();
	
		System.out.println("Strings before swap: a = " +	a + " and b = "+b);
		a = a + b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("Strings after swap: a = " +	a + " and b = " + b);		
	}	

}
