package com.codegnan.dsa12032026.program;

public class ReverseStringUsingRec {
	public static String RevStr(String str) {
		if(str.length()<=1) {
			return str ;
		}
		return RevStr(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println(RevStr("hello"));
	}

}
