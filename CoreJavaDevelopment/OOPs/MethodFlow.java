package com.Evergent.CoreJava.OOPs;

public class MethodFlow {
	
	//No arguments with no return type
	public void display() {
		System.out.println("Hello");
	}
	// arguments with no return type
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	// arguments with return type
	public int mul(int a, int b) {
		return(a*b);
	}
	//No arguments with return type
	public int myData() {
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFlow mf=new MethodFlow();
		mf.display();
		mf.add(5, 6);
		int t=mf.mul(4, 5);
		System.out.println(t);
		int s=mf.myData();
		System.out.println(s);
	}

}
