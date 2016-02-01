package com.javabasics;

public class Run2 {
	public static void main(String[] args) {
		System.out.println("main method started");
		sample3 ref=new sample3();
		ref.view();
		ref.main();

	}

}


class sample2 extends sample1{
	
	double d;
	sample2()
	{
		System.out.println("initializing sample2");
}
	void main()
	{
		System.out.println("sample2 method");
	}
}

class sample3 extends sample2{
	String s= "raghu";
	sample3()
	{
		System.out.println("initializing sample3"+s);
}
	void sample()
	{
		System.out.println("sample3 method");
	}
}


