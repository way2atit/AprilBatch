package com.july;

public class Test {
	int a;  // I
	int b;
	
	
	public void m2(int a)  //local
	{
		this.a = a;
	}
	
	public Test() {
		System.out.println("no args --parent");
	}
	
	public Test(int i) {
		this("A");
		System.out.println("parm constr --parent"+i);
	}
	
	public Test(String i) {
		System.out.println("parm constr --parent"+i);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m2(40);
		System.out.println("value of a : "+t.a);
		
		Test2 t1 = new Test2();
		
		
	}
	
	

}
