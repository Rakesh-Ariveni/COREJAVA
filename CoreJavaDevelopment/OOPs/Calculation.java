package com.Evergent.CoreJava.OOPs;

public class Calculation {
	
	int a=10, b=20, c;
	
	public void Addition() {
		c=a+b;
		System.out.print("Addition:"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal=new Calculation();
		cal.Addition();
		
	}

}
