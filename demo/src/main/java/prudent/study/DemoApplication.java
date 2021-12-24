package prudent.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import prudent.study.beans.BookBean;


public class DemoApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.scan("prudent.study","prudent.study.beans");
		container.refresh();
		
		BookBean obj =  container.getBean(BookBean.class);
		System.out.println(obj.getBookName()+"  "+obj.getAuthor());
		
	}

}
