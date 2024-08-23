package com.Evergent.CoreJava.Abstract;

public class ProductImp3 extends Product{
	
	public ProductImp3()
	{
		System.out.println("subclass constructor");
	}
	public void newProduct() {
		System.out.println("my new product");
	}
	public void show() {
		System.out.println("local methods");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImp3 p1=new ProductImp3();
		p1.show();
		p1.newProduct();
		p1.allProducts();

	}

}
