package com.codegnan.dsa12032026.program;

public class SumOfDigitUsingRec {
	public static int sumRec(int n) {
		if(n==0) {
			return 0;
		}
		return n%10 +sumRec(n/10);
	}
	public static void main(String[] args) {
		System.out.println(sumRec(1234));
	}

}
