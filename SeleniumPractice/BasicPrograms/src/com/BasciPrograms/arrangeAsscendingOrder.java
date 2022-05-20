package com.BasciPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class arrangeAsscendingOrder {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Bpple");
		list.add("Bzo");
		list.add("Bebra");
		list.add("Bango");
		list.add("Banana");

		System.out.println(list);
		TreeSet<String> tree = new TreeSet<>(list);
		// tree.addAll(list);
		System.out.println(tree);
		Collections.sort(list);
		System.out.println(list);

	}

}
