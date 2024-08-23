package com.Evergent.CoreJava.GeneralProgramming;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int dayName=3;
	        switch (dayName) {
	            case 1:
	                System.out.print("Monday");
	                break;
	            case 2:
	            	System.out.print ("Tuesday");
	                break;
	            case 3:
	            	System.out.print("Wednesday");
	                break;
	            case 4:
	            	System.out.print ("Thursday");
	                break;
	            case 5:
	            	System.out.print("Friday");
	                break;
	            case 6:
	            	System.out.print("Saturday");
	                break;
	            case 7:
	            	System.out.print ("Sunday");
	                break;
	            default:
	            	System.out.print( "null"); // Invalid day number
	                break;
	        }
	        System.out.print(dayName);

	}

}
