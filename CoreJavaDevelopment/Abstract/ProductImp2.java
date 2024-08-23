package com.Evergent.CoreJava.Abstract;

public class ProductImp2 extends Product{
	
	public void newProduct()
	{
		System.out.println("my new product");
	}
	public void show() {
		System.out.println("local methods");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImp2 p2=new ProductImp2();
		p2.newProduct();
		p2.allProducts();

	}

}
