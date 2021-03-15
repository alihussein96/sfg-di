package com.spring.di.springdi;

import com.spring.di.springdi.controllers.ConstructorInjectedController;
import com.spring.di.springdi.controllers.MyController;
import com.spring.di.springdi.controllers.PropertyInjectedController;
import com.spring.di.springdi.controllers.SetterInjectedController;
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

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println("-----------Constructor Controller:");
		System.out.println(constructorInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("-----------Setter Controller:");
		System.out.println(setterInjectedController.getGreeting());

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("-----------Property Controller:");
		System.out.println(propertyInjectedController.getGreeting());

	}

}
