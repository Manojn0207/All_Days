package com.cpg;
//same method name but different parameters
class drawshape
{
	public void drawshape(int a, int b)
	{
		System.out.println("10,20");
	}
	public void drawshape(int a, int b, int c)
	{
		System.out.println("10,20,30");
	}
	public void drawshape(int a, int b, int c, int d)
	{
		System.out.println("10,20,30,40");
	}
}

public class MyPolimorphismOverloaading {
	public static void main(String args[])
	{
		drawshape s1=new drawshape();
		s1.drawshape(1, 2, 3, 4);
		s1.drawshape(1, 2, 3);
		s1.drawshape(1, 2);
	}

}
