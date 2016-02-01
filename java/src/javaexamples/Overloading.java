package javaexamples;

public class Overloading {

	public static void main(String[] args) {
System.out.println("main method with string array");
two ref=new two();
ref.on1();
ref.on1(4.5);
	}
}

class one{
	void on1()
	{
		System.out.println("no args");
	}
	
		
			}

class two extends one{
	void on1(double arg1)
	{System.out.println("hai");
		System.out.println("double arg1");
	}
}