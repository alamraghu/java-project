package javaexamples;

public class Typecasting {

	public static void main(String[] args) {
		System.out.println("main method started");
		start ref=new start();
		ref.execution(new sample1());
		ref.execution(new sample2());
		ref.execution(new sample3());
		
		System.out.println("main method ended");

	}

}


class sample1{
	int k=4;
	void test1()
	{
		System.out.println("running test1 method"+  k);
	}
}

class sample2 extends sample1{
	double d=4.5;
	void test2()
	{
		System.out.println("running test2 method"+ d);
	}

}

class sample3 extends sample2{
	char c='t';
	void test3()
	{
		System.out.println("running test3 method"+ c);
	}

}

class start
{
	void execution (sample1 arg1){
		System.out.println("starting start execution method");
		arg1.test1();
	}
}

