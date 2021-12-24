package prudent.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import prudent.study.beans.PersonBean;

@Configuration
public class JavaConfiguration {

	@Bean
	public PersonBean  personFactory()
	{
		/*
		System.out.println("person factory method");
		PersonBean obj = new PersonBean();
		obj.setName("vidya");
		obj.setBloodGroup("A+ve");
		return obj;
		*/
		
		return new PersonBean("janhavi","B+ve");
		
	}
	
	
	
}
