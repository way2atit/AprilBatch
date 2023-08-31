package com.july;

public class Test2 extends Test
{
	int k; //I
	
 //   AM      class name
	public Test2() 
	{
		super("Hello");
		super.a=1;
		this.k=100;
		super.b =2;
		System.out.println("no args --child");
	}
	
	
	public  void m1() // object is mand-- refr  10101
	{
		super.a=1;
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2(); // refr  =100101 --this
		t.m1();
	}
	
	

}
