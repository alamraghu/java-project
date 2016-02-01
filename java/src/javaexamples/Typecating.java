package javaexamples;

public class Typecating {

	public static void main(String[] args) {
		System.out.println("main method started");
		sample ref=new sample();
		ref.main((int)3.69);
		ref.main1(3);
				//System.out.println("c="+c);
		System.out.println("main method ended");

	}

}

class sample{
	void main(int arg1)
	{
		System.out.println("int min method");
		System.out.println("arg1"+arg1);
		return ;
}
	void main1(double arg1)
	{
		System.out.println("double  min method");
		System.out.println("arg1"+arg1);
		return ;
	}
}



