package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.CadastroRg;

public class CadastroRgTest{
	
	@Test
	public void validarRg(){
		CadastroRg rg = new CadastroRg();
		
		assertEquals (true, rg.isValidaRG("12864011-28"));
		assertEquals (false, rg.isValidaRG(""));
		assertEquals (false, rg.isValidaRG(null));
		
		
	}
	
	
}