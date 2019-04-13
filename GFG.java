package com.gem;
// Java program to demonstrate 
// How to sort ArrayList in descending order 

import java.util.*; 

public class GFG { 
	public static void main(String args[]) 
	{ 

		// Get the ArrayList 
		ArrayList<String> 
			list = new ArrayList<String>(); 

		// Populate the ArrayList 
		list.add("Geeks"); 
		list.add("For"); 
		list.add("ForGeeks"); 
		list.add("GeeksForGeeks"); 
		list.add("A computer portal"); 

		// Print the unsorted ArrayList 
		System.out.println("Unsorted ArrayList: "
						+ list); 

		// Sorting ArrayList in descending Order 
		// using Collection.sort() method 
		// by passing Collections.reverseOrder() as comparator 
		Collections.sort(list, Collections.reverseOrder()); 

		// Print the sorted ArrayList 
		System.out.println("Collections.reverseOrder()"+Collections.reverseOrder());
		System.out.println("Sorted ArrayList "
						+ "in Descending order : "
						+ list); 
	} 
} 
