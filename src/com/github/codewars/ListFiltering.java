package com.github.codewars;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
	
	public static List<Object> filterList(final List<Object> list) {
	
	    return list.stream()
	    	      .filter(e -> e instanceof Integer)
	    	      .collect(Collectors.toList());
		}
	   

	public static void main(String[] args) {
		
		System.out.println(filterList(List.of(1, 2, "a", "b")));

	}

}
