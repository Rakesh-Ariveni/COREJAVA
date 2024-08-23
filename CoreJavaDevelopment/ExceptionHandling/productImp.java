package com.Evergent.CoreJava.ExceptionHandling;
class ProductNotFoundException extends Exception{

	public ProductNotFoundException(String message) {
		System.out.println("Hello:"+message);
	}
}
public class productImp{
	int pno=105;
	public void myData() throws ProductNotFoundException{
		if(pno>100) {
			throw new  ProductNotFoundException("there is no product");
		}else {
			System.out.println("Product are there");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			productImp p=new productImp();
			p.myData();
		}
		catch( ProductNotFoundException e) {
			System.out.println(e);
		}
	}
}