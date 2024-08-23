package com.Evergent.CoreJava.ExceptionHandling;

public class ArrayOutOfBoundException13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,34,5};
		try {
			System.out.println(num[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error:"+ e.getMessage());
		}

	}

}
