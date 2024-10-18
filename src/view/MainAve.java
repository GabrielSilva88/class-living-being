package view;

import model.Ave;

public class MainAve {
	/*
	 * Classe Ave: 
	 * Crie uma classe Ave que herda da classe SerVivo. 
	 * Adicione um atributo tipoDeBico e um método para voar.
	 */
	public static void main(String[] args) {
		
		Ave ave = new Ave();
		
		ave.setTipoDeBico("curvo");
		ave.setNome("Papagaio");
		
		ave.voar();
		
		System.out.println(ave.voar());
	}
}
