package prudent.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import prudent.study.beans.PersonBean;


public class JavaConfigExampleApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
		PersonBean person = container.getBean(PersonBean.class);
		System.out.println(person.getName()+"  "+person.getBloodGroup());
	}

}
