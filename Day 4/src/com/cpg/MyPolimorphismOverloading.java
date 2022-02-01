package com.cpg;
//it should have same class and method name
class shape
{
	public void shape()
	{
		System.out.println("Draw shape");
	}
}
class line extends shape
{
	public void shape()
	{
		System.out.println("Draw line");
	}
}
class square extends shape
{
	public void shape()
	{
		System.out.println("Draw square");
	}
}

public class MyPolimorphismOverloading {
	public static void main(String args[])
	{
		shape s=new line();
		s.shape();
	}

}
