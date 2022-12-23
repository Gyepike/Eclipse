package com.anti.codegym;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);	
			BufferedReader bufferedReader = Files.newBufferedReader(Path.of(scanner.nextLine()))) 
		{
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Something went wrong : " + e);
		}
	}
}