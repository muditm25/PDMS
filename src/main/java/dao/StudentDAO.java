package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import bean.Student;
import iiitb.com.PDMS.CommonSessionFactory;

public class StudentDAO {
	
	public static List<Student> getAllStudents(){
		
		Session ses = CommonSessionFactory.sf.openSession();
		
		List<Student> studlist = ses.createNativeQuery("select * from student",Student.class).list();
		for(Student s: studlist)
		{
			Hibernate.initialize(s.getPackages());
		}
		ses.close();
		
		return studlist;
		
	}

	public static List<Student> getStudent(int id) {
		Session ses = CommonSessionFactory.sf.openSession();
		
		List<Student> studlist = ses.createNativeQuery("select * from student where id="+id,Student.class).list();
		for(Student s: studlist)
		{
			Hibernate.initialize(s.getPackages());
		}
		ses.close();
		
		return studlist;
	}
}
