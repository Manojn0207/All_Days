class A
{
	static int a=14;
	public void printA()
	{
		System.out.println("A");
		
	}
}
class B 
{
	int b=20;
	public void printB()
	{System.out.println("B");
		
	}
}
public class MySingleInheritance {
	public static void main(String args[])
	{
		B b=new B();
		//b.printA();
		b.printB();
		A a=new A();
		a.printA();
		System.out.println(a);
		System.out.println(b);

	}

}
