package com.hib;

import org.hibernate.Session;

public class HibernateServiceImpl {
	public void save(){
		
	}
	public Object getRecord(String query,Session session ){
		
		return 	session.createQuery(query).list();
	}
	
	public void update(){
		
	}
	public void delete(){
		
	}

}
