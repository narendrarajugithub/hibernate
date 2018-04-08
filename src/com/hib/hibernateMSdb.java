package com.hib;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Condition;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.entity.msdb.NaUserAuth;
import com.hib.entity.msdb.UserAddress;
import com.hib.entity.msdb.UserInfo;

public class hibernateMSdb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s=  "jdbc:sqlserver://localhost:1433;" +"user=sa;password=Raja!123;"+"databaseName=narendra;integratedSecurity=true;";
		Configuration cfg=new Configuration();
	Session sobj=cfg.configure("hibernateMsdb.cfg.xml").buildSessionFactory().openSession();
	
	Date d= new Date();
	SimpleDateFormat sm=new SimpleDateFormat("dd-MM-yy");
	
	NaUserAuth nUser=new NaUserAuth();
	nUser.setCreatedOn(d);
	nUser.setUserId("naren_y");
	nUser.setUserMobileNo(new BigDecimal(9989564577l));
	nUser.setUserPassword("narendra@123");
	Set<NaUserAuth> setnaUser=new HashSet<NaUserAuth>(); 
	
	
	UserInfo userInf=new UserInfo();
	//userInf.setUserCode(123567l);
	userInf.setUserName("Nrendr");
	userInf.setUserYype("Regular");
	
	
	
	UserAddress UsrAddr=new UserAddress();
	UsrAddr.setCity("hyderabad");
	UsrAddr.setMobie(new BigDecimal(9989564577l));
	UsrAddr.setState("TS");
	UsrAddr.setUserCode(new BigDecimal(123));
	UsrAddr.setUserInfo(userInf);
	userInf.setUserAddress(UsrAddr);
	
	nUser.setUserInfo(userInf);
	setnaUser.add(nUser);
	userInf.setNaUserAuths(setnaUser);
	
	Transaction tx=sobj.beginTransaction();
	System.out.println(sobj.save(UsrAddr));
	//sobj.save(nUser);
	tx.commit();
	sobj.close();
	}

}
