package com.hib;

import java.math.BigDecimal;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.entity.Employee;
import com.hib.entity.UserLogInf;
import com.hib.entity.msdb.UserAddress;
import com.hib.entity.msdb.UserInfo;


public class HibernateApp {

	public static void main(String[] args) {
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YY");
		sdf.format(dt);
		
		Session session= HibernareUtil.getSession();
		HibernateServiceImpl hibserv=new HibernateServiceImpl();
	List<UserInfo> list=	(List) hibserv.getRecord("UserName from UserNamefrom UserInfovun", session);
		for(UserInfo u: list){
			System.out.println(u.getUserName());
			//System.out.println(u.getUserCode());
		}
		/*UserAddress user=(UserAddress) session.get(UserAddress.class, new BigDecimal("123"));
		System.out.println(user.getMobie());
		*/
		
		
		
		
		/*Employee emp_Obj=new Employee();
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
		session.save(userLoginf);*/
		
		//tx.commit();
		session.close();
		
		
		
	}

}
