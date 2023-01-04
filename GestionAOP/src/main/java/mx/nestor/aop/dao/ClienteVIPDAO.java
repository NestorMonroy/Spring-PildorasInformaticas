package mx.nestor.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class ClienteVIPDAO {
	
	public void insertaCliente() {
		System.out.println("Trabajo realizado OK, cliente VIP insertado con exito");
	}
}
