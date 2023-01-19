package com.Day_19_01.domain;

public class Ques_3 {

	public static void main(String[] args) {
		  int [] arr ={34, 21, 45, 12, 65, 50};  
	      int max = arr[0];
	      int c=0;
	      for (int i = 0; i < arr.length; i++) {  
	            if(arr[i] > max)  
	            max = arr[i]; 
	            c=i;
	        }  
	      c=c-1;
	      System.out.println("Largest element present in given array is " + max+ " at index "+c);
	        
	}

}
