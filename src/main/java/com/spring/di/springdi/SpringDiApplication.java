package com.spring.di.springdi;

import com.spring.di.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String message = myController.sayHello();

		System.out.println(message);
	}

}
