package mx.nestor.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//leer el xml de configuracion
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Leer el class de configuracion 
		
		AnnotationConfigApplicationContext contexto= new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		/*
		///pedir el NUEVO bean CREADO
		//EL id del bean corresponde al metodo creado
		
		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInformes());

		 */
		
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println("Email "+ empleado.getEmail());
		
		System.out.println("Empresa "+ empleado.getNombreEmpresa());
		
		/*
		Empleados Nestor=contexto.getBean("comercialExperimentado", Empleados.class);
		
		Empleados Lucia=contexto.getBean("comercialExperimentado", Empleados.class);

		//Apuntan al mismo objeto en memoria
		
		if(Nestor ==Lucia) {
			System.out.println("Apuntan el mismo lugar de memoria");
			System.out.println(Nestor + "\n" + Lucia);
		}else {
			System.out.println("NO Apuntan el mismo lugar de memoria");
			System.out.println(Nestor + "\n" + Lucia);
		}
		
		*/
		//cerrar el contexto
		contexto.close();
	}

}
