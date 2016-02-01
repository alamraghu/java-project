package com.javabasics;

public class main {
	public static void main(String[] args) {
		System.out.println("main method started");
		editstory e1=new editstory();
		storybook s1=new storybook(10);
		pen p1=new pen("blue");
		e1.main1(s1, p1);
	}

}
