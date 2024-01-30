import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class datadisplay {

	public static void main(String[] args) 
	{
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session  session=factory.openSession();   
		Query query=session.createQuery("FROM student");
		List<student> list=query.list();
		for(student student:list)
		{
			System.out.println(student.getId()+"   "+student.getName()+"  "); 
		}
		
	}

}
