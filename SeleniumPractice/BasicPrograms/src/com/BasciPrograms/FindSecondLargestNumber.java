package com.BasciPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		
		int num[] = {1,52,36,98,100,258};
		
		TreeSet<Integer> tree = new TreeSet<>();
		for(int n:num) {
			tree.add(n);
		}
		System.out.println(tree);
		List<Integer> list = new ArrayList<Integer>(tree);
		//list.addAll(tree);
		
		System.out.println(list.get((list.size()-2)));
		

	}

}
