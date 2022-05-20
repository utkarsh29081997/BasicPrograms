package com.BasciPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 12548;
		int reverese = 0;
		int temp;
		while(num>0) {
			
			temp = num%10;
			reverese = reverese*10+temp;
			num = num/10;
		}
		System.out.println(reverese);
	}

}
