package com.Evergent.Core.Java.Arrays;

public class DDArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array= new int[5][5];
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                array[i][j] = i * 5 + j + 1;
            }
        }
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); 
        }

	}

}
