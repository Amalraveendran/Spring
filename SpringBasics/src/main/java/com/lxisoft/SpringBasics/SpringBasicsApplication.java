package com.lxisoft.SpringBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearch search=new BinarySearch(new QuickSort());
		int[] num={1,2,9,8,7};
		System.out.println(search.binarySearch(num,7));
	}

}
