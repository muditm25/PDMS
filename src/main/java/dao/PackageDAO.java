package dao;

import java.util.List;

import org.hibernate.Session;

import bean.Package;
import bean.Student;
import iiitb.com.PDMS.CommonSessionFactory;

public class PackageDAO {
	
public static List<Package> getAllPackages(int id){
		
		Session ses = CommonSessionFactory.sf.openSession();
		
		List<Package> pkglist = ses.createNativeQuery("select * from package where stud_id="+id,Package.class).list();
		
		ses.close();
		System.out.print(pkglist.toString());
		return pkglist;
		
	}

public static String addPackage(Package pkg, int stud_id) {
	Session ses = CommonSessionFactory.sf.openSession();
	
	try {
		ses.beginTransaction();
		
		Student s1 = (Student)ses.get(Student.class, stud_id);
		List<Package> pkgs = s1.getPackages();
	
		pkgs.add(pkg);
		s1.setPackages(pkgs);
		ses.save(s1);
		Integer id = (Integer) ses.save(pkg);
		if(id>0)
			return "success";
		else
			return "failure";
	}finally {
		ses.getTransaction().commit();
		ses.close();
	} 
}
}
