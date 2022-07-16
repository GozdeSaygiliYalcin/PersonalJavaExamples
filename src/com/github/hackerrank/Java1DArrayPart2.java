package com.github.hackerrank;

import java.util.Scanner;
/*
 * Java 1D Array (Part 2) solution
 */


public class Java1DArrayPart2 {

	public static void main(String[] args) {
	
			Scanner scanner = new Scanner(System.in);
	        int t = Integer.parseInt(scanner.nextLine());
	        for (int i = 0; i < t; i++) {
	            int n = scanner.nextInt();
	            int m = scanner.nextInt();
	            //System.out.println(n + " " + m);
	            int[] arr = new int[n];
	            for (int j = 0; j < n; j++) {
	                arr[j] = scanner.nextInt();
	            }
	            solve(n,m,arr);
	        }  
    }
		public static void solve(int n, int m, int[] arr) {
		    if (solve(n,m,arr,new boolean[n],0)) {
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		}
		
		public static boolean solve(int n, int m, int[] arr, boolean[] visited, int curr) {
		    if (curr + m >= n || curr + 1 == n) {
		        return true;
		    }
		    
		    boolean[] newVisited = new boolean[n];
		    for (int i = 0; i < n; i++) {
		        newVisited[i] = visited[i];
		    }
		    
		    boolean s = false;
		    if (!visited[curr+1] && arr[curr+1] == 0) {
		        newVisited[curr+1] = true;
		        s = solve(n,m,arr,newVisited,curr+1);
		    }
		    if (s) {
		        return true;
		    }
		    if (m > 1 && arr[curr+m] == 0 && !visited[curr+m]) {
		        newVisited[curr+m] = true;
		        s = solve(n,m,arr,newVisited,curr+m);
		    }
		    if (s) {
		        return true;
		    }
		    if (curr > 0 && arr[curr-1] == 0 && !visited[curr-1]) {
		        newVisited[curr-1] = true;
		        s = solve(n,m,arr,newVisited,curr-1); 
		    }
		    return s;
		}
}