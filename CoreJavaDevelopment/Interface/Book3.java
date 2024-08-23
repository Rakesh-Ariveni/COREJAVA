package com.Evergent.CoreJava.Interface;

public class Book3 implements Interface1, Interface2{
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
	public void newBook() {
		System.out.println("new book");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book3 b=new Book3();
		b.bookAuthor();
		b.bookTitle();
		b.bookPrice();
		b.newBook();

	}

}
