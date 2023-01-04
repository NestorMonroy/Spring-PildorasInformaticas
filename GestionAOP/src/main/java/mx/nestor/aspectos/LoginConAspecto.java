package mx.nestor.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginConAspecto {
	
	//@Before("execution(public void mx.nestor.aop.dao.ClienteVIPDAO.insertaCliente())")
	//@Before("execution(public String insertaCliente*())")
	//@Before("execution(public * insertaCliente*())")
	//@Before("execution(public * insertaCliente*(mx.nestor.aop.Cliente))")
	
	//@Before("execution(public * insertaCliente*(mx.nestor.aop.Cliente, ..))")
	
	
	@Pointcut("execution(public * insertaCliente(..))")
	//@Pointcut("execution(* mx.nestor.aop.dao.*.*(..))")
	private void paraClientes() {};
	
	@Before("paraClientes()")
	public void antesInsertarCliente() {
		System.out.println("El usuario esta logeado");
		
		System.out.println("El perfil para insertar clientes es correcto");
	}
	
	@Before("paraClientes()")
	public void requisitosCliente() {
		System.out.println("El cliente cumple los requisitos");
	}
	
	@Before("paraClientes()")
	public void requisitosTabla() {
		System.out.println("hay menos de 3000 registros");
	}

}
