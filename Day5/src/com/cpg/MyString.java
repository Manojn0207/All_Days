package com.cpg;

public class MyString {
	public static void main(String args[])
	{
		String str="Welcome to String";
		String str1=new String();
		String str2=new String("   Welcome   to   String");
		System.out.println(str.length());
		if(str1.isEmpty())
		{
			System.out.println("The string is empty");
		}
		else
		{
			System.out.println("The string is not empty");
		}
		System.out.println(str.charAt(9));
		System.out.println(str.codePointAt(6));
		if(str.equals(str2))
		{
			System.out.println("The string is equal");
		}
		else
		{
			System.out.println("The string is not equal");
		}
		if(str.equalsIgnoreCase(str2))
		{
			System.out.println("The string is equal");
		}
		else
		{
			System.out.println("The string is not equal");
		}
		String str4="A";
		String str5="B";
		System.out.println(str4.compareTo(str5));
		System.out.println(str4.compareToIgnoreCase(str5));
		System.out.println(str2.startsWith("W"));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 5));
		System.out.println(str.concat(" H"));
		System.out.println(str.concat(" "+str2));
		System.out.println(str.contains("wel"));
	    System.out.println(str.contains("Java"));
	    System.out.println(str.toLowerCase());
	    System.out.println(str.toUpperCase());
	    System.out.println(str.trim());
	    String str6="Java";
	      String str7="Java";
	      String str8=new String("Java");
	      System.out.println(str6.hashCode());
	      System.out.println(str7.hashCode());
	     // System.out.println(str8.hashCode());
	       if(str6==str8)
	      {
	    	  System.out.println("Equal");
	      }
	      else
	      {
	    	  System.out.println("Not equal");
	      }
		}

}
