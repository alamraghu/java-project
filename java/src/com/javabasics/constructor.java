package com.javabasics;

public class constructor {
	
	int x=10;
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		usage ref=new usage(7);
		System.out.println("main method ended");
	}
}


class usage{
	int x;
	usage(){
		//this(4);
		int x=20;
		System.out.println("x is"+x);
		System.out.println("no arg constructor");
	}
	usage(int x){
		this(7.5);
		//int x=30;
		System.out.println("x is"+x);
		System.out.println("int arg constructor");
	}
	
	usage(double x){
		this();
	//double x=40;
		System.out.println("x is"+x);
		System.out.println("double arg constructor");
	}
	
}
