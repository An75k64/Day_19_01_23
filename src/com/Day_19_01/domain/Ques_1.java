package com.Day_19_01.domain;

import java.util.Scanner;

public class Ques_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number to convert into binary: ");
        n = s.nextInt();
		System.out.println(Integer.toBinaryString(n));  
	}

}
