class A1
{
	public void printA1()
	{
		System.out.println("I'm A");
		
	}
}
class B1 extends A1
{
	public void printB1()
	{System.out.println("I'm B");
		
	}
}
class C1 extends B1
{
	public void printC1()
	{System.out.println("I'm C");
		
	}
}

class D1 extends C1
{
	public void printD1()
	{System.out.println("I'm D");
		
	}
}

public class MyHierarichalInheritance {
	public static void main(String args[])
{
	D1 d=new D1();
	d.printA1();
	d.printB1();
	d.printC1();
	d.printD1();
	
}

}
