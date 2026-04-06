package com.arrays;
import java.util.Arrays;
public class SumOfPair {
	public static void main(String[] args) {
		int arr[] = {2,6,5,9,7};
		int target =12;
		//bruteForce
		/*for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j] == target) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}*/
		
		//optimal approach
		Arrays.sort(arr);
		int j=arr.length-1;
		
		int left = 0, right = arr.length-1;
		while(left<right) {
			int sum = arr[left]+arr[right];
			if(sum==target) {
				System.out.println(arr[left]+" "+arr[right]);
				left++;
				right--;
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
			
		
		}
		
	}

}
