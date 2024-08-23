package com.Evergent.Core.Java.Arrays;

public class DDArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int size = 5; // Define the size of the 2D array
        int[][] pattern = new int[size][size]; // Create a 2D array

        // Fill the array with the desired pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {
                    // For the first and last rows
                    pattern[i][j] = 7;
                } else if (j == 0 || j == size - 1) {
                    // For the first and last columns
                    pattern[i][j] = 1;
                } else if (i == size / 2 || j == size / 2) {
                    // For the middle row and column
                    pattern[i][j] = 7;
                }else {
                	pattern[i][j]=1;
                }
            }
        }

        // Print the pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}