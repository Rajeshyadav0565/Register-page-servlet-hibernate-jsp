package com.raj.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.raj.entity.Employee;



public class HibernateUtil {
	
	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;
	
	static {
		try {
			StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder().loadProperties("hibernate.properties");
			
			standardServiceRegistry = standardServiceRegistryBuilder.build();
			
			MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
			metadataSources.addAnnotatedClass(Employee.class);
			
			Metadata metadata = metadataSources.buildMetadata();
			
			sessionFactory = metadata.getSessionFactoryBuilder().build();
			
		} catch (Exception e) {
			e.printStackTrace();
			if(standardServiceRegistry != null) {
				StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
			}
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
