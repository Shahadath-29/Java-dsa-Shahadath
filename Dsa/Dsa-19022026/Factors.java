package com.demo;

public class Factors {
	public static void main(String[] args) {
	int n=24;
	//for(int i=1;i<=n;i++) {
	for(int i=1;i<=n/2;i++) {  //optimization :1 
		if(n%i==0) {
			System.out.println("Factors of "+ n +" is: " +i);	
			}
	}

  }
}
