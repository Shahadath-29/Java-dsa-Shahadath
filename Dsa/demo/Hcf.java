package com.demo;

public class Hcf {
	public static void main(String[] args) {
		int n1=20;
		int n2=30;
		int min=0;
		int hcf=1;
		
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
	}
		

}
