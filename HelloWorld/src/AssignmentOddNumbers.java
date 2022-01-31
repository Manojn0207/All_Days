import java.util.Scanner;

public class AssignmentOddNumbers {
	public static void main(String args[])
	{
		Scanner od=new Scanner(System.in);
		System.out.println("Enter N value ");
		int n=od.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}

}
