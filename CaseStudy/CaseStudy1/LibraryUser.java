package com.Evergent.CoreJava.Rakesh.CaseStudy1;

public interface LibraryUser {
	public void registerAccount(int age) throws InvalidAgeException;
	public void requestBook(String btype) throws InvalidBookException;
	public void UserLogin(String name) throws UserNotFoundException;
}
