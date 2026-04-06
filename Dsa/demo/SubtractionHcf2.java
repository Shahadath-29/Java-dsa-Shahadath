package com.demo;

public class SubtractionHcf2 {
  public static void main(String[] args) {
	int a=15;
	int b=10;
	int n=a;
	int m=b;
	
	while(a!=b) {
		if(a>b) {
			a=a-b;
		}else {
			b=b-a;
		}
	}
	System.out.println("hcf :" +a);
	int lcm=(n*m)/a;
	System.out.println("lcm is :"+lcm);
  }
}
