package com.cpg;

public class AssignmentReverseString {
	public static void main(String args[])
	{
		String str=new String("Welcome");
		char ch;
		String strrev=new String();
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			ch=str.charAt(i);
			strrev=ch+strrev;
		
		}
		System.out.println(strrev);
	}

}
