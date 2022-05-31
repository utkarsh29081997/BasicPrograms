package com.BasciPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrangeAlterPositiveNegativeNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, -1, -2, -4, 6, -7 };
		int z = 0;
		int countOfPositive = 0;
		int countOfNegative = 0;

		// Trying to find out the length of array to store positive and negative values in different array's
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] > 0) {
				countOfPositive++;
			} else if (a[i] < 0) {
				countOfNegative++;
			}
		}

		System.out.println(countOfNegative + " " + countOfPositive);

		int b[] = new int[countOfPositive];
		int c[] = new int[countOfNegative];
		int d[] = new int[a.length];
		
		// Segregating the arrays and filling up the arrays based on positive and negative values 
		int countArrayNegative = 0;
		int countArrayPositive = 0;
		
		for (int j = 0; j <= a.length - 1; j++) {
			if (a[j] > 0) {
				z = a[j];
				b[countArrayPositive] = z;
				countArrayPositive++;
			} else if (a[j] < 0) {
				z = a[j];
				c[countArrayNegative] = z;
				countArrayNegative++;
			}
		}

		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		// Filling up the new array with alternate values 
		int count = 0;
		for (int k = 0; k <= a.length - 1; k++) {
			if (b.length == c.length) {
				d[k] = b[count];
				d[++k] = c[count];
				count++;
			} else {
				System.out.println("Here");
			}
		}
		System.out.println(Arrays.toString(d));
	}

}
