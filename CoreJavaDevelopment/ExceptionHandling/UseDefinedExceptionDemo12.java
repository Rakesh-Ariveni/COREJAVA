package com.Evergent.CoreJava.ExceptionHandling;

class InvalidScoreException extends Exception
{
public InvalidScoreException(String message)
{
	super(message);
}
}
   public class UseDefinedExceptionDemo12
    {
       	public static void validateScore(int score) throws InvalidScoreException
       	{
       		if(score<0 || score>100)
       		{
       		 throw new InvalidScoreException("scorre must be between 0 and 100");
       		}
       		else
       		{
       			System.out.println("score is valid");
       		}
       	}
    
	public static void main(String[] args) 
	{
	    try
	    {
	    	validateScore(110);
	    }
	    catch(InvalidScoreException e)
	    {
	    	System.out.println("Caugh the Exp:"+e.getMessage());
	    	System.out.println(e);
	    }
	    System.out.println("Program Continues");
	}

}