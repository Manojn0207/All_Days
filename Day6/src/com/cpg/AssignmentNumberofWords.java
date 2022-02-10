package com.cpg;

public class AssignmentNumberofWords {
	public static void main(String args[])
	{
		String str=new String("Welcome to Java");
		int ch=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				ch++;
			}
		}
		ch=ch+1;
		System.out.println(ch);
		}

}
