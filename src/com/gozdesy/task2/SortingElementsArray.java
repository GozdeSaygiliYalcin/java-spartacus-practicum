package com.gozdesy.task2;

import java.util.Scanner;

public class SortingElementsArray {
	/**
	 * Java Program to sort the elements of 
	 * an array in ascending order
	 */
	
	public static int[] sortedArray (int[] arr) {
		int temp = 0;
		
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
        System.out.println();
        
        System.out.println("elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the elements of the array: ");
	    int number = input.nextInt();
	    
	    int[] arr = new int[number];
	    for(int i = 0; i < number; i++){
	        arr[i]=input.nextInt();
	    }
	    
	    System.out.println("elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
		
        sortedArray(arr);
	}
	

}
