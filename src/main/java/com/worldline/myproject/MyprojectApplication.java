package com.worldline.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyprojectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(MyprojectApplication.class, args);
		Student s=ctx.getBean(Student.class);
		System.out.print(s);
	}

}
