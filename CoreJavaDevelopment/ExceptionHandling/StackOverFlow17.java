package com.Evergent.CoreJava.ExceptionHandling;

public class StackOverFlow17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			recursiveMethod();
		}catch(StackOverflowError e) {
			System.out.println("caught:"+e.getMessage());
		}

	}
	public static void recursiveMethod() {
		recursiveMethod();
	}

}
