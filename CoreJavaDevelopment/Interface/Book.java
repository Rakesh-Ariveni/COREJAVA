package com.Evergent.CoreJava.Interface;

public class Book implements Interface1{
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
	public void show() {
		System.out.println("show book");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		b.bookAuthor();
		b.bookTitle();
		b.bookPrice();
		b.show();

	}

}
