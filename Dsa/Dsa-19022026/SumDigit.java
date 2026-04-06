package com.demo;

public class SumDigit {
	public int getSum(int n) {
		int sum=0;
		if(n<0) {
			n=-n;
		}
		else {}
		while(n!=0) {
			int lastdigit=n%10;
			sum=sum+lastdigit;
			n=n/10;
		}
		return sum;
	}
	
public static void main(String[] args) {
	
	SumDigit sd = new SumDigit();
	System.out.println("sum value is :"+sd.getSum(-123));
}

}
