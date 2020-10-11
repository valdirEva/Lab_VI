package model;

public class CadastroRg {
	public boolean isValidaRG(String rg){

		if((rg== null) ||(rg.length()!=11)|| (rg.isEmpty())){

			return false;

		}
		

		return true;
	}
}