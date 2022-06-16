package com.github.boost;

import java.util.Arrays;

public class FrequencyOfElements {

	public static void main(String[] args) {
		
	
		int [] list = {10,30,20,10,10,30,20,20,20,40}; //aşağıda sadece birer defa yazdırmak istiyorum
		int count = 0;
		
		Arrays.sort(list);
		for (int i=0; i<list.length; i++) {
			for(int j=i+1; j<list.length; j++) {
				if(list[i] == list[j]) {
					count++;	
					}
				}
				System.out.println("Number of element "+list[i]+": " +count);	
		}
	}
}


