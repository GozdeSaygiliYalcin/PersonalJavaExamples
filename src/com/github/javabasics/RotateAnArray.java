package com.github.javabasics;

import java.util.Arrays;

public class RotateAnArray {
	
	/*
	 * Problem: Rotate an array of n elements to the right by k steps. For example, 
	 * with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
	 * How many different ways do you know to solve this problem?
	 * n elemanlı bir dizinin k adım kadar döndürülmesi
	 */
	
	public static void rotate1(int [] nums, int k) { //bu çözümde yeni bir array yaratıp system array copy ile bu arrayi değiştiriyoruz
		
		   if(k > nums.length)
			      k=k%nums.length;
			   int[] result = new int[nums.length];
			   for(int i=0; i < k; i++){
			      result[i] = nums[nums.length-k+i];
			}
			   int j=0;
			   for(int i=k; i<nums.length; i++){
			      result[i] = nums[j];
			j++; }
			   System.arraycopy(result, 0, nums, 0, nums.length);
			   System.out.println(Arrays.toString(result));
	}
	
	public static void rotate2(int[] arr, int order) { //ikinci çözüm o(1) spacede çözülüyor. bubble rotate metodu kullanılıyor
		  if (arr == null || order < 0) {
		     throw new IllegalArgumentException("Illegal argument!");
		     
		  }
		  for (int i = 0; i < order; i++) {
			  for (int j = arr.length - 1; j > 0; j--) {
				  
			       int temp = arr[j];
			       arr[j] = arr[j - 1];
			       arr[j - 1] = temp;
			    } 
		  }
	}

	public static void main(String[] args) {
		
		int[] nums1 = {2,3,4,5,6,3,9,0,7,12};
		int[] nums2 = {2,3,4,5,6,3,9,0,7,12};
		
		rotate1(nums1, 1);
		rotate1(nums2, 1);

	}

}
