package com.Evergent.CoreJava.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompileTimeFileDemo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("c:/mydata/myinfo.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();

	}
	catch(FileNotFoundException e) {
		System.out.println("File not found:"+ e.getMessage());
		e.printStackTrace();
	}
	}
}
