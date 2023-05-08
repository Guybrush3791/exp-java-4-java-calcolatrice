package org.lessons.java.utils;

public class CalcoliHelper {

	private CalcoliHelper() {}
	
	public static int sum(int x, int y) {
		
		return x + y;
	}
	public static double sum(double x, double y) {
		
		return x + y;
	}
	public static int dif(int x, int y) {
		
		return x - y;
	}
	public static double dif(double x, double y) {
		
		return x - y;
	}
	public static int mul(int x, int y) {
		
		return x * y;
	}
	public static double mul(double x, double y) {
		
		return x * y;
	}
	public static int abs(int x) {
		
		return x < 0 ? -1 * x : x;
	}
	public static double abs(double x) {
		
		return x < 0 ? -1 * x : x;
	}
	public static int min(int x, int y) {
		
		return x > y ? y : x;
	}
	public static double min(double x, double y) {
		
		return x > y ? y : x;
	}
	public static int max(int x, int y) {
		
		return x > y ? x : y;
	}
	public static double max(double x, double y) {
		
		return x > y ? x : y;
	}
}
