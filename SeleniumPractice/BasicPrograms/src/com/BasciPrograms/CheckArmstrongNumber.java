package com.BasciPrograms;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		
		int number = 371;
		int check = number;
		int reverse = 0;
		int temp;
		int arm = 0;
		while(number>0) {
			
			temp = number%10;
			reverse = temp*temp*temp;
			arm = arm+reverse;
			number=number/10;
		}
		
		if(check==arm) {
			System.out.println("It is an ArmStrong Number "+arm);
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	
	
	}


}