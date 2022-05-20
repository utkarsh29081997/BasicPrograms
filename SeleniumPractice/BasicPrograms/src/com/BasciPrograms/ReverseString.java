package com.BasciPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Utkarsh Singh";
		char a[] = name.toCharArray();
		String reverse = "";
		String b[] = name.split(" ");
		String reverseOrder = "";
		
		for (int i = a.length - 1; i >= 0; i--) {
			reverse = reverse + a[i];
		}
		
		for(int j=b.length-1;j>=0;j--) {

			reverseOrder = reverseOrder+b[j];
		}

		System.out.println(reverse);
		System.out.println(reverseOrder);

	}
}
