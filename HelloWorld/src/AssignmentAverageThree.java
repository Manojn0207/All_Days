import java.util.Scanner;

public class AssignmentAverageThree {
	public static void main(String args[])
	{
		try (Scanner av=new Scanner(System.in)) {
		System.out.println("Enter the 1st number ");
		double a=av.nextDouble();
		System.out.println("Enter the 2nd number ");
		double b=av.nextDouble();
		System.out.println("Enter the 3rd number ");
		double c=av.nextDouble();
		double d=(a+b+c)/3;
		System.out.println(d);
		}
	}

}
