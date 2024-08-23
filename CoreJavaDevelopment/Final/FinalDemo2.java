package com.Everegnt.CoreJava.Final;

class Myclass{

	final public void myProducts() {
		System.out.println("all products");
	}
}
public class FinalDemo2 extends Myclass{
	final String ename="India";

	public void myProduct() {
		System.out.println("new products");
	}
	public void myData() {
		System.out.println("ename");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo2 fd1=new FinalDemo2();
		fd1.myData();
		fd1.myProducts();
		fd1.myProduct();
	}

}
