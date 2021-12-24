package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.beans.MessageBean;


public class FirstExampleApplication {

	public static void main(String[] args) {

ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");

//MessageBean obj = container.getBean(MessageBean.class);
//System.out.println(obj);

//MessageBean obj2 = (MessageBean) container.getBean("firstmsg");
//System.out.println(obj2);

//obj.setSender("Mrunal");
//System.out.println("obj2="+obj2);
	
MessageBean obj = (MessageBean) container.getBean("autowiringmsg");
System.out.println(obj +" " +obj.getReceiverInfo());


}

}
