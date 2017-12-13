package test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class Client 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("resources/Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t =s.beginTransaction();
		System.out.println("DDL create Operation successful");
		
		try {
			  Thread.sleep(1*1000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		sf.close();
		t.commit();
		
		System.out.println("Table drop successfull");
		//create-drop is useful in testing while shut down all tables will be deleted automatically
    }
}