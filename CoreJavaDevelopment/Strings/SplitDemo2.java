package com.Evergent.CoreJava.Strings;

public class SplitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is a Programming Language";
		String[] words=str.split(" ");
		for(String w:words) {
			System.out.println(w);
		}
	}

}
