package com.Evergent.Core.Java.Arrays;

public class DDArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pattern[][]=new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(pattern[i]==pattern[j]) {
					pattern[i][j]=7;
				}
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(pattern[i][j]+" ");
			}
			System.out.println();
		}

	}

}
