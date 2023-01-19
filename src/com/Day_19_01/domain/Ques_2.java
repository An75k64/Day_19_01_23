package com.Day_19_01.domain;

import java.util.Scanner; 

public class Ques_2 {

	public static void main(String[] args) {  
		int n, digit, sum = 0;  
		Scanner s = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		n = s.nextInt();  
		while(n > 0) {
			digit = n % 10;
			sum = sum + digit;
			n = n / 10;  
		}
		System.out.println("Sum of Digits: "+sum);  		  
	
	}

}
