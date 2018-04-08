package com.hib;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernareUtil {
	private static  Session session;
	
	public static Session getSession(){
		
		if(session==null){
			Configuration cfg=new Configuration();
			cfg.configure("hibernateMsdb.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			session=sf.openSession();
			System.out.println("-----------------");
			}
		
		return session;	
	}
	
	

}
