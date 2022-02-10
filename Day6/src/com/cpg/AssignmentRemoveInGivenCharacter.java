package com.cpg;
import java.util.*;
public class AssignmentRemoveInGivenCharacter {
	 public static void main(String[] args) {  
         String str ;  
         System.out.println("Enter word");
         Scanner sc=new Scanner(System.in);
         str=sc.nextLine();
         System.out.println(charRemoveAt(str, 2));  
      }  
      public static String charRemoveAt(String str, int p) {  
         return str.substring(0, p) + str.substring(p + 1);  
      }  

}
