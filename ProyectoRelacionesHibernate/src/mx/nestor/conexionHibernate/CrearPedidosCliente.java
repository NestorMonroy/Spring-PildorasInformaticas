package mx.nestor.conexionHibernate;

import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrearPedidosCliente {
	public static void main(String[] args) {
		//Crear el SessionFactory
		SessionFactory miFactory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Cliente.class)
											.addAnnotatedClass(DetallesCliente.class)
											.addAnnotatedClass(Pedido.class)
											.buildSessionFactory();
		//Crear objeto session
		Session miSession=miFactory.openSession();
		
		try {

			miSession.beginTransaction();
			
			//Obtener el cliente de la tabla cliente de la BBDD
			Cliente elCliente = miSession.get(Cliente.class, 5);
			
			//Crear Pedidos del cliente
			Pedido pedido1 = new Pedido( new GregorianCalendar(2020,7,5));
			Pedido pedido2 = new Pedido( new GregorianCalendar(2020,6,15));
			Pedido pedido3 = new Pedido( new GregorianCalendar(2020,4,25));
			
			//Agregar pedidos creados al cliente creado
			
			elCliente.agregarPedido(pedido1);
			elCliente.agregarPedido(pedido2);
			elCliente.agregarPedido(pedido3);
			
			//guardar los pedidos en la BBDD en la tabla pedido
			
			miSession.save(pedido1);
			miSession.save(pedido2);
			miSession.save(pedido3);
			
			miSession.getTransaction().commit();
			
			System.out.println("Registros insertados en BBDD");
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			miSession.close();
			miFactory.close();
		}
	}
	
}
