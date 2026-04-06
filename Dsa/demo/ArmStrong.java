package com.demo;

public class ArmStrong {
public static void main(String[] args) {
		
		int original = 153;
		int n = original;
		int sum=0;
		while(n!=0) {
			 int digit=n%10;
			 sum=sum+digit*digit*digit;
			 n=n/10;
		}
		if(original==sum) {
			System.out.println("it is Armstrong");
		}
		else {
			System.out.println("it is not Armstrong");
		}
	}

}
