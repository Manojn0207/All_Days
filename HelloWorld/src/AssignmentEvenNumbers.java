import java.util.*;
public class AssignmentEvenNumbers {
	public static void main(String args[])
	{
		Scanner ev=new Scanner(System.in);
		System.out.println("Enter N value ");
		int n=ev.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
