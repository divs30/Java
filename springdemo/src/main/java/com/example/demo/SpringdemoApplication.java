package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringdemoApplication.class, args);
		
		SampleService service = ctx.getBean("sampleService", SampleService.class);
		service.insert();
		
//		String[] names = ctx.getBeanDefinitionNames();
//		for(String name : names) {
//			System.out.println(name);
//		}
	}

}
