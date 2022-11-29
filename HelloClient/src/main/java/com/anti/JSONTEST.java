package com.anti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class JSONTEST {

	private static void multiArray() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please provide line :");
		int line = scan.nextInt();

		int[][] multiArray = new int[line][];

		for (int i = 0; i < multiArray.length; i++) {

			System.out.println("Please provide array numbers :");
			int c = scan.nextInt();

			multiArray[i] = new int[c];

		}

		for (int i = 0; i < multiArray.length; i++) {

			for (int j = 0; j < multiArray[i].length; j++) {
				System.out.print(multiArray[i][j] + " ");
			}
			System.out.println();
		}

	}
	
	private static void middle() {
		int number = 13;
        
        int middle = (number % 2 == 0 ) ?  number / 2  : (number + 1)  / 2 ;
        
        System.out.println(middle);
	}

	public static char[][] chars = { { 'a', 'b', 'c', 'd', 'e', 'f' }, { 'j', 'h', 'i', 'j', 'k', 'l' },
			{ 'm', 'n', 'o', 'p', 'q', 'r' }, { 's', 't', 'u', 'v', 'w', 'x' } };

	private static void printArray() {
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars[i].length; j++) {
				System.out.print(chars[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void help() {
		int[][] result = new int[10][];

		for (int i = 0; i < result.length; i++) {
			result[i] = new int[i + 1];
		}

		for (int i = 0; i < result.length; i++) {

			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = i + j;
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] multiArray;
	
	public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 8;
	public static void main(String[] args) throws IOException {
		
		
		System.out.println(Arrays.binarySearch(array, element) );

	    boolean present = (Arrays.binarySearch(array, element) >= 0 ) ? true : false ; 
        System.out.println(present);
	}

	

}
