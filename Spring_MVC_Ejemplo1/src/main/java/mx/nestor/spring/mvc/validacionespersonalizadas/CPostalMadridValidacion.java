package mx.nestor.spring.mvc.validacionespersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid,String>{
	
	private String prefijoCodigoMadrid;
	
	@Override
	public void initialize(CPostalMadrid elCodigo) {
		prefijoCodigoMadrid=elCodigo.value();
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		
		boolean valCodigo;
		
		if(arg0!= null) valCodigo =arg0.startsWith(prefijoCodigoMadrid);
		else return valCodigo=true;
		
		
		return valCodigo;
	}

}
