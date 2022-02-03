package com.cpg;

public class MyWapperClass {

		public static void main(String[] args) {

			Double A = new Double(2.5);
			Double B = new Double(8.9);
			int d=A.intValue();
			int E=B.intValue();
			System.out.println(A.max(A, B) + ": max");
			System.out.println(A.min(A, B) + ": mix");
			System.out.println(d);
			System.out.println(E);
		
	}

}
