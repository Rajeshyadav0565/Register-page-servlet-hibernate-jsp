package com.raj.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.raj.entity.Employee;

public class EmployeeDao {
	
	private SessionFactory sessionFactory;

	public EmployeeDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	public boolean saveEmployee(Employee employee) {
		boolean isSave = false;
		
		try(Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			long result =(Long)session.save(employee);
			session.getTransaction().commit();
			if(result>0) {
				isSave = true;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
		return isSave;
	}
	

}
