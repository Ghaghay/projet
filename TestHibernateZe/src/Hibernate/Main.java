package Hibernate;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {

	public static void main(String[] args) {

		System.out.println("Hibernate One-To-One example (Annotation)");
//		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

//		EmployeDetail employeeDetail = new EmployeDetail("10th Street", "LA", "San Francisco", "U.S.");
//		
//		Employe employee = new Employe("Nina", "Mayers", new Date(121212),
//				"114-857-965");
//		employee.setEmployeeDetail(employeeDetail);
//		
//		
//		session.save(employee);
//
//		
//		List<Employe> employees = session.createQuery("from Employe").list();
//		for (Employe employee1 : employees) {
//			System.out.println(employee1.getFirstname() + " , "
//					+ employee1.getLastname() + ", "
//					+ employee1.getEmployeeDetail().getState());
//		}
		
		Client client = new Client();
		client.setId(1);
		client.setNom("ZE");
		session.save(client);
		
		session.getTransaction().commit();
		session.close();

	}

}
