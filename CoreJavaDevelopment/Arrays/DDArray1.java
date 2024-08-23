package com.Evergent.Core.Java.Arrays;

public class DDArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
        int[][] pattern = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pattern[i][j] = 7;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
