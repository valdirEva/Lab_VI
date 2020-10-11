package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.CadastroRg;

public class CadastroRgTest{
	
	CadastroRg rg = new CadastroRg();
	
	//Partição 1 tamanho do RG igual a 11 caracteres
	@Test
	public void validarRgTamanho1(){
		
		assertEquals (true, rg.isValidaRG("12864011-28"));

	}
	
	//Partição 2 tamanho do RG menor que  11 caracteres
	@Test
	public void validarRgTamanho2(){
		
		assertEquals (false, rg.isValidaRG("128"));

	}
	
	//Partição 3 tamanho do RG maior que  11 caracteres
	@Test
	public void validarRgTamanho3(){
		
		assertEquals (false, rg.isValidaRG("12864011-288"));

	}
	
	//Partição 4 RG vazio.
	@Test
	public void validarRgVazio(){
		
		assertEquals (false, rg.isValidaRG(""));

	}
	
	//Partição 4 RG null.
	@Test
	public void validarRgNull(){
		
		assertEquals (false, rg.isValidaRG("null"));

	}
	
	
}