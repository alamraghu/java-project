package com.javabasics;

public class helloword {

	public static void main(String[]args)
	{ 
		System.out.println("start main method");
		aoc a1=new aoc();
		
        int c =aoc();
        //int c=c.aoc();
	System.out.println("end main method"+ c);

	}
	
	public static int aoc()
	{
	System.out.println("area of acircle ");
	int r=3; int pi=3;
	int c=pi*r*r;
	return c;
	}   
}

