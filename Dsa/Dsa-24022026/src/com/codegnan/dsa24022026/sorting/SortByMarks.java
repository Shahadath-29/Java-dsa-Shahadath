package com.codegnan.dsa24022026.sorting;

public class SortByMarks {
	public static void main(String[] args) {
		
		Student st1 = new Student("Shahadath", 90);
		Student st2 = new Student("Akshay", 80);
		Student st3 = new Student("Anuj", 40);
		Student st4 = new Student("Vignesh", 70);
		
		Student[] arr = {st1,st2,st3,st4};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j].marks>arr[j+1].marks) {
					Student temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(Student st:arr) {
			st.display();
		}
		
	}

}
