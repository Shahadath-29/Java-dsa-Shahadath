package com.demo;

public class Lcm {
	public static void main(String[] args) {
		int n1=20;
		int n2=30;
		int hcf=1;
		int min=0;
		
		if(n1<n2) {
			min=n1;
		}else {
			min=n2;
		}
		for(int i=min;i>=1;i--) {
			if(n1%i==0 && n2%i==0) {
				hcf=i;
				break;
			}
		}
		System.out.println("Hcf is :" + hcf);
		
		int lcm=(n1*n2)/hcf;
		System.out.println("lcm is :"+lcm);
	}
		
}


