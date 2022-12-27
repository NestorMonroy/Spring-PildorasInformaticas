package mx.nestor.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ActualizaClientes {

	public static void main(String[] args) {

		//Crear el SessionFactory
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		//Crear objeto session
		Session miSession=miFactory.openSession();
		
		try {
			
			//int ClienteId=1;
			
			miSession.beginTransaction();
	
			//Clientes miCliente = miSession.get(Clientes.class, ClienteId);
			
			//miCliente.setNombre("Juan");
			
			//miSession.createQuery("update Clientes set apellidos='Dominguez' where apellidos LIKE 'M%' ").executeUpdate();			
			miSession.createQuery("delete Clientes where direccion ='Goya' ").executeUpdate();
			miSession.getTransaction().commit();
			
			System.out.println("Registro actualizado en BBDD");

			//Lectura de registro
			
			
			
			System.out.println("Terminado");
			
			miSession.close();
			
		} finally {
			// TODO: handle finally clause
			miFactory.close();
		}
	}

}
