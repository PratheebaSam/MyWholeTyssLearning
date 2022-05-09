package com.assignment.matrixprograms;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		int[][] array;
		int[][] result;
		int number, row, column;

		Scanner sc = new Scanner(System.in);
		System.out.println("Matrix Values");
		System.out.print("enter the row size :");
		row = sc.nextInt();
		System.out.print("enter the column size :");
		column = sc.nextInt();
		array = new int[row][column];

		System.out.println("Enter Matrix Values :");
		for (int i = 0; i < row; i++) {
			System.out.println("Enter row " + (i + 1));
			for (int j = 0; j < column; j++) {
				number = sc.nextInt();
				array[i][j] = number;
			}
		}
		result = new int[column][row];
		System.out.println("Matrix Transpose");
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				result[i][j] = array[j][i];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
