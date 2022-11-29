package com.anti;

public class codeGym {

	public static void main(String[] args) {
		
      //System.out.println("Hello");
        
      int firstInt = 7;
      int secondInt = 8;
      
      int sum = add(firstInt, secondInt);
      
      System.out.println("Sum is : "+ sum);
      
      for (int i = 0; i < 10; i++) {
		   System.out.println("Hello !!");
      	}
	}

	private static int add(int firstInt, int secondInt) {
		int sum = firstInt + secondInt+1;
		return sum;
	}

}
