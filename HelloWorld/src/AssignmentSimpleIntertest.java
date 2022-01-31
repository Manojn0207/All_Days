import java.util.*;

public class AssignmentSimpleIntertest {
	public static void main(String args[])
	{
		Scanner sp=new Scanner(System.in);
		System.out.println("Enter the principal amoount ");
		float p=sp.nextFloat();
		System.out.println("Enter the interest rate ");
		float i=sp.nextFloat();
		System.out.println("Enter the time period ");
		float t=sp.nextFloat();
		float si=(p*i*t)/100;
		System.out.println(si);
				
	}

}
