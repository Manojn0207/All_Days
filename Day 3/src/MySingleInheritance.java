class A
{
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
}
public class MySingleInheritance {
	public static void main(String args[])
	{
		B b=new B();
		b.printA();
		b.printB();
		System.out.println(b.a);
		System.out.println(b.b);

	}

}
