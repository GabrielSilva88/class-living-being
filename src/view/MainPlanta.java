package view;

import model.Planta;

public class MainPlanta{
	/* 
	 	Classe Planta:
	Crie uma classe Planta que herda da classe SerVivo. 
	Adicione um atributo tipo e um método para realizar a fotossíntese. 
	
	*/
	public static void main(String[] args) {
		
		Planta pl = new Planta();
		
		pl.setNome("Roseira");
		pl.setTipo("Rosa");
		
		System.out.println(pl.fotossintese());
	}	
}
