package com.Evergent.CoreJava.ExceptionHandling;

class InsufficientFundsException extends Exception
{
public InsufficientFundsException(String message)
{
	super(message);
}
}
   public class UseDefinedExceptionDemo11
    {
       	public static void withdraw(double amount) throws InsufficientFundsException
       	{
       		double balance=50000;
       		if(amount>balance)
       		{
       		 throw new InsufficientFundsException("Insufficient funds for withdrawl");
       		}
       		else
       		{
       			System.out.println("withdraw successful");
       		}
       	}
    
	public static void main(String[] args) 
	{
	    try
	    {
	    	withdraw(600);
	    }
	    catch(InsufficientFundsException e)
	    {
	    	System.out.println("Caugh the Exp:"+e.getMessage());
	    	System.out.println(e);
	    }
	    System.out.println("Program Continues");
	}

}