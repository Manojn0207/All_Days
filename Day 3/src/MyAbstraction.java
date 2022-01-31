abstract class Mobile {
	/*abstract public void calling();

	abstract public void sendSMS();

	abstract public void wifi();*/
	public void Android()
	{
		System.out.println("Android Phone");
	}
	public void processor()
	{
		System.out.println("Snapdragon 899");
	}
}

class google extends Mobile {

	
	public void calling() {
		System.out.println("Google Mobile");
	}

	
	public void sendSMS() {
		System.out.println("Google sending sms");
	}

	public void wifi() {
		System.out.println("100mbps");
	}
	public void processor()
	{
		System.out.println("Snapdragon 870");
	}

}

class apple extends Mobile {
	public void calling() {
		System.out.println("Apple Mobile");
	}

	public void sendSMS() {
		System.out.println("Apple sending sms");
	}

	public void wifi() {
		System.out.println("500mbps");

	}
	public void processor()
	{
		System.out.println("Snapdragon 720G");
	}
}

public class MyAbstraction {
	public static void main(String args[]) {
		google g1 = new google();
		g1.calling();
		g1.sendSMS();
		g1.wifi();
		g1.Android();
		g1.processor();
		apple a1 = new apple();
		a1.calling();
		a1.sendSMS();
		a1.wifi();
		a1.Android();
		a1.processor();
		

	}

}
