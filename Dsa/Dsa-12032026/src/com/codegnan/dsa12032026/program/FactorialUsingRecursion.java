package com.codegnan.dsa12032026.program;

public class FactorialUsingRecursion {
	public static int factUsingRec(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*factUsingRec(n-1);
		}
	
	}
	public static void main(String[] args) {
		System.out.println(factUsingRec(5));
	}

}
