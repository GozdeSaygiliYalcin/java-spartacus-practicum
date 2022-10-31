package com.gozdesy.task3;

import java.util.Arrays;

public class SequenceOfArray {
	
	/**
	 * Find to sequence of an array
	 */
	
	public static void countSequence(int[]arr, int n) {
		
		n = arr.length;
		boolean [] visited = new boolean [n];
		Arrays.fill(visited, false);
		
		for(int i=0; i<n; i++) {
			if(visited[i] == true) {
				continue;
			}
		    int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count +" time(s) ");
	    }
	}
	// another method to find sequence
	public static void countAnotherSequence(int[]list) {
		
		int counter = 1;
		
		for (int i : list) {
			for (int j = i+1; j < i; j++) {
				if(list[i] == list[j]) {
					counter++;
					System.out.println(counter);
			}
			System.out.println(list[i]+counter);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,312,31,423,523,5,23,312,2,5};
	    countSequence(arr, arr.length);
	    
	    int [] list = {10,20,20,10,10,20,5,20};
		countAnotherSequence(list);
	
	}

}
