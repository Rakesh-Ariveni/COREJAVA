package com.Evergent.CoreJava.Interface;

public class Book2 implements Interface1{
	public void bookTitle()
	{
		System.out.println("Core Java");
	}
	public void bookAuthor() {
		System.out.println("Oracle");
	}
	public void bookPrice() {
		System.out.println("Rs. 550");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book2 b=new Book2();
		b.bookAuthor();
		b.bookTitle();
		b.bookPrice();

	}

}
