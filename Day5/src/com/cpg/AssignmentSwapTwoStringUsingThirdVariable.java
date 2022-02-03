package com.cpg;

public class AssignmentSwapTwoStringUsingThirdVariable {
	public static void main(String args[])
	{
		String temp;
		String str1=new String("Hello");
		String str2=new String(" Java");
		System.out.println("Before Swapping " +str1 +str2);
		temp=str1;
		str1=str2;
		str2=temp;
		System.out.println(str1);
	}

}
