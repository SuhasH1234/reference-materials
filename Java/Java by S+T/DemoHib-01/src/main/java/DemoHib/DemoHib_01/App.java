package DemoHib.DemoHib_01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {	//insert values to db using Hibernate
    public static void main(String[] args) {
        Student s = new Student();
        s.setSid(5);
        s.setSname("Dog1");
        s.setEmail("dog1@gmail.com");
        s.setAddress("Bangalore");
        s.setAdmission(2020);

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);

        ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties())
                .build();

        SessionFactory sf = con.buildSessionFactory(reg);

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(s);

        tx.commit();
        session.close();
        sf.close();

        System.out.println("Student saved successfully!");
        System.out.println(s);
    }
}
