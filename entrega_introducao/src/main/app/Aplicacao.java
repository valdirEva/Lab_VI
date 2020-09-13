package app;
import model.CadastroRg;
public class Aplicacao {

	public static void main(String[] args) {
		CadastroRg rg = new CadastroRg();
		System.out.print(rg.isValidaRG("12864011-28"));

	}

}