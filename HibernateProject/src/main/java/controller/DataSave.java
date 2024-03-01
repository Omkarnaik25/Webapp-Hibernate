package controller;



import org.hibernate.Session;
import org.hibernate.Transaction;

import Dao.HibernateUtil;
import modal.Student;

public class DataSave {

	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		
Student s1=new Student();
		
		s1.setFname("Ram");
		s1.setLname("Bahadur");
		s1.setRollno(1);
		s1.setAddress("Pune");
		s1.setPassword("ram@123");
		
		session.save(s1);
		transaction.commit();
	}

}
