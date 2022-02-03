package com.cpg;

public class MyBufferAndBuffet {
	public static void main(String args[])
	{
		String str="Hello";
		str=str.concat(" Welcome");
		System.out.println(str);
		StringBuffer a=new StringBuffer("Java");
		a.append(" String");
		System.out.println(a);
		a.delete(2, 7);
		System.out.println(a);
		StringBuilder sb=new StringBuilder("Hello Java");
        System.out.println(sb);
        sb.append(" Hello");
        System.out.println(sb);
	}

}
