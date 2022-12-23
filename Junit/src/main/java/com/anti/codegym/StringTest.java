package com.anti.codegym;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringTest {

	
	public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        //write your code here
       // BufferedReader puffer = new BufferedReader(new InputStreamReader(System.in));
        
       // String in = puffer.readLine();
    	String in = "The truth is in wine.";
        String out = "";
        String out2 = "";
        
        for(int i=0; i < in.length(); i++ )
        {
            if(isVowel(in.charAt(i))) {
                out += in.charAt(i)+" ";
            }
            else if (in.charAt(i) != ' '){
                 out2 += in.charAt(i);
            }
        }
         out2 += " ";
        System.out.println(out);
        System.out.println(out2);
        
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // Convert to lowercase
        for (char vowel : vowels) {  // Look for vowels in the array
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }

}
