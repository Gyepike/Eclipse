package com.anti;

import java.util.Arrays;

public class Foo {
	private int a;
	private String b;
	private double[] c;
	public int getA() {
		return a;
	}
	public String getB() {
		return b;
	}
	public double[] getC() {
		return c;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(String b) {
		this.b = b;
	}
	public void setC(double[] c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Foo [a=" + a + ", b=" + b + ", c=" + Arrays.toString(c) + ", getA()=" + getA() + ", getB()=" + getB()
				+ ", getC()=" + Arrays.toString(getC()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
