package com.aruna;

public class Operations {

	public void sum(int a,int b)
	{
		int add=a+b;
		System.out.println(" the sum is: " + add);
	}
	public void sub(int a,int b)
	{
		int minus=a-b;
		System.out.println(" the sub is: " + minus);
	}
	
	public static void main(String[] args) {
		Operations op=new Operations();
		
		op.sum(10, 20);
		op.sum(20,5);
		
		op.sub(10, 2);
		
	}

}
