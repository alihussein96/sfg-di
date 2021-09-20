package com.example.di;

import com.example.di.controllers.ConstructorInjectedController;
import com.example.di.controllers.MyController;
import com.example.di.controllers.PropertyInjectedController;
import com.example.di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
		System.out.println("--------- Primary Beans");
		MyController controller = (MyController) ctx.getBean("myController"); // spring framework goes ahead and gets an instance of this object
		System.out.println(controller.sayHello());

		System.out.println("--------- Property");
		PropertyInjectedController propertyController = (PropertyInjectedController) ctx.getBean("propertyInjectedController"); // spring framework goes ahead and gets an instance of this object
		System.out.println(propertyController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectedController setterController = (SetterInjectedController) ctx.getBean("setterInjectedController"); // spring framework goes ahead and gets an instance of this object
		System.out.println(setterController.getGreeting());

		System.out.println("--------- Constructor");
		ConstructorInjectedController constructorController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController"); // spring framework goes ahead and gets an instance of this object
		System.out.println(constructorController.getGreeting());

	}

}
