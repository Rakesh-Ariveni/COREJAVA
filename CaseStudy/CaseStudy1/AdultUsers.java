package com.Evergent.CoreJava.Rakesh.CaseStudy1;


public class AdultUsers implements LibraryUser
{
	public void registerAccount(int age) throws InvalidAgeException
	{
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			throw new InvalidAgeException("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	public void requestBook(String btype) throws  InvalidBookException
	{
		     if(btype.equals("Fiction"))
		     {
		    	 System.out.println("Book Issued successfully, please return the book within 7 days");
		     }
		     else
		     {
		    	 throw new  InvalidBookException("Oops, you are allowed to take only kids books");
		     }
	}
	public void UserLogin(String name) throws UserNotFoundException
	{
		if(name.equals("Rakesh"))
		{
			System.out.println("Successfully login");
		}
    	else
    	{
    		throw new UserNotFoundException("Enter correct credinals");
    	}
		  
	}
}