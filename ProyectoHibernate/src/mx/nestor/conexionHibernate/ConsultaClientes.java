package mx.nestor.conexionHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaClientes {

	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		Session miSession=miFactory.openSession();
		
		try {
			
			//comenzar session
			miSession.beginTransaction();

			// consulta de clientes
			
			List<Clientes> losClientes = miSession.createQuery("from Clientes").getResultList();
			
			//mostrar los clientes
			
			recorreClientesConsultados(losClientes);
			
			//consulta: dame los Gomez

			losClientes = miSession.createQuery("from Clientes c where c.apellidos='Gomez'").getResultList();
			
			// mostrar los gomez
			
			recorreClientesConsultados(losClientes);
			
			
			//muestra los que viven en gran via o se appellidan delgado
			
			losClientes = miSession.createQuery("from Clientes c where c.apellidos='Delgado'"
					+ "or c.direccion='Gran Via'").getResultList();
			
			
			recorreClientesConsultados(losClientes);
			
			
			miSession.getTransaction().commit();
			
			System.out.println("Terminado");
			//Cerrar la sesion
			miSession.close();
			
		} finally {
			miFactory.close();

		}

	}

	private static void recorreClientesConsultados(List<Clientes> losClientes) {
		for(Clientes unCliente:losClientes) {
			System.out.println(unCliente);
		}
	}

}
