package com.lxisoft.SpringBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearch search=applicationContext.getBean(BinarySearch.class);
		//BinarySearch search=new BinarySearch(new QuickSort());
		int[] num={1,2,9,8,7};
		int result=search.binarySearch(num,7);
		System.out.println(result);
	}

}
