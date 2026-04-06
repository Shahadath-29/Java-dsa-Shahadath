package com.demo;
import java.util.Scanner;
public class PerfectNumber {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(num==sum) {
			System.out.println("It is a Perfect Number");
		}else {
			System.out.println("It is a Not Perfect Number");
		}
  }
}
