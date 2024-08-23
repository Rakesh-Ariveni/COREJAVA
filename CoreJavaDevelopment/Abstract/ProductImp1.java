package com.Evergent.CoreJava.Abstract;

public class ProductImp1 extends Product{
	
	public void newProduct()
	{
		System.out.println("my new product");
	}
	public void show() {
		System.out.println("local methods");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImp1 p1=new ProductImp1();
		p1.show();
		p1.newProduct();
		p1.allProducts();

	}

}
