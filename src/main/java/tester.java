import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//data insertion

public class tester 
{


		public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter how many values u want to enter: ");
			int i = scanner.nextInt();
			
			while(i!=0) 
			{
			
			Configuration configuration=new Configuration();
			configuration.configure("hibernate.cfg.xml");
			
			SessionFactory factory=configuration.buildSessionFactory();
			Session  session=factory.openSession();   
			Transaction transaction=session.beginTransaction(); 
			
				System.out.print("Enter value for name field:  ");
				String o = scanner.next();
				
				student student =new student();
				//student.setName(o);
				student.setName(o);
				session.save(student);
				transaction.commit();
				session.close();
				factory.close();
				System.out.println("Data Inserted Successfully");
				i--;
				
			}
		}
}

