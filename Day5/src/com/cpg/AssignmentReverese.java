package com.cpg;

public class AssignmentReverese {
	public static void main(String args[])
	{
		String str=new String("HII");
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
