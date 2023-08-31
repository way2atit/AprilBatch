package com.july;
  //      child       parent
public class B extends A
{
	
	public void m1()
	{
		super.i =100;	
		
		A e1 = new A();
		e1.i =90;
		e1.j =20;
		
		B b = new B(); // using object 
		b.i =10;
		
		
	}

}
