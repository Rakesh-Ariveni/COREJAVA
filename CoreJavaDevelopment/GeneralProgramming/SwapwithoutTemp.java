package com.Evergent.CoreJava.GeneralProgramming;

public class SwapwithoutTemp {

	public static void main(String[] args) {
		int a=100, b=200;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
}
