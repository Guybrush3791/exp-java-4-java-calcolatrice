package org.lessons.java;

import org.lessons.java.utils.CalcoliHelper;

public class Main {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		double z = 30, q = 40;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("-----------------------");
		
		int res = CalcoliHelper.sum(x, y);
		System.out.println("sum: " + res);
		
		res = CalcoliHelper.mul(x, y);
		System.out.println("mul: " + res);
		
		res = CalcoliHelper.min(x, y);
		System.out.println("min: " + res);
		
		res = CalcoliHelper.max(x, y);
		System.out.println("max: " + res);
	}
}
