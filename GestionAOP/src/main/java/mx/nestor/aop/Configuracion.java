package mx.nestor.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy //Indica que utilizamos la AOP
@ComponentScan("mx.nestor.aop")
public class Configuracion {
	
}
