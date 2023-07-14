package com.springcoreb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("malik.xml");
		// this is firstBean class work name employee1
		Employee employee = (Employee) context.getBean("employee1");
		System.out.println(employee);
		// this is secondBean class work
		Employee employees = (Employee) context.getBean("employee2");
		System.out.println(employees);
		// this is your thirdBeen Class work
		Employee employeess = (Employee) context.getBean("employee3");
		System.out.println(employeess);

	}
}
