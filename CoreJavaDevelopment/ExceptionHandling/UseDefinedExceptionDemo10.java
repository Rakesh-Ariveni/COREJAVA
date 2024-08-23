package com.Evergent.CoreJava.ExceptionHandling;

class InvalidAgeException extends Exception
{
public InvalidAgeException(String message)
{
	super(message);
}
}
   public class UseDefinedExceptionDemo10
    {
       	public static void CheckAge(int age) throws InvalidAgeException
       	{
       		if(age<18)
       		{
       		 throw new InvalidAgeException("Age must be 18");
       		}
       		else
       		{
       			System.out.println("You can Vote: ");
       		}
       	}
    
	public static void main(String[] args) 
	{
	    try
	    {
	    	CheckAge(16);
	    }
	    catch(InvalidAgeException e)
	    {
	    	System.out.println("Caugh the Exp:"+e.getMessage());
	    	System.out.println(e);
	    }
	    System.out.println("Program Counts");
	}

}