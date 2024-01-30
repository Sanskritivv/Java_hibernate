import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Deletedata 
{

	public static void main(String[] args) 
	{
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session  session=factory.openSession();   
		Transaction transaction=session.beginTransaction();          
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Id");
		int id=scanner.nextInt();
		student student=session.get(student.class, id);
		session.delete(student);
		transaction.commit();
		session.close();
		System.out.println("Data Deleted Successfully");
	}

}
