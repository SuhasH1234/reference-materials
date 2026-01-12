package DemoHib.DemoHib_01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AppMappingRelations {
	public static void main(String[] args) {
		
		Laptop laptop= new Laptop();
		laptop.setLid(101);
		laptop.setLname("HP");
		
		Employee employee= new Employee();
		employee.setRollno(111);
		employee.setName("Suhas");
		employee.setSalary(1000000);
		employee.setLaptop(laptop);	//OneToOne
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties())
                .build();

        SessionFactory sf = con.buildSessionFactory(reg);

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        session.persist(laptop);
        session.persist(employee);
        
        session.getTransaction().commit();
	}
}
