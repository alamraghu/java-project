package com.javabasics;

public class pen {
	
	String inkcolor;
	
	pen(String inkcolor)
	{
		this.inkcolor=inkcolor;
		System.out.println("creating "+inkcolor +"color");
	}

	void write()
	{
		System.out.println("writing----------");
	}
}
