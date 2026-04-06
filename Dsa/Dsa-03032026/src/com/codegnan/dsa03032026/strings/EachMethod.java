package com.codegnan.dsa03032026.strings;

public class EachMethod {
	public static void main(String[] args) {
		String name1="capgemini";
		String name2="capgemini";
		String name3="CAPGEMINI";
		String name4="sathya %s";
		String details="Name:%s Age:%d salary:%f Intial:%c";
		String name5= new String("Capgemini");
		String name6=" ";
		String name7="sathya";
		String name8="sathya soma";
		String name9="sathya prakash";
		
		System.out.println(name1.charAt(0));
		System.out.println(name1.length());
		System.out.println(name1.charAt(8));
		System.out.println(name1.codePointAt(0));
		System.out.println(name1.codePointBefore(1));
		System.out.println(name1.codePointCount(1, 4));
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.concat("india"));
		System.out.println(name1.contains("mini"));
		System.out.println(name1.contentEquals(name2));
		System.out.println(name1.endsWith("K"));
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name3));
		System.out.println(name4.formatted("soma"));
		System.out.println(details.formatted("sameer",23,890.890,'s'));
		System.out.println(name1.hashCode());
		System.out.println(name1);
		System.out.println(name1.indent(3));
		System.out.println(name1.indexOf('c'));
		System.out.println(name1.indexOf("mini"));
		System.out.println(name1.indexOf('i', 3));
		System.out.println(name1.indexOf("ini", 4));
		System.out.println(name5.intern()==name1);
		System.out.println(name6.isBlank());
		System.out.println(name6.isEmpty());
		System.out.println(name1.lastIndexOf('i'));
		System.out.println(name7.matches("[a-z]+"));
		System.out.println(name1.offsetByCodePoints(1, 4));
		System.out.println(name8.regionMatches(0, name9, 0, 6));
		System.out.println(name1.repeat(5));
		System.out.println(name1.replace('c', 's'));
		System.out.println(name1.replace("mini", "sathya"));
		System.out.println(name1.replaceFirst(name1, "welcome"));
		System.out.println(name1.startsWith("mini"));
		

           
		
		
	}

}
