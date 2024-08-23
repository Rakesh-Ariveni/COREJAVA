package com.Evergent.CoreJava.ImmutableString;

public final class PersonImmutable2 {
	private final String value;
	
	public PersonImmutable2(String value) {
		this.value=value;
	}
	public String toString() {
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method st
		PersonImmutable2 str=new PersonImmutable2("Raju, String");
		System.out.println(str.toString());
	}
	

}
