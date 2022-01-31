import java.util.*;
public class EvenOdd {
	public static void main(String args[])
	{
		Scanner var=new Scanner(System.in);
		System.out.println("Enter number ");
		int a=var.nextInt();
		if(a%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
