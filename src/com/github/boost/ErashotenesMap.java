package com.github.boost;

import java.util.HashMap;
import java.util.Map;

public class ErashotenesMap {

	public static void main(String[] args) {
		
	}
		static void findPrimeNumber(int n) {
			
			Map<Integer, Boolean> numbers = new HashMap<Integer, Boolean>();
			for(int i= 0; i<n; i++) {
				numbers.put(i, true);
			}
			
			for(int j=2; j<n; j++) {
				if(numbers.get(j) == true) {
					for(int i = j*2; j<n; i+=j) {
						numbers.put(i, false);
					}
				}
			}
		}

	}


