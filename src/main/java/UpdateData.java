import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData 
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
		student employee=session.get(student.class, id);
		System.out.println("Enter Name");
		employee.setName(scanner.next());
		session.save(employee);
		transaction.commit();
		session.close();
		System.out.println("Data Updated Successfully");
	}

}
