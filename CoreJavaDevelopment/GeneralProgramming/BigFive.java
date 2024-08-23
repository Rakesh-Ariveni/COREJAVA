package com.Evergent.CoreJava.GeneralProgramming;

public class BigFive {

	public static void main(String[] args) {
		int a=12, b=15, c=18, d=10, e=50;
		if(a>b && a>c && a>d && a>e) {
			System.out.println("a is big");
		}else if(b>a && b>c && b>d && b>e) {
			System.out.println("b is big");
		}else if(c>a && c>b && c>d && c>e) {
			System.out.println("c is big");
		}else if(d>a && d>b && d>c && d>e) {
			System.out.println("d is big");
		}else {
			System.out.println("e is big");
		}

	}

}
