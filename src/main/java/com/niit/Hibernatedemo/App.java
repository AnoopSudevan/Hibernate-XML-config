package com.niit.Hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.niit.Hibernatedemo.model.Employee;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Employee e = new Employee();
		e.setEmpname("Ef");
		e.setDesignation("PA");
		e.setDept("HR");
		Session s=sessionFactory.openSession();
		org.hibernate.Transaction txt=s.beginTransaction();
		s.save(e);
		txt.commit();
		s.close();
		sessionFactory.close();
 
    }
}
