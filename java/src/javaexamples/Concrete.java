package javaexamples;

public abstract class Concrete {
	void test1()
	{
		System.out.println("comcrete method in abstract class");
	}
	
	 abstract void test2();
	abstract  void test3();
	
}

abstract class concrete1 extends Concrete{
	void test2()
	{
		System.out.println("test2 method");
	}
}
class concrete2 extends concrete1{
	void test3()
	{
		System.out.println("test3 method");
	}
}