package DemoHib.DemoHib_01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AppFetchData {	//fetch data from db using hibernate
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Student s = null;

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);

        ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties())
                .build();

        SessionFactory sf = con.buildSessionFactory(reg);

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        s= (Student) session.get(Student.class, 1);
        
        tx.commit();
        session.close();
        sf.close();

        System.out.println("Student fetched successfully!");
        System.out.println(s);
    }
}
