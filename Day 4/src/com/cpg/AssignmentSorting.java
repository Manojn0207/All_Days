package com.cpg;

import java.util.*;

public class AssignmentSorting {
	public static void main(String args[]) {
		int a[] = new int[10];
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the values");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("The sorted elements are");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

}
