package com.Everegnt.CoreJava.Final;

class Myclass1{

	final public void myProducts() {
		System.out.println("all products");
	}
}
public class FinalDemo3 extends Myclass1{
	final String ename="India";

	public void myProduct() {
		System.out.println("new products");
	}
	public void myData() {
		System.out.println("ename");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo3 fd1=new FinalDemo3();
		fd1.myData();
		fd1.myProducts();
		fd1.myProduct();
	}

}
