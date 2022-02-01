package com.cpg;
//it should have same method name in parent and child class
class shape
{
	public void drawshape()
	{
		System.out.println("Draw shape");
	}
}
class line extends shape
{
	public void drawshape()
	{
		System.out.println("Draw line");
	}
}
class square extends shape
{
	public void drawshape()
	{
		System.out.println("Draw square");
	}
}

public class MyPolimorphismOverriding {
	public static void main(String args[])
	{
		shape s=new line();
		s.drawshape();
	}

}
