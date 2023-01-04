package mx.nestor.aop.dao;

import org.springframework.stereotype.Component;

import mx.nestor.aop.Cliente;

@Component
public class ClienteDAO {
	
	public void insertaCliente(Cliente elCliente, String tipo) {
		System.out.println("Trabajo realizado OK, cliente insertado con exito");
	}
}
