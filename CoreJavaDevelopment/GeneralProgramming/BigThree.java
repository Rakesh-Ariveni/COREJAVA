package com.Evergent.CoreJava.GeneralProgramming;
public class BigThree {

	public static void main(String[] args) {
		int a=10, b=15, c=12;
		if(a>=b && b>=c) {
			System.out.println("a is big");
		}else if(b>=a && b>=c) {
			System.out.println("b is big");
		}else {
			System.out.println("c is big");
		}
	}

}
