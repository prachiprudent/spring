package prudent.study;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;

import study.entity.StudentEntity;

public class HibernateApplication {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory =null;
		
		
        StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
             // Create MetadataSources
             MetadataSources sources = new MetadataSources(registry);
             // Create Metadata
             Metadata metadata = sources.getMetadataBuilder().build();
             // Create SessionFactory
             sessionFactory= metadata.getSessionFactoryBuilder().build();
        
             Session session = sessionFactory.openSession();
             // start a transaction
             Transaction transaction = session.beginTransaction();
             // save the student objects
             
             StudentEntity obj = new StudentEntity();
             obj.setRollNumber(1);
             obj.setStudentName("prachi");
             session.save(obj);   //record is inserted in the table
             
             // commit transaction
             transaction.commit();
     	     
 
	}//end of main
	
}//end of class

		
		
	
	
	
		
		
