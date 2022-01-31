import java.util.Scanner;

public class AssignmentQuotientRemainder {
	public static void main(String args[])
	{
		Scanner qo=new Scanner(System.in);
		System.out.println("Enter the 1st number ");
		double a=qo.nextDouble();
		System.out.println("Enter the 2nd number ");
		double b=qo.nextDouble();
		double c=a/b;
		double d=a%b;
		System.out.println(c);
		System.out.println(d);
	}

}
