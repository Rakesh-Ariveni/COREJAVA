package com.Evergent.CoreJava.Strings;

public class StringBuilderExamples2 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			StringBuilder sb=new StringBuilder("Hello");
			System.out.println("Initial string:"+sb);
			sb.append("world");
			System.out.println("after append:"+sb);
			sb.insert(6,  "Beautiful");
			System.out.println("after insert:"+sb);
			sb.replace(0, 5, "Hi");
			System.out.println("after replace:"+sb);
			sb.delete(0, 3);
			System.out.println("after delete:"+sb);
			sb.reverse();
			System.out.println("after reverse:"+sb);
		}

}
