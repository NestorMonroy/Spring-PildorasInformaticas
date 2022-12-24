package mx.nestor.spring.mvc.validacionespersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CPostalMadridValidacion.class) //futura clase que contendra la logica de la validacion
@Target({ElementType.METHOD, ElementType.FIELD}) //Destino de la validacion a metodos o campos
@Retention(RetentionPolicy.RUNTIME)//chequea la anotacion en tiempo de ejecucion
public @interface CPostalMadrid {
	//definir el c postal por defecto
	public String value() default "28";	
	//definir el mensaje de error
	public String message() default "El C. Postal debe de comenzar por 28";
	//definir los grupos
	Class<?>[] groups() default {};
	//definir los payloads
	Class<? extends Payload>[] payload() default {};
}
