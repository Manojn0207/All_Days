class A
{
	A()
	{
		System.out.println("I am A constructor");
	}
    int a=14;
	public void printA()
	{
		System.out.println("A");
		
	}
}
class B extends A
{
	int b=20;
	public void printB()
	{System.out.println("B");
		
	}
	B()
	{
		System.out.println("I am B constructor");
	}
	
}
class C extends B
{
	C()
	{
		super();
	}
}
public class MySingleInheritanceAndConstructor {
	public static void main(String args[])
	{
		
		B b=new B();
		b.printA();
		b.printB();
		System.out.println(b.a);
		System.out.println(b.b);

	}

}
