package com.Evergent.CoreJava.Rakesh.CaseStudy1;

public class KidUsers implements LibraryUser
{
	public void registerAccount(int age) throws InvalidAgeException
	{
	     if(age<12)
	     {
	    	 System.out.println("You have successfully registered under a Kids Account");
	     }
	     else
	     {
	    	 throw new InvalidAgeException("Sorry, Age must be less than 12 to register as a kid");
	     }
	}
	   public void requestBook(String btype) throws InvalidBookException
	   {
		     if(btype.equals("Kids"))
		     {
		    	 System.out.println("Book Issued successfully, please return the book within 10 days");
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
	
	
	
	
	
