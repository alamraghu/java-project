package com.javabasics;

public class editstory {

	void main1(storybook b1 ,pen p1 )
	{
		System.out.println("editing new story");
		for(int i=1;i<=b1.totalsheets;i++)
		{
			b1.turnpage();
			p1.write();
		}
	}
}




