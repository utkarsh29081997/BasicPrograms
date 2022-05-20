package com.BasciPrograms;


interface abc {
	
}

public class Sample {
	static int static_value = 01;
	void sample_01() {
		static_value = 99;
		System.out.println("Method With Static Variable value change "+ static_value);
	}
	

	public static void main(String[] args) {
		Sample s = new Sample();
		s.sample_01();	
		}
}

