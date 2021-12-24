package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.beans.MessageBean;

public class SeconExample {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		
		MessageBean ob = (MessageBean) container.getBean("constrDImsg");
		
		System.out.println(ob.getMessage()+" "+ob.getSender()+" "+ob.getReceiverInfo());

	}

}
