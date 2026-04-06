package com.codegnan.dsa21022026.program;

public class FindCharacter {
	public static void main(String[] args) {
	 /*  String str = "Shahadath";
	   char a = 'h';
	   boolean isfound = false;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			  if(ch==a) {
				isfound=true; 
			
			}
		}
		if(isfound) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
		
	}*/
		String str = "Shahadath";
		   char a = 'h';
		  
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				  if(ch==a) {
					  System.out.println("Found at index: " + i);
					  return;
				
				}
			}
			System.out.println("Not Found");
	}

}
