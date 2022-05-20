package com.BasciPrograms;

public class Fibbonachi {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int newNum = 0;
		
		System.out.println(a);
		
		while(newNum<=10) {
			
			newNum = a+b;
			System.out.println(newNum);
			a=b;
			b=newNum;
		}

	}

}
