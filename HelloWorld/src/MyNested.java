
public class MyNested {
	public static void main(String args[]) {
		int a = 10;
		int b = 2;
		int c = 5;
		if (a > b) {
			if (a > c) {
				System.out.println("A is greater");
			} else {
				System.out.println("C is greater");
			}
		} else {
			if (b > c) {
				System.out.println("B is greater");
			} else {
				System.out.println("C is greater");
			}
		}
	}

}
