package com.cpg;
import java.util.*;
public class AssignmentPallindrome {
	static boolean isPalindrome(String str)
	{
		int i = 0, j = str.length() - 1;	
		while (i < j) {		
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;
	}

	public static void main(String[] args)
	{
		String str;
		System.out.println("Enter a name to check pallindrome");
             Scanner sc =new Scanner(System.in);
             str= sc.nextLine();
		if (isPalindrome(str))

			System.out.print("Yes");
		else
			System.out.print("No");
	}

}
