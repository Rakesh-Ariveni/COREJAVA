package com.Evergent.CoreJava.Strings;

public class StringPer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			sb.append(ch);
			System.out.println(ch);
		}
	}
}
