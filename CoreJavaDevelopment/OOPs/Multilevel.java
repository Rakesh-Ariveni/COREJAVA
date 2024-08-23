package com.Evergent.CoreJava.OOPs;

public class Multilevel {
	
	public void show() {
		System.out.println("multilevel");
	}
}
class multi extends Multilevel{
	public void think() {
		System.out.println("think properly");
	}
		
}
class level extends multi
{
	public void write() {
		System.out.println("write well");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		level l=new level();
		l.show();
		l.write();
		l.think();
		
		
	}
}