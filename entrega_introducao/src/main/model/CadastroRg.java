package model;

public class CadastroRg {
	public boolean isValidaRG(String rg){

		if((rg== null) ){

			return false;

		}
		if(rg.length()!=11){

			return false;

		}
		if(rg.isEmpty()){

			return false;

		}

		return true;
	}
}