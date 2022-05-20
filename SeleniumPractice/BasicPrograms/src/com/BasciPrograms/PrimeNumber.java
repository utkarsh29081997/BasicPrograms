package com.BasciPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int num =23;
		boolean flag = false;
		for (int i=2;i<=num;i++) {
			if(num%i==0) {
				break;
			}
			else {
				flag =true;
			}
		}
		if(flag) {
			System.out.println("Prime Number "+flag);
		}
	}

}
