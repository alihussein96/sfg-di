package com.example.di;

import com.example.di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController"); // spring framework goes ahead and gets an instance of this object
		String myGreeting = controller.sayHello();
		System.out.println(myGreeting);
	}

}
