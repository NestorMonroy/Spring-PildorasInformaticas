package mx.nestor.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GuardaCLientePrueba {

	public static void main(String[] args) {

		//Crear el SessionFactory
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		//Crear objeto session
		Session miSession=miFactory.openSession();
		
		try {
			//Crear el objeto clientes
			Clientes cliente1 = new Clientes("Nestor", "Monroy", "Gran Via");
			
			//Ejecutar la transaccion
			
			miSession.beginTransaction();
			
			miSession.save(cliente1);
			
			miSession.getTransaction().commit();
			
			System.out.println("Registro insertado en BBDD");

			//Lectura de registro
			
			miSession.beginTransaction();
			
			System.out.println("Lectura con registro con Id: " + cliente1.getId());
			
			Clientes clienteInsertado = miSession.get(Clientes.class, cliente1.getId());
			
			System.out.println("Registro: "+ clienteInsertado);
			
			miSession.getTransaction().commit();
			
			System.out.println("Terminado");
			
			miSession.close();
			
		} finally {
			// TODO: handle finally clause
			miFactory.close();
		}
	}

}
