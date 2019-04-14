package bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ses = sf.openSession();
		ses.beginTransaction();
		
		Student s1 = new Student("MT2018124","Teegala.Sarika@iiitb.org","Teegala Sarika","8840074454");
		Student s2 = new Student("MT2018005","Akruti.Chavre@iiitb.org","Akruti Chavre","7583047072");
		Student s3 = new Student("MT2018065","Mudit.Mittal@iiitb.org","Mudit Mittal","7017834153");
		ses.save(s1);
		ses.save(s2);
		ses.save(s3);
		ses.getTransaction().commit();
		ses.close();

	}

}
