package com.hib;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.entity.Employee;
import com.hib.entity.UserLogInf;


public class HibernateApp {

	public static void main(String[] args) {
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YY");
		sdf.format(dt);
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		Session session=cfg.buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Employee emp_Obj=new Employee();
		emp_Obj.setEmpSeq(125614);
		emp_Obj.setEmpName("krish");
		emp_Obj.setCreatedOn(dt);
		//emp_Obj.setUserLogInf(userLoginf);
		
		UserLogInf userLoginf=new UserLogInf();
		userLoginf.setCreatedOn(dt);
		userLoginf.setUserNameS("krese");
		userLoginf.setUserSeq(1256478);
		userLoginf.setEmployee(emp_Obj);
		
		
		session.save(emp_Obj);
		session.save(userLoginf);
		
		tx.commit();
		session.close();
		
		
		
	}

}
