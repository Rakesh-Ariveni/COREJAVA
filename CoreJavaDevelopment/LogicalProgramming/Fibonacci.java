package com.Evergent.CoreJava.LogicalProgramming;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1;
		System.out.print(a+" "+b);
		for(int i=2;i<10;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		System.out.println();
	}

}
