package com.anti.core.core.repo;

import java.util.ArrayList;

public class Testexception2 {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
          //  System.out.println(e);
        	e.getStackTrace();
        }
    }
}
