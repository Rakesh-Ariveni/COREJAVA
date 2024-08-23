package com.Evergent.CoreJava.JavaBeans;

public class ProductImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product(100, "Laptop", 50000);
		System.out.println("pno:"+p.getPno());
		System.out.println("pname:"+p.getPname());
		System.out.println("price:"+p.getPrice());
	}

}
