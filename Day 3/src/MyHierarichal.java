class parent
{
	public void printparent()
	{
		System.out.println("parent");
		
	}
}
class child1 extends parent
{
	public void printchild1()
	{System.out.println("child1");
		
	}
}
class child2 extends parent
{
	public void printchild2()
	{System.out.println("child2");
		
	}
}
class child3 extends parent
{
	public void printchild3()
	{
		System.out.println("child3");
	}
}
public class MyHierarichal {
	public static void main(String args[])
	{
		child1 c1=new child1();
		c1.printchild1();
		c1.printparent();
		child2 c2=new child2();
		c2.printchild2();
		c2.printparent();
		child3 c3=new child3();
		c3.printchild3();
		c3.printparent();
		
	}

}
